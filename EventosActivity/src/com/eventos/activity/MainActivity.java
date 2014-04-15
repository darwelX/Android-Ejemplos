package com.eventos.activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity implements OnClickListener{

	Button boton1, boton2, boton3, boton4, boton5, boton6, boton7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        boton1 = (Button) findViewById(R.id.boton1);
        boton1.setOnClickListener(this);
        
        boton2 = (Button) findViewById(R.id.boton2);
        boton2.setOnClickListener(this);
        
        boton3 = (Button) findViewById(R.id.boton3);
        boton3.setOnClickListener(this);
        
        boton4 = (Button) findViewById(R.id.boton4);
        boton4.setOnClickListener(this);
        
        boton5 = (Button) findViewById(R.id.boton5);
        boton5.setOnClickListener(this);
        
        boton6 = (Button) findViewById(R.id.boton6);
        boton6.setOnClickListener(this);
        
        boton7 = (Button) findViewById(R.id.boton7);
        boton7.setOnClickListener(this);
        
        System.out.println("onCreate");
        
    	Toast mensaje = Toast.makeText(this, "Activity Inicializado..!!", Toast.LENGTH_LONG);
    	mensaje.show();
    }

    @Override
    protected void onStart() {
    	// TODO Auto-generated method stub
    	super.onStart();
    	System.out.println("onStart");
    	
    	Toast mensaje = Toast.makeText(this, "Mostrandose Activity..!!", Toast.LENGTH_LONG);
    	mensaje.show();
    }
    
    @Override
    protected void onResume() {
    	// TODO Auto-generated method stub
    	super.onResume();
    	System.out.println("onResume");
    	
    	Toast mensaje = Toast.makeText(this, "Activity Cargado..!!", Toast.LENGTH_LONG);
    	mensaje.show();
    }
    
    @Override
    protected void onPause() {
    	// TODO Auto-generated method stub
    	super.onPause();
    	System.out.println("onPause");
    }
    
    @Override
    protected void onStop() {
    	// TODO Auto-generated method stub
    	super.onStop();
    	System.out.println("onStop");
    	
    	Toast mensaje = Toast.makeText(this, "Adios..!!", Toast.LENGTH_LONG);
    	mensaje.show();
    }
    
    @Override
    protected void onRestart() {
    	// TODO Auto-generated method stub
    	super.onRestart();
    	System.out.println("onRestart");
    }
    
    @Override
    protected void onDestroy() {
    	// TODO Auto-generated method stub
    	super.onDestroy();
    	System.out.println("onDestroy");
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.boton1:
            System.out.println("boton 1");
			break;
			
		case R.id.boton2:
			System.out.println("boton 2");
			this.onStart();
			break;
			
		case R.id.boton3:
			System.out.println("boton 3");
			break;

		case R.id.boton4:
			System.out.println("boton 4");
			break;
			
		case R.id.boton5:
			System.out.println("boton 5");
			break;
			
		case R.id.boton6:
			System.out.println("boton 6");
			break;
			
		case R.id.boton7:
			System.out.println("boton 7");
			break;

		default:
			break;
		}
	}
}
