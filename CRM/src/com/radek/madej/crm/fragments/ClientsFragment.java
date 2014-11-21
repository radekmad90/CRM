package com.radek.madej.crm.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.radek.madej.crm.R;

public class ClientsFragment extends BaseDrawerFragment {

	public ClientsFragment(int sectionNumber) {
		super(sectionNumber);
	}
	public ClientsFragment(){
		super();
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.clients_fragment, container,
				false);
		return rootView;
	}
	
}
