package com.cfi.chhavi.kitchenhelper;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cfi.chhavi.codeforindia.R;

/**
 * Created by chhavi on 27/9/15.
 */
public class SampleFragment2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.predictions_fragment_layout,null);
        return v;
       // return super.onCreateView(inflater, container, savedInstanceState);

    }
}
