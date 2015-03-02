package com.radek.madej.crm;

import android.app.Application;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.radek.madej.crm.fragments.BaseDrawerFragment;
import com.radek.madej.crm.fragments.ClientsFragment;
import com.radek.madej.crm.fragments.CrmFragment;
import com.radek.madej.crm.fragments.MapFragment;
import com.radek.madej.crm.fragments.MeetingsFragment;




public class MainActivity extends ActionBarActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    private NavigationDrawerFragment mNavigationDrawerFragment;
    private BaseDrawerFragment fragment;
    private CharSequence mTitle;
    private Application app;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        app = (CRMApp) getApplication();
        setContentView(R.layout.activity_main);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        switch (position) {
		case 0:
			fragment = new CrmFragment(position);
			break;
		case 1: 
			fragment = new MeetingsFragment(position);
			break;
		case 2:
			fragment = new ClientsFragment(position);
			break;
		case 3:
			fragment = new MapFragment(position);
			break;
		default:
			Toast toast = Toast.makeText(getApplicationContext(), "onNavigationDrawerItemSelected Default switch", Toast.LENGTH_LONG);
			toast.show();
			break;
		} 
        for(int i = 0; i < fragmentManager.getBackStackEntryCount(); ++i) {    
        	fragmentManager.popBackStack();
        }
        fragmentManager.beginTransaction()
                .replace(R.id.container, fragment, "main")
                .commit();
    }

    public void onSectionAttached(int number) {
    	if (number == 0){
    		mTitle = getResources().getString(R.string.app_name);
    		return;
    	} 
    	mTitle = getResources().getStringArray(R.array.nav_drawer_items)[number];
    }

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
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
    
    
}
