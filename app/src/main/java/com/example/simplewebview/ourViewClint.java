package com.example.simplewebview;

import android.webkit.WebView;
import android.webkit.WebViewClient;

class ourViewClint extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
