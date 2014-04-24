package cvom.android.getos;


import org.w3c.dom.Text;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.MotionEventCompat;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

import com.android.gestos.R;

public class MainActivty extends Activity{

	TextView texto;
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
	}
	
	@Override
	public boolean  onTouchEvent(MotionEvent event){
		
		texto = (TextView)findViewById(R.id.texto);
		
		int action = MotionEventCompat.getActionMasked(event);
		
		switch (action) {
		
		case MotionEvent.ACTION_DOWN:
			texto.setText("Hola mundo");
			Log.d("INFO", "Este es un gesto de que esta bajando");
			return true;
			
		default:
			return super.onTouchEvent(event);
			
			
		}
		
		
	}
}
