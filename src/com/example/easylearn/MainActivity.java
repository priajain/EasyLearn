package com.example.easylearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ActionBarActivity {
	String [] menuArray = {"Languages","Subjects","Translations"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menuArray); 
		ListView listView = (ListView) findViewById(R.id.listView1); 
		listView.setAdapter(adapter); 
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Log.d("EasyLearn", "List item was clicked");
				switch(position)
				{
				case 0:new Intent(getApplicationContext(),Language.class);break;
				case 1:new Intent(getApplicationContext(),Language.class);break;
				case 2:new Intent(getApplicationContext(),Language.class);break;
				}
				// TODO Auto-generated method stub
				
			}
		});
	};
		
	

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
		
		Intent intent = new Intent();
		switch (id) {
		case R.id.action_languages: intent.setClass(MainActivity.this, Language.class); break;
		case R.id.action_subjects: intent.setClass(MainActivity.this, Subjects.class);break;
		case R.id.action_translations: intent.setClass(MainActivity.this, Translation.class);break;
		}
		 
		startActivity(intent);
		return true;
	}
}
