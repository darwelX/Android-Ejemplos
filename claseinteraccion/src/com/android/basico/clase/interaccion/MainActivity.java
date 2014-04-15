package com.android.basico.clase.interaccion;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;

public class MainActivity extends Activity implements OnClickListener{

	Button btn_enviar, btn_mensaje;
	TextView txt_nombre;
	EditText edt_text;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_enviar = (Button) findViewById(R.id.btn_enviar);
        btn_mensaje = (Button) findViewById(R.id.btn_mensaje);
        txt_nombre = (TextView) findViewById(R.id.txt_nombre);
        edt_text = (EditText) findViewById(R.id.edt_text);
        
        btn_enviar.setOnClickListener(this);
        btn_mensaje.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn_enviar:
			String tx = edt_text.getText().toString();
			txt_nombre.setText(tx);
			break;
		
		case R.id.btn_mensaje:
			Intent intent = new Intent("android.intent.action.SEGUNDAACTIVITY");
			String txt_enviar = edt_text.getText().toString();
			intent.putExtra("txt_nombre", txt_enviar);
			startActivity(intent);
			//Toast.makeText(this, "Hola como estas", Toast.LENGTH_LONG).show();
			break;
			
		default:
			break;
		}
	}
    
}
