package com.darwel.notificaciones;

import android.os.Bundle;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	Button boton;
	NotificationManager notMan;
	private static final int unico = 4500;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        notMan = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        boton = (Button) findViewById(R.id.enviar);
        notMan.cancel(unico);
        
        boton.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(this,MainActivity.class);
		PendingIntent penint = PendingIntent.getActivity(this, 0, intent, 0);
		
		String aviso = "Notificacion";
		String texto = "Si funciono";
		
		Notification notification = new Notification(R.drawable.ic_launcher, aviso, System.currentTimeMillis());
		
		notification.setLatestEventInfo(this, texto, aviso, penint);
		notification.defaults = Notification.DEFAULT_ALL;
		
		notMan.notify(unico, notification);
		
		finish();
	}
    
}
