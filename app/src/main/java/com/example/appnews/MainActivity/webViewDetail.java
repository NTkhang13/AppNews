package com.example.appnews.MainActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.appnews.R;

public class webViewDetail extends AppCompatActivity {
Toolbar toolbar;
WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_detail);

        toolbar=findViewById(R.id.toolbarr);
        webView=findViewById(R.id.webvieww);
        setSupportActionBar(toolbar);
        Intent intent=getIntent();
        String url =intent.getStringExtra("url");
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);


    }





}