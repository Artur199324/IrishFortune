package com.brave.browse;

import android.app.Application;

import androidx.lifecycle.ViewModelProvider;

public class AppIF extends Application {
   public static VieModIF vieModIF;
    @Override
    public void onCreate() {
        super.onCreate();
        vieModIF = new ViewModelProvider
                .AndroidViewModelFactory(this)
                .create(VieModIF.class);
        vieModIF.ffd();
    }
}
