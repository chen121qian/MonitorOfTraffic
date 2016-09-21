package com.example.adapter;

import java.util.Locale;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;

import com.example.fragment.AboutFragment;
import com.example.fragment.ChartFragment;
import com.example.fragment.FlowFragment;
import com.example.fragment.NetFragment;
import com.example.fragment.ParamFragment;
import com.example.fragment.PlaceholderFragment;
import com.example.fragment.QuaryFragment;
import com.example.monitorofflow.R;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

	public SectionsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int position) {
		// getItem is called to instantiate the fragment for the given page.
		// Return a PlaceholderFragment (defined as a static inner class
		// below).
		if(position==0){
			return FlowFragment.newInstance(position+1);
		}
		if(position==1){
			return NetFragment.newInstance(position+1);
		}
		if(position==2){
			return ChartFragment.newInstance(position+1);
		}
		if(position==3){
			return ParamFragment.newInstance(position+1);
		}
		if(position==4){
			return AboutFragment.newInstance(position+1);
		}
		if(position==5){
			return QuaryFragment.newInstance(position+1);
		}
		return PlaceholderFragment.newInstance(position + 1);
	}

	@Override
	public int getCount() {
		// Show 6 total pages.
		return 6;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		Locale l = Locale.getDefault();
		switch (position) {
		case 0:
			return "流量监控";
		case 1:
			return "联网监控";
		case 2:
			return "图表监控";
		case 3:
			return "参数设置";
		case 4:
			return "关于我们";
		case 5:
			return "查询流量";
		}
		return null;
	}
}