package com.satish.explicitintents;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	setContentView(R.layout.second);
	
	TextView tv = (TextView) findViewById(R.id.textView1);
	 if (getIntent().getExtras().getString("thetext").equalsIgnoreCase("amruta"))
	 {
	tv.setText("supergirl");
	}
	 else if(getIntent().getExtras().getString("thetext").equalsIgnoreCase("arun"))
	 {
		 tv.setText("superboy");
	 }
	 else
		 tv.setText("This is rubbish");
}}
