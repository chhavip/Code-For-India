package com.cfi.chhavi.codeforindia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import Helpers.SchoolListAdapter;

public class SchoolsListofDeliveryActivity extends AppCompatActivity {

    ArrayList<School> mSchools;
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schools_listof_delivery);
        mSchools = new ArrayList<>();
        populateSchoolsList();
        rv = (RecyclerView) findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        SchoolListAdapter adapter = new SchoolListAdapter(R.layout.school_list_layout, mSchools, this );
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);
    }

    private void populateSchoolsList() {
        mSchools.add(new School("Kendriya Vidyalaya, Phase 1", 1, 50, 60, 1 ));
        mSchools.add(new School("Bal Bharti", 1, 50, 60, 1 ));
        mSchools.add(new School("Kendriya Vidyalaya", 1, 50, 60, 1 ));
        mSchools.add(new School("Sophia", 1, 50, 60, 1 ));
        mSchools.add(new School("Saint Mary", 1, 50, 60, 1 ));
        mSchools.add(new School("Delhi Public School", 1, 50, 60, 1 ));
        mSchools.add(new School("Shiksha Bhavan", 1, 50, 60, 1 ));
        mSchools.add(new School("Delhi Public School", 1, 50, 60, 1 ));
        mSchools.add(new School("Navodaya Vidyalaya", 1, 50, 60, 1 ));
        mSchools.add(new School("Modern Public School", 1, 50, 60, 1 ));

        //Fetch Data from Database
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_schools_listof_delivery, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
