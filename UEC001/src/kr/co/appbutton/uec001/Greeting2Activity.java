package kr.co.appbutton.uec001;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class Greeting2Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE); // Ÿ��Ʋ�� ���ֱ�
		setContentView(R.layout.activity_greeting2);
	}


}
