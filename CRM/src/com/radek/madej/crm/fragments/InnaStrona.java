package com.radek.madej.crm.fragments;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.radek.madej.crm.MainActivity;
import com.radek.madej.crm.R;

public class InnaStrona extends BaseBackableFragment {

	public InnaStrona() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.inny_fragment, container,
				false);
		Button b = (Button) rootView.findViewById(R.id.button2);
		b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				MainActivity mainActivity = (MainActivity) getActivity();
				FragmentManager fm = mainActivity.getSupportFragmentManager();
				fm.beginTransaction()
						.replace(R.id.container, new JeszczeInnaStrona(), null)
						.addToBackStack(null).commit();
			}
		});
		return rootView;
	}
}
