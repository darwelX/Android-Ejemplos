package com.android.basico.clase.interaccion;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends Activity{

	String nuevo_texto;
	TextView txt_nombre;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.segundaactivity);
		
		txt_nombre = (TextView) findViewById(R.id.txt_mensaje);
		
		Bundle extras = getIntent().getExtras();
		
		if(extras != null){
			nuevo_texto = extras.getString("txt_nombre");
		}
		
		txt_nombre.setText(nuevo_texto);
	}
}
