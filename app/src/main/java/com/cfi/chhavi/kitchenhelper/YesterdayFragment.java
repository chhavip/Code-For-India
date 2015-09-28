package com.cfi.chhavi.kitchenhelper;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cfi.chhavi.codeforindia.R;
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
public class YesterdayFragment extends Fragment {
    BarChart mChart;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tomorrow_layout, null);
        mChart = (BarChart) v.findViewById(R.id.chart1);
        mChart.setDescription("");

        mChart.setDrawGridBackground(false);
        mChart.setDrawBarShadow(false);

        mChart.setDrawValueAboveBar(false);
        mChart.animateY(2000);

        YAxis yLabels = mChart.getAxisLeft();
      //  yLabels.setValueFormatter(new MyYAxisValueFormatter());
        mChart.getAxisRight().setEnabled(false);

        XAxis xLabels = mChart.getXAxis();
        xLabels.setPosition(XAxis.XAxisPosition.TOP);




        ArrayList<String> xVals = new ArrayList<String>();
      /*  for (int i = 0; i < 4; i++) {
            xVals.add(mMonths[i % mMonths.length]);
        }*/
        xVals.add("Rice");
        xVals.add("Vegetables");
        xVals.add("Bread");
        xVals.add("Pulses");


        ArrayList<BarEntry> yVals1 = new ArrayList<BarEntry>();

        for (int i = 0; i < 4; i++) {
           // float mult = (mSeekBarY.getProgress() + 1);
            float mult = 10;
            float val1 = (float) (Math.random() * mult) + mult / 3;
            float val2 = val1 + i*0.7f;
            //float val3 = (float) (Math.random() * mult) + mult / 3;

            yVals1.add(new BarEntry(new float[] { val1, val2 }, i));
        }

        BarDataSet set1 = new BarDataSet(yVals1, "");
        set1.setColors(getColors());
        set1.setStackLabels(new String[] { "Used", "Predicted" });

        ArrayList<BarDataSet> dataSets = new ArrayList<BarDataSet>();
        dataSets.add(set1);

        BarData data = new BarData(xVals, dataSets);
        data.setValueTextSize(12);
      //  data.setValueFormatter(new MyValueFormatter());

        mChart.setData(data);
        mChart.invalidate();

        return v;
    }

    private int[] getColors() {

        int stacksize = 2;

        // have as many colors as stack-values per entry
        int[] colors = new int[stacksize];

        for (int i = 0; i < stacksize; i++) {
            colors[i] = ColorTemplate.VORDIPLOM_COLORS[i];
        }

        return colors;
    }
}
