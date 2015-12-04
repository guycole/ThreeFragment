package com.digiburo.three_fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity implements CustomListener {
    public final String LOG_TAG = getClass().getName();

    @Override
    public void onCustomEvent(String arg) {
        Log.d(LOG_TAG, "onCustomEvent:" + arg);
    }

    @Override
    public void onSelectFragment(FragmentEnum arg) {
        Log.d(LOG_TAG, "onSelectFragment" + arg);

        Fragment fragment = null;
        String tag = null;

        switch (arg) {
            case FIRST:
                fragment = FirstFragment.newInstance();
                tag = FirstFragment.FRAGMENT_TAG;
                break;
            case MIDDLE:
                fragment = MiddleFragment.newInstance();
                tag = MiddleFragment.FRAGMENT_TAG;
                break;
            case END:
                fragment = EndFragment.newInstance();
                tag = EndFragment.FRAGMENT_TAG;
                break;
            default:
                throw new IllegalArgumentException("unsupported fragment:" + arg);
        }

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContent, fragment, tag);
        fragmentTransaction.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onSelectFragment(FragmentEnum.FIRST);
    }
}
