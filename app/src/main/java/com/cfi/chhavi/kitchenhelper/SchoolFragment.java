package com.cfi.chhavi.kitchenhelper;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cfi.chhavi.codeforindia.R;
import com.cfi.chhavi.codeforindia.School;

import java.util.ArrayList;

/**
 * Created by chhavi on 27/9/15.
 */
public class SchoolFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.school_fragment, null);
        ArrayList<SchoolItem> schoolItems=new ArrayList<>();
        SchoolItem si=new SchoolItem("Bal Bharti", 250, 250, 300, 500);
        schoolItems.add(si);
        si=new SchoolItem("Vidya Mandir", 200, 250, 350, 550);
        schoolItems.add(si);
        si=new SchoolItem("Kendriya Vidyalaya", 350, 250, 400, 700);
        schoolItems.add(si);


        return v;

    }

    //public SchoolAdapter
}
