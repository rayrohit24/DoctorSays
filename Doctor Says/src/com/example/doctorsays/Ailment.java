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

public class Ailment extends Activity {
	
	RadioGroup rg2;
	RadioButton rb5,rb6,rb7,rb8;
	RadioButton rbu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ailment);
		rg2=(RadioGroup)findViewById(R.id.radioGroup1);
		rg2.clearCheck();
		OnClickListener listen2=new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				RadioButton rbu=(RadioButton)v;
				if (rbu.getText().equals("Bleeding")) {
					Intent i1=new Intent(Ailment.this,MedicalAdvice.class);
					startActivity(i1);
				}else if (rbu.getText().equals("Pain/Strain")) {
					
					
				}else if (rbu.getText().equals("Rashes")) {
					
				}else {
					
				}
				
			}
		};

		
	}

	

}
