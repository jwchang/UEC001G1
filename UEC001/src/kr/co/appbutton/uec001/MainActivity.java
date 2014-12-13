package kr.co.appbutton.uec001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class MainActivity extends  Activity {

	private ImageView iv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); // 타이틀바 없애기
		setContentView(R.layout.activity_main);
		
		iv = (ImageView) findViewById(R.id.imageView1);
		
	    iv.setOnClickListener( new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(i);				
			}
		});
		
		
	}
 
}
