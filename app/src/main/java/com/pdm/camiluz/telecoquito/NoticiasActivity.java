package com.pdm.camiluz.telecoquito;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class NoticiasActivity extends AppCompatActivity {

    private static final String urlNoticias = "http://m.eltiempo.com/noticias/telecomunicaciones";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticias);

        WebView wvNoticias = (WebView) findViewById(R.id.wvNoticias);
        wvNoticias.getSettings().setJavaScriptEnabled(true);
        wvNoticias.getSettings().setBuiltInZoomControls(true);
        wvNoticias.loadUrl(urlNoticias);

        wvNoticias.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                return false;
            }
        });




    }
}
