package com.cfi.chhavi.kitchenhelper;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cfi.chhavi.codeforindia.R;
import com.cfi.chhavi.codeforindia.Utility;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

/**
 * Created by chhavi on 27/9/15.
 */
public class TomorrowFragment extends Fragment {
BarChart mChart;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tomorrow_layout, null);

        mChart = (BarChart) v.findViewById(R.id.chart1);
       //
        mChart.setDrawBarShadow(false);
        mChart.setDrawValueAboveBar(true);

        mChart.setDescription("");

        // if more than 60 entries are displayed in the chart, no values will be
        // drawn
        mChart.setMaxVisibleValueCount(60);
        //mChart.setOnChartValueSelectedListener(this);
        mChart.setDrawGridBackground(false);
        mChart.animateY(2000);

        XAxis xAxis = mChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
       // xAxis.setTypeface(mTf);
        xAxis.setDrawGridLines(false);
        xAxis.setSpaceBetweenLabels(2);


        YAxis leftAxis = mChart.getAxisLeft();
       // leftAxis.setTypeface(mTf);
        leftAxis.setLabelCount(8, false);
       // leftAxis.setValueFormatter(custom);
        leftAxis.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
        leftAxis.setSpaceTop(15f);

        setData(5,100);

        return v;
    }

    private void setData(int count, float range) {

        ArrayList<String> xVals = new ArrayList<String>();
        //for (int i = 0; i < count; i++) {
            xVals.add("rice");
        xVals.add("pulses");
        xVals.add("vegetables");
        xVals.add("bread");
       // }

        ArrayList<BarEntry> yVals1 = new ArrayList<BarEntry>();
        float val = Utility.totalPeople(0, 452, 500);
        yVals1.add(new BarEntry(val*170,0));
        yVals1.add(new BarEntry(val*80,1));
        yVals1.add(new BarEntry(val*150f,2));
        yVals1.add(new BarEntry(val*80,3));
     /*   for (int i = 0; i < 4; i++) {
           // float mult = (range + 1);
          //  float val = (float) (Math.random() * mult);

            yVals1.add(new BarEntry(val, i));
        }*/

        BarDataSet set1 = new BarDataSet(yVals1, "DataSet");
        set1.setBarSpacePercent(35f);

        ArrayList<BarDataSet> dataSets = new ArrayList<BarDataSet>();
        dataSets.add(set1);
        ArrayList<Integer> colors = new ArrayList<Integer>();
       /* colors.add(R.color.purple_A400);
        colors.add(R.color.green_A400);
        colors.add(R.color.blue_500);
        colors.add(R.color.rea);*/



        for (int c : ColorTemplate.VORDIPLOM_COLORS)
            colors.add(c);
//
        //      for (int c : ColorTemplate.JOYFUL_COLORS)
        //        colors.add(c);
//
        //for (int c : ColorTemplate.COLORFUL_COLORS)
        //    colors.add(R.color.material_blue_grey_800);
//
        //      for (int c : ColorTemplate.LIBERTY_COLORS)
        //         colors.add(c);
//
        //  for (int c : ColorTemplate.PASTEL_COLORS)
        //    colors.add(c);

        colors.add(ColorTemplate.getHoloBlue());

        //dataSets.setColors(colors);

        BarData data = new BarData(xVals, dataSets);
        data.setValueTextSize(10f);
      //      data.setValueTypeface(mTf);

        mChart.setData(data);
    }
}
