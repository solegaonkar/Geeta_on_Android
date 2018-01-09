package com.github.solegaonkar.geeta;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity
		implements NavigationView.OnNavigationItemSelectedListener {

	private Map<Integer, Integer> idTextMap;
	private Map<Integer, Integer> idTitleMap;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
		ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
				this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
		drawer.addDrawerListener(toggle);
		toggle.syncState();

		NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
		navigationView.setNavigationItemSelectedListener(this);

		createMap();
	}

	private void createMap() {
		idTextMap = new HashMap<Integer, Integer>();
		idTextMap.put(R.id.geeta_title_00, R.string.geeta_00);
		idTextMap.put(R.id.geeta_title_01, R.string.geeta_01);
		idTextMap.put(R.id.geeta_title_02, R.string.geeta_02);
		idTextMap.put(R.id.geeta_title_03, R.string.geeta_03);
		idTextMap.put(R.id.geeta_title_04, R.string.geeta_04);
		idTextMap.put(R.id.geeta_title_05, R.string.geeta_05);
		idTextMap.put(R.id.geeta_title_06, R.string.geeta_06);
		idTextMap.put(R.id.geeta_title_07, R.string.geeta_07);
		idTextMap.put(R.id.geeta_title_08, R.string.geeta_08);
		idTextMap.put(R.id.geeta_title_09, R.string.geeta_09);
		idTextMap.put(R.id.geeta_title_10, R.string.geeta_10);
		idTextMap.put(R.id.geeta_title_11, R.string.geeta_11);
		idTextMap.put(R.id.geeta_title_12, R.string.geeta_12);
		idTextMap.put(R.id.geeta_title_13, R.string.geeta_13);
		idTextMap.put(R.id.geeta_title_14, R.string.geeta_14);
		idTextMap.put(R.id.geeta_title_15, R.string.geeta_15);
		idTextMap.put(R.id.geeta_title_16, R.string.geeta_16);
		idTextMap.put(R.id.geeta_title_17, R.string.geeta_17);
		idTextMap.put(R.id.geeta_title_18, R.string.geeta_18);
		idTextMap.put(R.id.geeta_title_19, R.string.geeta_19);

		idTitleMap = new HashMap<Integer, Integer>();
		idTitleMap.put(R.id.geeta_title_00, R.string.geeta_title_00);
		idTitleMap.put(R.id.geeta_title_01, R.string.geeta_title_01);
		idTitleMap.put(R.id.geeta_title_02, R.string.geeta_title_02);
		idTitleMap.put(R.id.geeta_title_03, R.string.geeta_title_03);
		idTitleMap.put(R.id.geeta_title_04, R.string.geeta_title_04);
		idTitleMap.put(R.id.geeta_title_05, R.string.geeta_title_05);
		idTitleMap.put(R.id.geeta_title_06, R.string.geeta_title_06);
		idTitleMap.put(R.id.geeta_title_07, R.string.geeta_title_07);
		idTitleMap.put(R.id.geeta_title_08, R.string.geeta_title_08);
		idTitleMap.put(R.id.geeta_title_09, R.string.geeta_title_09);
		idTitleMap.put(R.id.geeta_title_10, R.string.geeta_title_10);
		idTitleMap.put(R.id.geeta_title_11, R.string.geeta_title_11);
		idTitleMap.put(R.id.geeta_title_12, R.string.geeta_title_12);
		idTitleMap.put(R.id.geeta_title_13, R.string.geeta_title_13);
		idTitleMap.put(R.id.geeta_title_14, R.string.geeta_title_14);
		idTitleMap.put(R.id.geeta_title_15, R.string.geeta_title_15);
		idTitleMap.put(R.id.geeta_title_16, R.string.geeta_title_16);
		idTitleMap.put(R.id.geeta_title_17, R.string.geeta_title_17);
		idTitleMap.put(R.id.geeta_title_18, R.string.geeta_title_18);
		idTitleMap.put(R.id.geeta_title_19, R.string.geeta_title_19);

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
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		return super.onOptionsItemSelected(item);
	}

	@Override
	public boolean onNavigationItemSelected(MenuItem item) {
		TextView textView = findViewById(R.id.textView);
		textView.setText(idTextMap.get(item.getItemId()));
		this.setTitle(idTitleMap.get(item.getItemId()));

		DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
		drawer.closeDrawer(GravityCompat.START);
		return true;
	}
}
