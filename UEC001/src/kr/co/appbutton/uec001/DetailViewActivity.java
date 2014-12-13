package kr.co.appbutton.uec001;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class DetailViewActivity extends Activity {

	private ImageView iv;
	private int cp = 0;
	private int imgid;
	private Button prebtn;
	private Button nextbtn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); // 타이틀바 없애기
		setContentView(R.layout.activity_detail_view);
		
		iv = (ImageView) findViewById(R.id.imageView3 );
		try {
           
	       Intent intent = getIntent(); // 값을 받아온다.
	       imgid = intent.getIntExtra("param1", 0 );
	       cp    = intent.getIntExtra("param2", 0 );
	        
		   BitmapDrawable dr = (BitmapDrawable) getResources().getDrawable( imgid );	
 		   iv.setImageDrawable(dr);
 		   
		} catch ( Exception e) {
			Log.e("Error", "Error:"+e);
		}
		
		prebtn   = (Button) findViewById(R.id.prebutton1);
		nextbtn  = (Button) findViewById(R.id.nextbutton2 );
		
		prebtn.setOnClickListener( new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				cp = cp - 1;
				if ( cp < 0 ) {
					cp = 22;
				}
                switch ( cp ) {
                case 0  :  imgid =  R.drawable.img01 ; break;
                case 1  :  imgid =  R.drawable.img02 ; break;
                case 2  :  imgid =  R.drawable.img03 ; break;
                case 3  :  imgid =  R.drawable.img04 ; break;
                case 4  :  imgid =  R.drawable.img05 ; break;
                case 5  :  imgid =  R.drawable.img06 ; break;
                case 6  :  imgid =  R.drawable.img07 ; break;
                case 7  :  imgid =  R.drawable.img08 ; break;
                case 8  :  imgid =  R.drawable.img09 ; break;
                case 9  :  imgid =  R.drawable.img10 ; break;
                case 10 :  imgid =  R.drawable.img11 ; break;
                case 11 :  imgid =  R.drawable.img12 ; break;
                case 12 :  imgid =  R.drawable.img13 ; break;
                case 13 :  imgid =  R.drawable.img14 ; break;
                case 14 :  imgid =  R.drawable.img15 ; break;
                case 15 :  imgid =  R.drawable.img16 ; break;
                case 16 :  imgid =  R.drawable.img17 ; break;
                case 17 :  imgid =  R.drawable.img18 ; break;
                case 18 :  imgid =  R.drawable.img19 ; break;
                case 19 :  imgid =  R.drawable.img20 ; break;
                case 20 :  imgid =  R.drawable.img21 ; break;
                case 21 :  imgid =  R.drawable.img22 ; break;
                case 22 :  imgid =  R.drawable.img23 ; break;                     
             }   
     		   BitmapDrawable dr = (BitmapDrawable) getResources().getDrawable( imgid );	
     		   iv.setImageDrawable(dr);   
                
			}
		});
		
		nextbtn.setOnClickListener( new OnClickListener( ) {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				cp = cp + 1;
				if ( cp > 22 ) {
					cp = 0;
				}
                switch ( cp ) {
                case 0  :  imgid =  R.drawable.img01 ; break;
                case 1  :  imgid =  R.drawable.img02 ; break;
                case 2  :  imgid =  R.drawable.img03 ; break;
                case 3  :  imgid =  R.drawable.img04 ; break;
                case 4  :  imgid =  R.drawable.img05 ; break;
                case 5  :  imgid =  R.drawable.img06 ; break;
                case 6  :  imgid =  R.drawable.img07 ; break;
                case 7  :  imgid =  R.drawable.img08 ; break;
                case 8  :  imgid =  R.drawable.img09 ; break;
                case 9  :  imgid =  R.drawable.img10 ; break;
                case 10 :  imgid =  R.drawable.img11 ; break;
                case 11 :  imgid =  R.drawable.img12 ; break;
                case 12 :  imgid =  R.drawable.img13 ; break;
                case 13 :  imgid =  R.drawable.img14 ; break;
                case 14 :  imgid =  R.drawable.img15 ; break;
                case 15 :  imgid =  R.drawable.img16 ; break;
                case 16 :  imgid =  R.drawable.img17 ; break;
                case 17 :  imgid =  R.drawable.img18 ; break;
                case 18 :  imgid =  R.drawable.img19 ; break;
                case 19 :  imgid =  R.drawable.img20 ; break;
                case 20 :  imgid =  R.drawable.img21 ; break;
                case 21 :  imgid =  R.drawable.img22 ; break;
                case 22 :  imgid =  R.drawable.img23 ; break;                     
             }   
     		   BitmapDrawable dr = (BitmapDrawable) getResources().getDrawable( imgid );	
     		   iv.setImageDrawable(dr);   				
			}
		});
		
	}

}
