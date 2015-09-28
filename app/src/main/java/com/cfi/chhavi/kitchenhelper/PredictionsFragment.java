package com.cfi.chhavi.kitchenhelper;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.astuetz.PagerSlidingTabStrip;
import com.cfi.chhavi.codeforindia.R;

/**
 * Created by chhavi on 27/9/15.
 */
public class PredictionsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.predictions_fragment_layout,null);
        ViewPager pager = (ViewPager) v.findViewById(R.id.pager);
        pager.setAdapter(new PredictionsFragmentAdapter(getChildFragmentManager()));
        //b = new Bundle();
        //   b  = getArguments();
        // Bind the tabs to the ViewPager
        PagerSlidingTabStrip tabs = (PagerSlidingTabStrip) v.findViewById(R.id.tabs);
        tabs.setViewPager(pager);
        return v;
    }

    public class PredictionsFragmentAdapter extends FragmentPagerAdapter {

        public PredictionsFragmentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            // return TITLES[position];
            switch(position){
                case 0:
                    return "YESTERDAY";
                case 1:
                    return "TODAY";
                case 2:
                    return "TOMORROW";
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public Fragment getItem(int position) {

          /*  switch(position){
                case 0:
                    ManifestoFragment manifesto0Fragment = new ManifestoFragment();
                    b.putInt("index", 1);
                    manifesto0Fragment.setArguments(b);
                    return  manifesto0Fragment;
                // break;
                case 1:
                    CandidatesFragment candidatesFragment = new CandidatesFragment();
                    b.putInt("index", 1);
                    candidatesFragment.setArguments(b);
                    return  candidatesFragment;
                //   return new CandidatesFragment();
                // CandidatesFragment candidatesFragment = new CandidatesFragment();
                //   Bundle b = new Bundle();
                //    b.putInt("index",0);
                //     Log.e("index", "" + b.getInt("index"));
                //    candidatesFragment.setArguments(b);
                // return candidatesFragment;
                case 2:
                    ProblemBoxFragment problemBoxFragment = new ProblemBoxFragment();
                    b.putInt("index", 1);
                    problemBoxFragment.setArguments(b);
                    return problemBoxFragment;
                //  return new ProblemBoxFragment();
            }*/

            switch(position){
                case 0:
                    return new YesterdayFragment();
                case 1:
                    return new TodayFragment();
                case 2:
                    return new TomorrowFragment();
            }
            return new SampleFragment();
        }

    }
}
