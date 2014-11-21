package com.radek.madej.crm.fragments;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.radek.madej.crm.MainActivity;
import com.radek.madej.crm.R;

public class JeszczeInnaStrona extends BaseBackableFragment {


	public JeszczeInnaStrona() {
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.jeszcze_inny_fragment, container,
				false);
		Button b = (Button) rootView.findViewById(R.id.button3);
		b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				MainActivity mainActivity = (MainActivity) getActivity();
				mainActivity.getSupportFragmentManager().popBackStack();
			}
		});
		return rootView;
	}
}
