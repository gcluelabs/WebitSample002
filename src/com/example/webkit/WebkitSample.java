package com.example.webkit;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebkitSample extends Activity {
	WebView webView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_webkit_sample);
		
		// WebViewの取得と表示
		webView = (WebView)findViewById(R.id.webview);
		webView.loadUrl("http://www.android.com");
	}
}
