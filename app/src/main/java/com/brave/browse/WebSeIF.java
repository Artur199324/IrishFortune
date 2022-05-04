package com.brave.browse;

import static com.brave.browse.RulesIF.decodeIF;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebSeIF {

    public static ValueCallback<Uri> dds;
    public static Uri bgfwd = null;
    public static ValueCallback<Uri[]> bbfdc;
    public static String nnhf;
    public static final int bfds = 1;
    public static IF anIf;

    public void see(WebView webViewFullAppIF) {
        webViewFullAppIF.getSettings().setJavaScriptEnabled(true);
        webViewFullAppIF.getSettings().setDomStorageEnabled(true);
        webViewFullAppIF.getSettings().setLoadWithOverviewMode(true);
        webViewFullAppIF.clearCache(false);
        webViewFullAppIF.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webViewFullAppIF, true);
        webViewFullAppIF.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                if (url.contains(decodeIF("ZXJyb3I9YXBwYWZBczNm")) || url.contains(decodeIF("ZGlzYWJsZWQuaHRtbA=="))) {

                    anIf.startActivity(new Intent(anIf.getApplicationContext(),IFBU.class));
                    anIf.finishAffinity();
                    Log.d("weq","bot");

                }
            }
        });
        webViewFullAppIF.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onShowFileChooser(WebView view,
                                             ValueCallback<Uri[]> filePath,
                                             FileChooserParams fileChooserParams) {
                if (bbfdc != null) {
                    bbfdc.onReceiveValue(null);
                }
                bbfdc = filePath;
                Intent cscsa = new Intent(Intent.ACTION_GET_CONTENT);
                cscsa.addCategory(Intent.CATEGORY_OPENABLE);
                cscsa.setType("*/*");
                Intent[] ggf = new Intent[0];
                Intent bbbbv = new Intent(Intent.ACTION_CHOOSER);
                bbbbv.putExtra(Intent.EXTRA_INTENT, cscsa);
                bbbbv.putExtra(Intent.EXTRA_TITLE, decodeIF("U2VsZWN0IE9wdGlvbjo="));
                bbbbv.putExtra(Intent.EXTRA_INITIAL_INTENTS, ggf);
                anIf.startActivityForResult(bbbbv, 1);
                return true;
            }
        });
    }


}
