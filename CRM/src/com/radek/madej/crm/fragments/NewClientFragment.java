//package com.radek.madej.crm.fragments;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import android.location.Address;
//import android.location.Geocoder;
//import android.os.Bundle;
//import android.support.v4.app.ListFragment;
//import android.support.v4.widget.SimpleCursorAdapter;
//import android.util.Log;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.View.OnClickListener;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.EditText;
//
//import com.radek.madej.crm.CRMApp;
//import com.radek.madej.crm.MainActivity;
//import com.radek.madej.crm.R;
//import com.radek.madej.crm.database.model.Customer;
//
//public class NewClientFragment extends BaseDrawerFragment implements OnClickListener {
//
//	SimpleCursorAdapter mAdapter;
//	View rootView;
//	public NewClientFragment(int sectionNumber) {
//		super(sectionNumber);
//	}
//
//	public NewClientFragment() {
//		super();
//	}
//
//	@Override
//	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//		rootView = inflater.inflate(R.layout.add_customer, container, false);
//		Button b = (Button) rootView.findViewById(R.id.add_customer_button);
//		b.setOnClickListener(this);
//		return rootView;
//	}
//
//	@Override
//	public void onClick(View view) {
//		MainActivity mainActivity = (MainActivity) getActivity();
//		CRMApp app = (CRMApp) mainActivity.getApplication();
//		Customer cust = new Customer();
////		cust.setCompanyName(((TextView) view.findViewById(R.id.new_customer_name)).getText().toString());
//
//		cust.setCity(((EditText) rootView.findViewById(R.id.new_customer_city)).getText().toString());
//
//		cust.setStreet(((EditText) rootView.findViewById(R.id.new_customer_street)).getText().toString());
//
//		cust.setNumber(((EditText) rootView.findViewById(R.id.new_customer_number)).getText().toString());
//
//		Geocoder coder = new Geocoder(getActivity());
//		final List<Address> lista = new ArrayList<Address>();
//		try {
//			List<Address> listaTemp = coder.getFromLocationName(cust.getCity() + " " + cust.getStreet() + " " + cust.getNumber(), 10);
//			lista.addAll(listaTemp);
//		} catch (IOException e) {
//			e.printStackTrace();
//			Log.e(CRMApp.TAG, e.getMessage());
//		}
//		List<String> geokodowanaLista = new ArrayList<String>();
//		for (Address adres : lista) {
//			geokodowanaLista.add(adres.toString());
//		}
//		ListFragment fragment = new GeocodedListFragment(geokodowanaLista);
//		mainActivity.getSupportFragmentManager().beginTransaction().replace(R.id.geocoded_fragment, fragment, "main").commit();
//	}
//}
