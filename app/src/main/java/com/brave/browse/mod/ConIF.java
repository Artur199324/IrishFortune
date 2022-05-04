package com.brave.browse.mod;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;

import androidx.annotation.NonNull;

import com.brave.browse.R;
import com.brave.browse.ac.IF;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

public class ConIF {


    public static String vfd = "-";
    public static String bgftd = "-";



    public ConIF() {
    }

    public String getStatus() {
        return vfd;
    }

    public void setStatus(String status) {
        this.vfd = status;
    }

    public String getUrl() {
        return bgftd;
    }

    public void setUrl(String url) {
        this.bgftd = url;
    }

    public void conIf(IF iff) {

       new Thread(new Runnable() {
           @Override
           public void run() {
               FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
               FirebaseRemoteConfigSettings configSettings = new FirebaseRemoteConfigSettings.Builder()
                       .setMinimumFetchIntervalInSeconds(2500)
                       .build();
               firebaseRemoteConfig.setConfigSettingsAsync(configSettings);
               firebaseRemoteConfig.setDefaultsAsync(R.xml.remote_config_defaults);

               firebaseRemoteConfig.fetchAndActivate()
                       .addOnCompleteListener(iff, new OnCompleteListener<Boolean>() {
                           @Override
                           public void onComplete(@NonNull Task<Boolean> task) {
                               if (task.isSuccessful()) {
                                   boolean updated = task.getResult();
                                   Log.d("weq", "Config params updated: " + updated);
                                   setStatus(firebaseRemoteConfig.getString("status"));
                                   setUrl(firebaseRemoteConfig.getString("url"));

                                   Log.d("weq", vfd);
                                   Log.d("weq", bgftd);
                               } else {

                               }

                           }
                       });
           }
       }).start();

    }


    public boolean isOn(IF iff) {
        String cs = Context.CONNECTIVITY_SERVICE;
        ConnectivityManager cm = (ConnectivityManager) iff.getSystemService(cs);
        if (cm.getActiveNetworkInfo() == null) {
            return false;
        } else {
            return true;
        }
    }


}
