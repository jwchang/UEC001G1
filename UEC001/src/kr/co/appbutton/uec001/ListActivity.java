package kr.co.appbutton.uec001;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ListActivity extends Activity {
	
    final class StableArrayAdapter extends ArrayAdapter<String> {

        HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();

        public StableArrayAdapter(Context context, int textViewResourceId,
            List<String> objects) {
          super(context, textViewResourceId, objects);
          for (int i = 0; i < objects.size(); ++i) {
               mIdMap.put(objects.get(i), i);
          }
        }

        @Override
        public long getItemId(int position) {
          String item = getItem(position);
          return mIdMap.get(item);
        }

        @Override
        public boolean hasStableIds() {
          return true;
        }

    }
    

	private ListView listview;
	private Button grBtn1;
	private Button grBtn2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); // 타이틀바 없애기
		setContentView(R.layout.activity_list);
		
	    listview = (ListView) findViewById(R.id.listView1);
		
	    String[] values = new String[] { "Kzumi Watanabe", "Kenji Kurogi", "Masahiro Oku",
	            "Nobuaki Tanaka", "강성중 Kang Seong Jung", "김성덕 Kim Seong Deok", "김은숙 Kim Eun Suk", "김정태 Kim Jeong Tae",
	            "김정호 Kim Jeong Ho", "김태은 Kim Tae Eun", "박권우 Park Gwon U", "박서연 Park Seo Yeon", "배갑선 Bae Gab Sun", "석창성 Seok Chang Seong",
	            "손묵광 Son Muk Gwang", "송남영 Song Nam Young", "이순철 Lee Sun Cheol", "전석진 Jeon Seok Jin", "전용권  Jeon Yong Kwon", "정병국 Jeong Byoung Guk",
	            "정보채 '사진, 나를 힐링한다.'", "문진우 '다큐멘트, 하야리아'", "Masahiro Oku '사진속의 나의 세계'" };
	    
	    final ArrayList<String> list = new ArrayList<String>();
	    for (int i = 0; i < values.length; ++i) {
	         list.add(values[i]);
	    }
	    
	    final StableArrayAdapter adapter = new StableArrayAdapter(this, android.R.layout.simple_list_item_1, list);
	    listview.setAdapter(adapter);
	    
	    listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

	        @Override
	        public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
	        	int imgid=0;
                Intent i = new Intent(getApplicationContext(), DetailViewActivity.class);
                
                switch ( position ) {
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
                
                i.putExtra("param1",   imgid    );
                i.putExtra("param2",   position );
                startActivity(i);	
	        }

	      });
	    
	      grBtn1 = (Button) findViewById( R.id.button1);
	      grBtn2 = (Button) findViewById( R.id.button2);
	    
	      grBtn1.setOnClickListener( new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent i = new Intent(getApplicationContext(), Greeting1Activity.class);
				 startActivity(i);	
			}
		  });
	      
	      grBtn2.setOnClickListener( new OnClickListener() {
				
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 Intent i = new Intent(getApplicationContext(), Greeting2Activity.class);
				 startActivity(i);	
			}
		  });	      

	}

 
}
