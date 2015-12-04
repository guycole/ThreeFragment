package com.digiburo.three_fragment;

public interface CustomListener {

    /**
     * communicate a custom event
     * @param arg
     */
    void onCustomEvent(String arg);

    /**
     * select current fragment
     * @param arg
     */
    void onSelectFragment(FragmentEnum arg);
}