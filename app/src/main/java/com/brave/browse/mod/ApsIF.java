package com.brave.browse.mod;

import static com.brave.browse.ac.RulesIF.decodeIF;
import static com.brave.browse.ac.RulesIF.parseIF;

import android.app.Application;
import android.util.Log;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.onesignal.OneSignal;

import java.io.IOException;
import java.util.Map;

public class ApsIF {

    private Application application;

    public ApsIF(Application application) {
        this.application = application;
    }

    public static String cdsvds;
    public static String bfdesx = "-";
    public static String bfdwax;
    public static String bgfr;
    public static String bbgd = "Ae8pzYhTQeGENLQr7AKBzY";
    public static String bgfds;
    public static String bbff;
    public static String zzs;


    public void jfj(){

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(application);
        OneSignal.setAppId("98909e94-350c-4f09-979e-4d5245ac11ab");
        OneSignal.setExternalUserId(bfdwax);
    }

    public void gf(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    bfdwax = AdvertisingIdClient.getAdvertisingIdInfo(application).getId();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (GooglePlayServicesNotAvailableException e) {
                    e.printStackTrace();
                } catch (GooglePlayServicesRepairableException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void hjh(){
        cdsvds = AppsFlyerLib.getInstance().getAppsFlyerUID(application);
    }

    public void kgk(){

        AppsFlyerLib.getInstance().init(bbgd, new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {
                bfdesx = map.get(decodeIF("YWZfc3RhdHVz")).toString();
                Log.d("weq", bfdesx);
                if (bfdesx.equals(decodeIF("Tm9uLW9yZ2FuaWM="))) {


                    try {
                        bgfds = map.get(decodeIF("Y2FtcGFpZ24=")).toString();
                    } catch (Exception e) {

                    }

                    try {

                        bbff = map.get(decodeIF("bWVkaWFfc291cmNl")).toString();
                    } catch (Exception e) {

                    }

                    try {

                        zzs = map.get(decodeIF("YWZfY2hhbm5lbA==")).toString();
                    } catch (Exception e) {

                    }

                    bgfr = parseIF(bgfds);}
            }

            @Override
            public void onConversionDataFail(String s) {

            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        },application);
        AppsFlyerLib.getInstance().start(application);
    }
}
