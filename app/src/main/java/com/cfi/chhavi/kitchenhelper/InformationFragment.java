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
public class InformationFragment extends Fragment {


    private PieChart mChartUpperPrimaryPrimary;

    private PieChart mChartUpperPrimary;
    private PieChart mChartPrimary;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.information_layout, null);

        getActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //setContentView(R.layout.activity_piechart);



      //  mChartUpperPrimaryPrimary = (PieChart) v.findViewById(R.id.chart1);
       // m.setUsePercentValues(true);

        mChartUpperPrimary = (PieChart) v.findViewById(R.id.chart1);
        mChartPrimary = (PieChart)v.findViewById(R.id.chart2);
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

        mChartUpperPrimary.setCenterText("Nutritional Requirements\n according to MDM");
        mChartUpperPrimary.animateY(1500, Easing.EasingOption.EaseInOutQuad);
        setData(4, 200, mChartUpperPrimary, 0);

        Legend l = mChartUpperPrimary.getLegend();
        l.setPosition(Legend.LegendPosition.RIGHT_OF_CHART);
        l.setXEntrySpace(7f);
        l.setYEntrySpace(0f);
        l.setYOffset(0f);



        mChartPrimary.setUsePercentValues(true);
        mChartPrimary.setDragDecelerationFrictionCoef(0.95f);

        mChartPrimary.setDrawHoleEnabled(true);
        mChartPrimary.setHoleColorTransparent(true);

        mChartPrimary.setTransparentCircleColor(Color.WHITE);
        mChartPrimary.setTransparentCircleAlpha(110);

        mChartPrimary.setHoleRadius(58f);
        mChartPrimary.setTransparentCircleRadius(61f);

        mChartPrimary.setDrawCenterText(true);

        mChartPrimary.setRotationAngle(0);
        // enable rotation of the chart by touch
        mChartPrimary.setRotationEnabled(true);

        mChartPrimary.setCenterText("Nutritional Requirements\naccording to MDM");
        mChartPrimary.animateY(1500, Easing.EasingOption.EaseInOutQuad);
        setData(4, 200, mChartPrimary, 1);

         l = mChartPrimary.getLegend();
        l.setPosition(Legend.LegendPosition.RIGHT_OF_CHART);
        l.setXEntrySpace(7f);
        l.setYEntrySpace(0f);
        l.setYOffset(0f);
       // ArrayList<Entry> yVals1 = new ArrayList<Entry>();

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
                yVals1.add(new Entry(100f,0));
                yVals1.add(new Entry(20f,1));
                yVals1.add(new Entry(50f,2));
                yVals1.add(new Entry(5f,3));
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
        xVals.add(0,"Food Grain");
        xVals.add(1,"Pulses");
        xVals.add(2,"Vegetables");
        xVals.add(3,"Oil and Fats");

        PieDataSet dataSet = new PieDataSet(yVals1, "Nutritional Allotment");
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

                mChartPrimary.setData(data);

                // undo all highlights
                mChartPrimary.highlightValues(null);

                mChartPrimary.invalidate();
                break;

        }

    }
}
