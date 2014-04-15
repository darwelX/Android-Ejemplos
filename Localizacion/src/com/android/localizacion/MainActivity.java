package com.android.localizacion;


import java.util.regex.Pattern;

//import com.android.datos.R;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.util.Patterns;
import android.widget.TextView;


public class MainActivity extends Activity {

	TextView text,text2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
		String id = Secure.getString(getBaseContext().getContentResolver(), Secure.ANDROID_ID);	
		//String nombre = Secure.getString(getBaseContext().getContentResolver(), Secure.USE_GOOGLE_MAIL);
		
		/*Pattern emailPattern = Patterns.EMAIL_ADDRESS; // API level 8+
		Account[] accounts = AccountManager.get(getBaseContext()).getAccounts();
		for (Account account : accounts) {
		   
		        String possibleEmail = account.name;
		        System.out.println(possibleEmail);

		}*/
		
        text = (TextView)findViewById(R.id.text);
        text2 = (TextView)findViewById(R.id.text2);
        
        text.setText(id);
        //text2.setText(nombre);
        
	}





}
