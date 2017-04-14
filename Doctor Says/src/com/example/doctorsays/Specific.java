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

public class Specific extends Activity {
	
	RadioGroup rg;
	RadioButton rb1,rb2,rb3;
	RadioButton rbt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_specific);
		rg=(RadioGroup)findViewById(R.id.radioGroup1);
		rg.clearCheck();
		OnClickListener listen1=new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				RadioButton rbt=(RadioButton)v;
				if (rbt.getText().equals("Wrist/Palm")) {
					Intent i1=new Intent(Specific.this,Ailment.class);
					startActivity(i1);
				}else if (rbt.getText().equals("Arm")) {
					Intent i2=new Intent(Specific.this,Ailment.class);
					startActivity(i2);
				}else {
					Intent i3=new Intent(Specific.this,Ailment.class);
					startActivity(i3);
				}
			}
		};
		rb1=(RadioButton)findViewById(R.id.radio0);
		rb2=(RadioButton)findViewById(R.id.radio1);
		rb3=(RadioButton)findViewById(R.id.radio2);
		rb1.setOnClickListener(listen1);
		rb2.setOnClickListener(listen1);
		rb3.setOnClickListener(listen1);
	}
}
