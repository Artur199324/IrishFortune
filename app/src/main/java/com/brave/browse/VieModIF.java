package com.brave.browse;

import android.app.Application;
import android.webkit.WebView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class VieModIF extends AndroidViewModel {
    GameIF gameIF;
    ConIF conIF;
    FBIF fbif;
    ApsIF apsIF;
    WebSeIF webSeIF;

    public VieModIF(@NonNull Application application) {
        super(application);
        gameIF = new GameIF();
        conIF = new ConIF();
        fbif = new FBIF(application);
        apsIF = new ApsIF(application);
        webSeIF = new WebSeIF();
    }

    public void gg(ImageView imageView) {
        gameIF.crateIF(imageView);
    }

    public void wh(int h, int w) {
        gameIF.setDsds(h);
        gameIF.setVsdvs(w);
    }

    public void hgf(ImageView imageView) {
        gameIF.jdd(imageView);
    }

    public void jdj(ImageView imageView) {
        gameIF.hfh(imageView);
    }

    public void jdh(ImageView imageView, ImageView imageView1, ImageView imageView2) {
        gameIF.jjj(imageView, imageView1, imageView2);
    }

    public void connN(IF im) {
        conIF.conIf(im);
    }

    public boolean onIn(IF im) {
        boolean aa = conIF.isOn(im);
        return aa;
    }

    public void fbbbif(IF im) {
        fbif.setIff(im);
        fbif.fbif();
    }

    public void ffd() {
        apsIF.jfj();
        apsIF.gf();
        apsIF.hjh();
        apsIF.kgk();
    }

    public void kjl(WebView webViewFullAppIF){
        webSeIF.see(webViewFullAppIF);
    }

}
