package com.android.froyo.idiomas;

import java.util.Locale;

import com.android.idiomasfroyo.*;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener{
	
	TextView text;
	ImageButton botones;
	ImageButton botonin;
	
	
	public void onCreate(Bundle actividades){
		super.onCreate(actividades);
		setContentView(R.layout.main_activity);
		botones = (ImageButton) findViewById(R.id.btnes);
		botones.setOnClickListener(this);
		botonin = (ImageButton) findViewById(R.id.btnen);
		botonin.setOnClickListener(this);
		
	}
	
	public void changeLang(String lang) {
		Locale myLocale = new Locale(lang);
		//saveLocale(lang);
		Locale.setDefault(myLocale);
		android.content.res.Configuration config = new android.content.res.Configuration();
		config.locale = myLocale;
		getBaseContext().getResources().updateConfiguration(config,getBaseContext().getResources().getDisplayMetrics());
		updateTexts();
	}
	

	/*public void saveLocale(String lang) {
		String langPref = "Language";
		SharedPreferences prefs = getSharedPreferences("CommonPrefs",Activity.MODE_PRIVATE);
		SharedPreferences.Editor editor = prefs.edit();
		editor.putString(langPref, lang);
		editor.commit();
	}*/
	

	private void updateTexts() {
		TextView txt_hello =(TextView)findViewById(R.id.texto);
		txt_hello.setText(R.string.saludo);		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch (v.getId()) {
		case R.id.btnes: 
			changeLang("es");
			break;

		case R.id.btnen:
			changeLang("en");
			break;
		default:
			break;
		}
		
		
	}
	
	/*public void loadLocale()
	{
	    String langPref = "Language";
	    SharedPreferences prefs = getSharedPreferences("CommonPrefs", Activity.MODE_PRIVATE);
	    String language = prefs.getString(langPref, "");
	    changeLang(language);
	}*/
}
