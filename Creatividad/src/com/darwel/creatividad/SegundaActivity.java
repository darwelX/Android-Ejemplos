package com.darwel.creatividad;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.segunda_activity);
		
        String fontPath1 = "fonts/RobotoCondensed/RobotoCondensed-Bold.ttf";
        String fontPath2 = "fonts/RobotoCondensed/RobotoCondensed-BoldItalic.ttf";
        String fontPath3 = "fonts/RobotoCondensed/RobotoCondensed-Italic.ttf";
        String fontPath4 = "fonts/RobotoCondensed/RobotoCondensed-Light.ttf";
        String fontPath5 = "fonts/RobotoCondensed/RobotoCondensed-LightItalic.ttf";
        String fontPath6 = "fonts/RobotoCondensed/RobotoCondensed-Regular.ttf";
        
        TextView  txtRB1 = (TextView)findViewById(R.id.textoC1);
        TextView  txtRB2 = (TextView)findViewById(R.id.textoC2);
        TextView  txtRB3 = (TextView)findViewById(R.id.textoC3);
        TextView  txtRB4 = (TextView)findViewById(R.id.textoC4);
        TextView  txtRB5 = (TextView)findViewById(R.id.textoC5);
        TextView  txtRB6 = (TextView)findViewById(R.id.textoC6);
        
        Typeface tf;
        
        tf = Typeface.createFromAsset(getAssets(), fontPath1);
        
        txtRB1.setTypeface(tf);
        
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
	}

}
