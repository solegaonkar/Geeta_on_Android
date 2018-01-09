package com.github.solegaonkar.geeta;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class IndexActivity extends AppCompatActivity
		implements NavigationView.OnNavigationItemSelectedListener {

	private Map<Integer, Integer> idMap;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_index);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
		fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
						.setAction("Action", null).show();
			}
		});

		DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
		ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
				this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
		drawer.addDrawerListener(toggle);
		toggle.syncState();

		NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
		navigationView.setNavigationItemSelectedListener(this);

		idMap = new HashMap<Integer, Integer>();
		idMap.put(R.id.geeta_title_00, R.string.geeta_00);
		idMap.put(R.id.geeta_title_01, R.string.geeta_01);
		idMap.put(R.id.geeta_title_02, R.string.geeta_02);
		idMap.put(R.id.geeta_title_03, R.string.geeta_03);
		idMap.put(R.id.geeta_title_04, R.string.geeta_04);
		idMap.put(R.id.geeta_title_05, R.string.geeta_05);
		idMap.put(R.id.geeta_title_06, R.string.geeta_06);
		idMap.put(R.id.geeta_title_07, R.string.geeta_07);
		idMap.put(R.id.geeta_title_08, R.string.geeta_08);
		idMap.put(R.id.geeta_title_09, R.string.geeta_09);
		idMap.put(R.id.geeta_title_10, R.string.geeta_10);
		idMap.put(R.id.geeta_title_11, R.string.geeta_11);
		idMap.put(R.id.geeta_title_12, R.string.geeta_12);
		idMap.put(R.id.geeta_title_13, R.string.geeta_13);
		idMap.put(R.id.geeta_title_14, R.string.geeta_14);
		idMap.put(R.id.geeta_title_15, R.string.geeta_15);
		idMap.put(R.id.geeta_title_16, R.string.geeta_16);
		idMap.put(R.id.geeta_title_17, R.string.geeta_17);
		idMap.put(R.id.geeta_title_18, R.string.geeta_18);
		idMap.put(R.id.geeta_title_19, R.string.geeta_19);
	}

	@Override
	public void onBackPressed() {
		DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
		if (drawer.isDrawerOpen(GravityCompat.START)) {
			drawer.closeDrawer(GravityCompat.START);
		} else {
			super.onBackPressed();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.index, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	@Override
	public boolean onNavigationItemSelected(MenuItem item) {
		TextView textView = findViewById(R.id.textView);
		textView.setText(idMap.get(item.getItemId()));
		textView.scrollTo(0,0);

		DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
		drawer.closeDrawer(GravityCompat.START);
		return true;
	}
}
