package com.brave.browse;

import static com.brave.browse.RulesIF.parseIF;

import android.app.Application;
import android.util.Log;

import androidx.annotation.Nullable;

;import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;

public class FBIF {

    public static String cdscvs = null;
    public static String bgfs = "-";
    Application application;
    private IF iff;

    public IF getIff() {
        return iff;
    }

    public void setIff(IF iff) {
        this.iff = iff;
    }

    public FBIF(Application application) {
        this.application = application;
    }



    public void fbif(){

        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.fullyInitialize();
        AppEventsLogger.activateApp(application);
        AppLinkData.fetchDeferredAppLinkData(iff.getApplicationContext(), new AppLinkData.CompletionHandler() {
            @Override
            public void onDeferredAppLinkDataFetched(@Nullable AppLinkData appLinkData) {
                if (appLinkData == null) {
                    appLinkData = AppLinkData.createFromActivity(iff);

                }
                if (appLinkData != null) {

                    String[] as = appLinkData.getTargetUri().toString().split("://");
                    cdscvs = as[1];
                    bgfs = parseIF(cdscvs);
                    Log.d("weq", cdscvs.toString());

                } else {

                }
            }
        });

    }
}
