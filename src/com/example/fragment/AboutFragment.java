package com.example.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.monitorofflow.R;

import com.example.service.TrafficMonitorService;

/**
 * A placeholder fragment containing a simple view.
 */
public class AboutFragment extends Fragment {
	/**
	 * The fragment argument representing the section number for this
	 * fragment.
	 */
	private static final String ARG_SECTION_NUMBER = "section_number";
	
	private TrafficMonitorService monitorService;
	TextView textview;
	

	/**
	 * Returns a new instance of this fragment for the given section number.
	 */
	public static AboutFragment newInstance(int sectionNumber) {
		AboutFragment fragment = new AboutFragment();
		Bundle args = new Bundle();
		args.putInt(ARG_SECTION_NUMBER, sectionNumber);
		fragment.setArguments(args);
		return fragment;
	}

	public AboutFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_about, container,
				false);
		textview= (TextView) rootView.findViewById(R.id.section_label);
		
		return rootView;
	}
	
	

	

	
}