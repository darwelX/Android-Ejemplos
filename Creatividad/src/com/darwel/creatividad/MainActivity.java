package com.darwel.creatividad;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        
        String fontPathRB = "fonts/Roboto/Roboto_Black.ttf";
        String fontPath2 = "fonts/Roboto/Roboto-BlackItalic.ttf";
        String fontPath3 = "fonts/Roboto/Roboto-Bold.ttf";
        String fontPath4 = "fonts/Roboto/Roboto-BoldItalic.ttf";
        String fontPath5 = "fonts/Roboto/Roboto-Italic.ttf";
        String fontPath6 = "fonts/Roboto/Roboto-Light.ttf";
        String fontPath7 = "fonts/Roboto/Roboto-LightItalic.ttf";
        String fontPath8 = "fonts/Roboto/Roboto-Medium.ttf";
        String fontPath9 = "fonts/Roboto/Roboto-MediumItalic.ttf";
        String fontPath10 = "fonts/Roboto/Roboto-Regular.ttf";
        String fontPath11 = "fonts/Roboto/Roboto-Thin.ttf";
        String fontPath12 = "fonts/Roboto/Roboto-ThinItalic.ttf";
        
        TextView  txtRB = (TextView)findViewById(R.id.texto);
        TextView  txtRB2 = (TextView)findViewById(R.id.texto2);
        TextView  txtRB3 = (TextView)findViewById(R.id.texto3);
        TextView  txtRB4 = (TextView)findViewById(R.id.texto4);
        TextView  txtRB5 = (TextView)findViewById(R.id.texto5);
        TextView  txtRB6 = (TextView)findViewById(R.id.texto6);
        TextView  txtRB7 = (TextView)findViewById(R.id.texto7);
        TextView  txtRB8 = (TextView)findViewById(R.id.texto8);
        TextView  txtRB9 = (TextView)findViewById(R.id.texto9);
        TextView  txtRB10 = (TextView)findViewById(R.id.texto10);
        TextView  txtRB11 = (TextView)findViewById(R.id.texto11);
        TextView  txtRB12 = (TextView)findViewById(R.id.texto12);
        
        
        Typeface tf;
        
        tf = Typeface.createFromAsset(getAssets(), fontPathRB);
        
        txtRB.setTypeface(tf);
        
        tf = Typeface.createFromAsset(getAssets(), fontPath2);
        
        txtRB2.setTypeface(tf);

        tf = Typeface.createFromAsset(getAssets(), fontPath3);
        
        txtRB3.setTypeface(tf);
        
        tf = Typeface.createFromAsset(getAssets(), fontPath4);
        
        txtRB4.setTypeface(tf);
        
        tf = Typeface.createFromAsset(getAssets(), fontPath5);
        
        txtRB5.setTypeface(tf);
        
        tf = Typeface.createFromAsset(getAssets(), fontPath6);
        
        txtRB6.setTypeface(tf);
        
        tf = Typeface.createFromAsset(getAssets(), fontPath7);
        
        txtRB7.setTypeface(tf);
        
        tf = Typeface.createFromAsset(getAssets(), fontPath8);
        
        txtRB8.setTypeface(tf);
        
        tf = Typeface.createFromAsset(getAssets(), fontPath9);
        
        txtRB9.setTypeface(tf);
        
        tf = Typeface.createFromAsset(getAssets(), fontPath10);
        
        txtRB10.setTypeface(tf);
        
        tf = Typeface.createFromAsset(getAssets(), fontPath11);
        
        txtRB11.setTypeface(tf);
        
        tf = Typeface.createFromAsset(getAssets(), fontPath12);
        
        txtRB12.setTypeface(tf);
    }

    
}
