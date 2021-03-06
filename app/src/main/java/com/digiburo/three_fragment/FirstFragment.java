package com.digiburo.three_fragment;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FirstFragment extends Fragment {
    public final String LOG_TAG = getClass().getName();

    public static final String FRAGMENT_TAG = "FRAGMENT_FIRST";

    private CustomListener _listener;

    public static FirstFragment newInstance() {
        return new FirstFragment();
    }

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(LOG_TAG, "onCreateView");

        View view = inflater.inflate(R.layout.fragment_first, container, false);

        Button buttonNext = (Button) view.findViewById(R.id.buttonNext);
        buttonNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d(LOG_TAG, "onClick");
                _listener.onCustomEvent("button click from first fragment");
                _listener.onSelectFragment(FragmentEnum.MIDDLE);
            }
        });

        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d(LOG_TAG, "onAttach");
        _listener = (CustomListener) activity;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        _listener = null;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "onCreate");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(LOG_TAG, "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(LOG_TAG, "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }
}
