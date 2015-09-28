package com.cfi.chhavi.kitchenhelper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.cfi.chhavi.codeforindia.R;

import java.util.ArrayList;

/**
 * Created by dell pc on 27-09-2015.
 */
public class SchoolAdapter extends ArrayAdapter<SchoolItem> {

    Context context;
    ArrayList<SchoolItem> arr;
    LayoutInflater l;

    public SchoolAdapter(Context context,  ArrayList<SchoolItem> arr,LayoutInflater l) {
        super(context, R.layout.school_item_layout);
        this.context=context;
        this.arr=arr;
        this.l=l;
    }

    public int getCount() {
        return arr.size();
    }

    public int getItemViewCount()
    {
        return 1;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v;
        v = l.inflate(R.layout.school_item_layout,null);
        SchoolItem n=arr.get(position);
        TextView tvdaal=(TextView)v.findViewById(R.id.daal_text);
        tvdaal.setText(""+n.daal_servings);
        TextView tvrice=(TextView)v.findViewById(R.id.rice_text);
        tvrice.setText(""+n.rice_servings);
        TextView tvveg=(TextView)v.findViewById(R.id.vegetable_text);
        tvveg.setText(""+n.vegetables_servings);
        TextView tvbread=(TextView)v.findViewById(R.id.bread_text);
        tvbread.setText(""+n.bread_servings);
        TextView tvschoolname=(TextView)v.findViewById(R.id.school_name);
        tvschoolname.setText(n.school_name);
        return v;
    }
}

