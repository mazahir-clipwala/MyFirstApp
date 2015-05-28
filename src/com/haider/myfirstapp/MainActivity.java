package com.haider.myfirstapp;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {
	
	public static final String MESSAGE = "com.haider.MainActivity";
	public static final String TAG = "MyFirstApp";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Log.v (TAG, "onCreate Called");
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.v (TAG, "onStart Called");
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		Log.v (TAG, "onResume Called");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		Log.v (TAG, "onPause Called");
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		Log.v (TAG, "onStop Called");
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();

		Log.v (TAG, "onDestroy Called");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void sendMessage (View view) {
		Intent intent = new Intent (this, DisplayMessageActivity.class);
		
		EditText enterMessageET = (EditText) findViewById(R.id.enterMessageET);
		
		String message = enterMessageET.getText ().toString ();
		intent.putExtra (MESSAGE, message);
		
		startActivity (intent);
	}
}
