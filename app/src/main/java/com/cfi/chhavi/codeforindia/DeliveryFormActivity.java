package com.cfi.chhavi.codeforindia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DeliveryFormActivity extends AppCompatActivity implements View.OnClickListener {
    EditText primaryAttendance;
    EditText UpperPrimaryAttendance;
    Button submit;
    School mSchool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_form);
        //Intent i = getIntent();
        //mSchool = (School) i.getExtras().get("school");
        TextView schoolName = (TextView) findViewById(R.id.schoolName);
        TextView schoolAddress = (TextView) findViewById(R.id.schoolAddress);
//        if(mSchool != null)  {
//            schoolName.setText(mSchool.getSchoolName());
//            schoolAddress.setText(mSchool.getAddress());
//        }
        submit = (Button) findViewById(R.id.submitButton);
        submit.setOnClickListener(this);
        primaryAttendance = (EditText) findViewById(R.id.primaryAttendance);
        UpperPrimaryAttendance = (EditText) findViewById(R.id.UpperPrimaryAttendance);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_delivery_form, menu);
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
    public static final int SIGNATURE_ACTIVITY = 1;

    @Override
    public void onClick(View view) {
        if(primaryAttendance.getText() == null || UpperPrimaryAttendance.getText() == null)   {
            Toast.makeText(this, "Please fill the above fields", Toast.LENGTH_SHORT).show();
        }
        else    {
            Intent i = new Intent();
            i.setClass(this, CaptureSignature.class);
            startActivityForResult(i,SIGNATURE_ACTIVITY);
            //Set Attendance table values for the given date
        }
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        switch(requestCode) {
            case SIGNATURE_ACTIVITY:
                if (resultCode == RESULT_OK) {

                    Bundle bundle = data.getExtras();
                    String status  = bundle.getString("status");
                    if(status.equalsIgnoreCase("done")){
                        Toast toast = Toast.makeText(this, "Signature capture successful!", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.TOP, 105, 50);
                        toast.show();
                        finish();
                    }

                }
                break;
        }

    }
}
