package com.example.doctorsays;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.os.Build;

public class BodyParts extends Activity {
	
	RadioGroup rg1;
	RadioButton rb1,rb2,rb3,rb4,rb5,rb6;
	RadioButton rb;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_body_parts);
		rg1=(RadioGroup)findViewById(R.id.radioGroup1);
		rg1.clearCheck();
		OnClickListener listen=new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				RadioButton rb=(RadioButton)v;
				if(rb.getText().equals("Head"))
				{
					
				}
				else if (rb.getText().equals("Face")) {
					
					
				}
				else if (rb.getText().equals("Hands")) {
					Intent i3=new Intent(BodyParts.this,Specific.class);
					startActivity(i3);
				}
				else if (rb.getText().equals("Back")) {
					
				}
				else if (rb.getText().equals("Legs")) {
					
				}else {
					
				}			
			}
		};
		rb1=(RadioButton)findViewById(R.id.radio0);
		rb2=(RadioButton)findViewById(R.id.radio1);
		rb3=(RadioButton)findViewById(R.id.radio2);
		rb4=(RadioButton)findViewById(R.id.radio3);
		rb5=(RadioButton)findViewById(R.id.radio4);
		rb6=(RadioButton)findViewById(R.id.radio5);
		rb1.setOnClickListener(listen);
		rb2.setOnClickListener(listen);
		rb3.setOnClickListener(listen);
		rb4.setOnClickListener(listen);
		rb5.setOnClickListener(listen);
		rb6.setOnClickListener(listen);
	}
}
