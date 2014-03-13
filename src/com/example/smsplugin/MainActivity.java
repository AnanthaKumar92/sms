package com.example.smsplugin;

import android.os.Bundle;
import org.apache.cordova.*;
//import android.app.DroidGap;
//import android.view.Menu;

public class MainActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.loadUrl("file:///android_asset/www/index.html",20000); 
	}
}
