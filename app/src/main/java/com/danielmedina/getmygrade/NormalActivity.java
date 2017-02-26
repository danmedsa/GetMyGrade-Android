package com.danielmedina.getmygrade;

import com.example.danielmedina.getmygrade.R;
import com.google.android.gms.ads.*;


import android.app.Activity;
import android.content.Intent;
import android.support.v13.app.FragmentPagerAdapter;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class NormalActivity extends Activity /*implements ActionBar.TabListener*/ {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v13.app.FragmentStatePagerAdapter}.
     */
    //SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    //ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);

        AdView adView = (AdView) this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        // Set up the action bar.
        //final ActionBar actionBar = getActionBar();
        //actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
       // mSectionsPagerAdapter = new SectionsPagerAdapter(getFragmentManager());

        // Set up the ViewPager with the sections adapter.
       // mViewPager = (ViewPager) findViewById(R.id.pager);
       // mViewPager.setAdapter(mSectionsPagerAdapter);

        // When swiping between different sections, select the corresponding
        // tab. We can also use ActionBar.Tab#select() to do this if we have
        // a reference to the Tab.
        //mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
//            @Override
//            public void onPageSelected(int position) {
//                actionBar.setSelectedNavigationItem(position);
//            }
//        });

//        // For each of the sections in the app, add a tab to the action bar.
//        //for (int i = 0; i < mSectionsPagerAdapter.getCount(); i++) {
//            // Create a tab with text corresponding to the page title defined by
//            // the adapter. Also specify this Activity object, which implements
//            // the TabListener interface, as the callback (listener) for when
//            // this tab is selected.
//            actionBar.addTab(
//                    actionBar.newTab()
//                            .setText(mSectionsPagerAdapter.getPageTitle(i))
//                            .setTabListener(this));
//        }



        final Button calc = (Button) findViewById(R.id.CalcNormal);
        final EditText per1 = (EditText) findViewById(R.id.perc1);
        final EditText per2 = (EditText) findViewById(R.id.perc2);
        final EditText per3 = (EditText) findViewById(R.id.perc3);
        final EditText per4 = (EditText) findViewById(R.id.perc4);
        final EditText per5 = (EditText) findViewById(R.id.perc5);
        final EditText per6 = (EditText) findViewById(R.id.perc6);
        final EditText per7 = (EditText) findViewById(R.id.perc7);

        final EditText sc1 = (EditText) findViewById(R.id.sco1);
        final EditText sc2 = (EditText) findViewById(R.id.sco2);
        final EditText sc3 = (EditText) findViewById(R.id.sco3);
        final EditText sc4 = (EditText) findViewById(R.id.sco4);
        final EditText sc5 = (EditText) findViewById(R.id.sco5);
        final EditText sc6 = (EditText) findViewById(R.id.sco6);
        final EditText sc7 = (EditText) findViewById(R.id.sco7);

        final TextView resultLbl = (TextView) findViewById(R.id.Score);

        final EditText cou1 = (EditText) findViewById(R.id.course1);
        final EditText cou2 = (EditText) findViewById(R.id.course2);
        final EditText cou3 = (EditText) findViewById(R.id.course3);
        final EditText cou4 = (EditText) findViewById(R.id.course4);
        final EditText cou5 = (EditText) findViewById(R.id.course5);
        final EditText cou6 = (EditText) findViewById(R.id.course6);
        final EditText cou7 = (EditText) findViewById(R.id.course7);


        final Button howto = (Button) findViewById(R.id.Howto);

        howto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(NormalActivity.this,HowToActivity.class);
                NormalActivity.this.startActivity(intent);

            }
        });



        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double pe1,pe2,pe3,pe4,pe5,pe6,pe7;
                double score1,score2,score3,score4,score5,score6,score7;
                if (!(per1.getText().length() == 0)) {
                    //IF has "%" Remove from string to evaluate as int
                    pe1 = Double.parseDouble(per1.getText().toString()) / 100.0f;
                }
                else {
                    pe1 = 0.0;
                }
                if (!(per2.getText().length() == 0)) {
                    pe2 = Double.parseDouble(per2.getText().toString()) / 100.0f;
                }
                else {
                    pe2 = 0.0;
                }
                if (!(per3.getText().length() == 0)) {
                    pe3 = Double.parseDouble(per3.getText().toString()) / 100.0f;
                }
                else {
                    pe3 = 0.0;
                }
                if (!(per4.getText().length() == 0)) {
                    pe4 = Double.parseDouble(per4.getText().toString()) / 100.0f;
                }
                else {
                    pe4 = 0.0;
                }
                if (!(per5.getText().length() == 0)) {
                    pe5 = Double.parseDouble(per5.getText().toString()) / 100.0f;
                }
                else {
                    pe5 = 0.0;
                }
                if (!(per6.getText().length() == 0)) {
                    pe6 = Double.parseDouble(per6.getText().toString()) / 100.0f;
                }
                else {
                    pe6 = 0.0;
                }
                if (!(per7.getText().length() == 0)) {
                    pe7 = Double.parseDouble(per7.getText().toString()) / 100.0f;
                }
                else {
                    pe7 = 0.0;
                }

                if (!(sc1.getText().length() == 0)) {
                    score1 = Double.parseDouble(sc1.getText().toString()) * 1.0f;
                }
                else {
                    score1 = 0.0;
                }

                if (!(sc2.getText().length() == 0)) {
                    score2 = Double.parseDouble(sc2.getText().toString());
                }
                else {
                    score2 = 0.0;
                }
                if (!(sc3.getText().length() == 0)) {
                    score3 = Double.parseDouble(sc3.getText().toString());
                }
                else {
                    score3 = 0.0;
                }
                if (!(sc4.getText().length() == 0)) {
                    score4 = Double.parseDouble(sc4.getText().toString());
                }
                else {
                    score4 = 0.0;
                }
                if (!(sc5.getText().length() == 0)) {
                    score5 = Double.parseDouble(sc5.getText().toString());
                }
                else {
                    score5 = 0.0;
                }
                if (!(sc6.getText().length() == 0)) {
                    score6 = Double.parseDouble(sc6.getText().toString());
                }
                else {
                    score6 = 0.0;
                }
                if (!(sc7.getText().length() == 0)) {
                    score7 = Double.parseDouble(sc7.getText().toString());
                }
                else {
                    score7 = 0.0;
                }

                double tot = (pe1*score1)+(pe2*score2)+(pe3*score3)+(pe4*score4)+(pe5*score5)+(pe6*score6)+(pe7*score7);

                resultLbl.setText(String.valueOf(tot));

            }
        });


    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.normal, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//        if (id == R.id.action_settings) {
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }

