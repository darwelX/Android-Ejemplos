package com.darwel.webview;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.app.Activity;

public class MainActivity extends Activity {

	private WebView ventana;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ventana = (WebView) findViewById(R.id.webview);
        
        ventana.getSettings().setJavaScriptEnabled(true);
        ventana.getSettings().setBuiltInZoomControls(true);
        //ventana.loadUrl("http://192.168.0.100:8096/pdf/manual_aire_primium.pdf");
        ventana.loadUrl("http://192.168.0.100:8096");
        
        ventana.setWebViewClient(new WebViewClient()
        {
        	public boolean shouldOverrideUrlLoading(WebView view, String url){
        		return false;
        	}
        }
        );
    }
    
}
