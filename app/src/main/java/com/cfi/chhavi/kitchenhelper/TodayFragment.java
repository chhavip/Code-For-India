package com.cfi.chhavi.kitchenhelper;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.cfi.chhavi.codeforindia.R;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

/**
 * Created by chhavi on 27/9/15.
 */
public class TodayFragment extends Fragment {
    PieChart mChartUpperPrimary;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.today_layout, null);

        getActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //setContentView(R.layout.activity_piechart);



        //  mChartUpperPrimaryPrimary = (PieChart) v.findViewById(R.id.chart1);
        // m.setUsePercentValues(true);

        mChartUpperPrimary = (PieChart) v.findViewById(R.id.chart1);
       // mChartPrimary = (PieChart)v.findViewById(R.id.chart2);
        mChartUpperPrimary.setUsePercentValues(true);
        mChartUpperPrimary.setDragDecelerationFrictionCoef(0.95f);

        mChartUpperPrimary.setDrawHoleEnabled(true);
        mChartUpperPrimary.setHoleColorTransparent(true);

        mChartUpperPrimary.setTransparentCircleColor(Color.WHITE);
        mChartUpperPrimary.setTransparentCircleAlpha(110);

        mChartUpperPrimary.setHoleRadius(58f);
        mChartUpperPrimary.setTransparentCircleRadius(61f);

        mChartUpperPrimary.setDrawCenterText(true);

        mChartUpperPrimary.setRotationAngle(0);
        // enable rotation of the chart by touch
        mChartUpperPrimary.setRotationEnabled(true);

        mChartUpperPrimary.setCenterText("Servings According To\n Schools");
        mChartUpperPrimary.animateY(1500, Easing.EasingOption.EaseInOutQuad);
        setData(4, 200, mChartUpperPrimary, 0);

        Legend l = mChartUpperPrimary.getLegend();
        l.setPosition(Legend.LegendPosition.RIGHT_OF_CHART);
        l.setXEntrySpace(7f);
        l.setYEntrySpace(0f);
        l.setYOffset(0f);

        return v;
    }

    private void setData(int count, float range, PieChart chart, int ca) {

        float mult = range;

        ArrayList<Entry> yVals1 = new ArrayList<Entry>();

        // IMPORTANT: In a PieChart, no values (Entry) should have the same
        // xIndex (even if from different DataSets), since no values can be
        // drawn above each other.
        switch (ca){
            case 0:
                yVals1.add(new Entry(420f,0));
                yVals1.add(new Entry(400f,1));
                yVals1.add(new Entry(320f,2));
                yVals1.add(new Entry(480f,3));
                break;
            case 1:
                yVals1.add(new Entry(150f,0));
                yVals1.add(new Entry(30f,1));
                yVals1.add(new Entry(75f,2));
                yVals1.add(new Entry(7.5f,3));


        }


//        for (int i = 0; i < count + 1; i++) {
//            yVals1.add(new Entry((float) (Math.random() * mult) + mult / 5, i));
//        }

        ArrayList<String> xVals = new ArrayList<String>();
        xVals.add(0,"Sarvodya Vidayalya");
        xVals.add(1,"Kendriya Vidayalaya");
        xVals.add(2,"Bal Bhavan");
        xVals.add(3,"Shiksha Bhavan");

        PieDataSet dataSet = new PieDataSet(yVals1, "");
        dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(5f);

        // add a lot of colors

        ArrayList<Integer> colors = new ArrayList<Integer>();
       /* colors.add(R.color.purple_A400);
        colors.add(R.color.green_A400);
        colors.add(R.color.blue_500);
        colors.add(R.color.rea);*/




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
        switch (ca){
            case 0:
                for (int c : ColorTemplate.VORDIPLOM_COLORS)
                    colors.add(c);
                colors.add(ColorTemplate.getHoloBlue());
                break;
            case 1:
                for (int c : ColorTemplate.COLORFUL_COLORS)
                    colors.add(c);
                break;

        }



        dataSet.setColors(colors);

        PieData data = new PieData(xVals, dataSet);
        data.setValueFormatter(new PercentFormatter());
        data.setValueTextSize(11f);
        data.setValueTextColor(Color.WHITE);
        // data.setValueTypeface(tf);

        switch (ca){
            case 0:
                mChartUpperPrimary.setData(data);

                // undo all highlights
                mChartUpperPrimary.highlightValues(null);

                mChartUpperPrimary.invalidate();
                break;
            case 1:

                break;

        }

    }
}
