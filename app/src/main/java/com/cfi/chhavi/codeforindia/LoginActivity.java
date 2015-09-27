package com.cfi.chhavi.codeforindia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.cfi.chhavi.kitchenhelper.KitchenMain;

import java.util.List;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {


    EditText loginId;
    Button loginButtonDelivery;
    Button loginButtonKitchen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);
        InitializeDB initializeDB = new InitializeDB();
        initializeDB.initializing();
        loginId = (EditText) findViewById(R.id.uniqueLoginId);
        loginButtonDelivery = (Button) findViewById(R.id.login_button_delivery);
        loginButtonKitchen = (Button) findViewById(R.id.login_button_kitchen);
        loginButtonKitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this,KitchenMain.class);
                startActivity(i);
                finish();
            }
        });
        loginButtonDelivery.setOnClickListener(this);
        Delivery.deleteAll(Delivery.class);
        Delivery delivery = new Delivery("Mohan", 1234);
        delivery.save();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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

    @Override
    public void onClick(View view) {
        if(loginId.getText().toString() != null ) {
            String uniqueLoginId = loginId.getText().toString();
            List<Delivery> deliveries = Delivery.find(Delivery.class, "Delivery_ID= ?", uniqueLoginId);
            if(deliveries.get(0) != null)   {
                Intent i = new Intent();
                i.setClass(this, SchoolsListofDeliveryActivity.class);
                startActivity(i);
                finish();
            }
        }
        //Login Function
        //Access database
    }
}