//    @Override
//    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
//        // When the given tab is selected, switch to the corresponding page in
//        // the ViewPager.
//        mViewPager.setCurrentItem(tab.getPosition());
//    }
//
//    @Override
//    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
//    }
//
//    @Override
//    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
//    }

//    /**
//     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
//     * one of the sections/tabs/pages.
//     */
//    public class SectionsPagerAdapter extends FragmentPagerAdapter {
//
//        public SectionsPagerAdapter(FragmentManager fm) {
//            super(fm);
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            // getItem is called to instantiate the fragment for the given page.
//            // Return a PlaceholderFragment (defined as a static inner class below).
//            return PlaceholderFragment.newInstance(position + 1);
//        }
//
//        @Override
//        public int getCount() {
//            // Show 3 total pages.
//            return 3;
//        }
//
//        @Override
//        public CharSequence getPageTitle(int position) {
//            Locale l = Locale.getDefault();
//            switch (position) {
//                case 0:
//                    return getString(R.string.title_section1).toUpperCase(l);
//                case 1:
//                    return getString(R.string.title_section2).toUpperCase(l);
//                case 2:
//                    return getString(R.string.title_section3).toUpperCase(l);
//            }
//            return null;
//        }
//    }
//
//    /**
//     * A placeholder fragment containing a simple view.
//     */
//    public static class PlaceholderFragment extends Fragment {
//        /**
//         * The fragment argument representing the section number for this
//         * fragment.
//         */
//        private static final String ARG_SECTION_NUMBER = "section_number";
//
//        /**
//         * Returns a new instance of this fragment for the given section
//         * number.
//         */
//        public static PlaceholderFragment newInstance(int sectionNumber) {
//            PlaceholderFragment fragment = new PlaceholderFragment();
//            Bundle args = new Bundle();
//            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
//            fragment.setArguments(args);
//            return fragment;
//        }
//
//        public PlaceholderFragment() {
//        }
//
////        @Override
////        public View onCreateView(LayoutInflater inflater, ViewGroup container,
////                Bundle savedInstanceState) {
////            View rootView = inflater.inflate(R.layout.fragment_normal, container, false);
////            return rootView;
////        }
//    }

}
