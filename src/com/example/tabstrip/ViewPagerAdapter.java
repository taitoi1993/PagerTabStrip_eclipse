package com.example.tabstrip;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter{

	final int PAGE_COUNT = 3;
	// Tab Titles --> ArrayList 
	private String tabTitle[] = new String[]{"Tab1","Tab2","Tab3"};  
	Context context;
	
	public ViewPagerAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		switch(arg0){
		case 0:
			Fragment_1 frag1 = new Fragment_1();
			return frag1;
		case 1:
			Fragment_2 frag2 = new Fragment_2();
			return frag2;
		case 2:
			Fragment_3 frag3 = new Fragment_3();
			return frag3;
		}
		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return PAGE_COUNT;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		// TODO Auto-generated method stub
		return tabTitle[position];
	}
	
}
