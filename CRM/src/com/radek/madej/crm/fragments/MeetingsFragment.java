//package com.radek.madej.crm.fragments;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import android.content.Intent;
//import android.location.Address;
//import android.location.Geocoder;
//import android.net.Uri;
//import android.os.Bundle;
//import android.support.v4.app.FragmentManager;
//import android.util.Log;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.View.OnClickListener;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.TextView;
//
//import com.radek.madej.crm.CRMApp;
//import com.radek.madej.crm.MainActivity;
//import com.radek.madej.crm.R;
//
//public class MeetingsFragment extends BaseDrawerFragment {
//
//	public MeetingsFragment(int sectionNumber) {
//		super(sectionNumber);
//
//	}
//	public MeetingsFragment(){
//		super();
//	}
//
//	@Override
//	public View onCreateView(LayoutInflater inflater, ViewGroup container,
//			Bundle savedInstanceState) {
//		View rootView = inflater.inflate(R.layout.meetings_fragment, container,
//				false);
//		
//		TextView text = (TextView) rootView.findViewById(R.id.meetingMainText);
//		text.setText("spotkania");
//				Geocoder coder = new Geocoder(getActivity());
//		final List <Address> lista = new ArrayList<Address>();
//		try{
//			List<Address> listaTemp = coder.getFromLocationName("asseco katowice", 10);
//			lista.addAll(listaTemp);
//		}
//		catch (IOException e){
//			e.printStackTrace();
//			Log.e(CRMApp.TAG, e.getMessage());
//		}
//		
//		StringBuilder sb = new StringBuilder();
//		for(Address el:lista) {
//			sb.append(el.toString());
//			sb.append("\nNASTEPNY\n");
//		}
//		
//		text.setText(sb.toString());
////		
////		((Button) rootView.findViewById(R.id.map_button)).setOnClickListener(new OnClickListener(){
////			@Override
////			public void onClick(View v) {
////				// Create a Uri from an intent string. Use the result to create an Intent.
////				Uri gmmIntentUri = Uri.parse("geo:"+lista.get(0).getLatitude()+","+lista.get(0).getLongitude());
////
////				// Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
////				Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
////				// Make the Intent explicit by setting the Google Maps package
////				mapIntent.setPackage("com.google.android.apps.maps");
////
////				// Attempt to start an activity that can handle the Intent
////				startActivity(mapIntent);
////				
////			}
////		});
//		
//		
//		Button b = (Button) rootView.findViewById(R.id.button1);
//		b.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View v) {
//
//				MainActivity mainActivity = (MainActivity) getActivity();
//				FragmentManager fm = mainActivity.getSupportFragmentManager();
//				fm.beginTransaction()
//						.replace(R.id.container, new InnaStrona(), null)
//						.addToBackStack(null).commit();
//			}
//		});
//		return rootView;
//	
//	}
//	@Override
//	public void onStop() {
//		super.onStop();
//		Log.e(CRMApp.TAG, "DUPA STOP!");
//	}
//	
//	@Override
//	public void onStart() {
//		super.onStart();
//		Log.e(CRMApp.TAG, "DUPA START");
//	
//	}
//
//}
