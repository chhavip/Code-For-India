package com.cfi.chhavi.kitchenhelper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cfi.chhavi.codeforindia.R;

import it.neokree.materialnavigationdrawer.MaterialNavigationDrawer;
import it.neokree.materialnavigationdrawer.elements.MaterialAccount;

/**
 * Created by chhavi on 27/9/15.
 */
public class KitchenMain extends MaterialNavigationDrawer {

private MaterialAccount account;
    @Override
    public void init(Bundle savedInstanceState) {


        account = new MaterialAccount(this.getResources(), "User ABCXYZ",null,null,null);
        this.addAccount(account);

        this.addSection(newSection("Predictions", R.drawable.notification_template_icon_bg, new PredictionsFragment()));
        this.addSection(newSection("School Wise", R.drawable.notification_template_icon_bg,new SampleFragment()));

        this.addSection(newSection("Information", R.drawable.notification_template_icon_bg,new InformationFragment()));

//        this.addSection(newSection("Bhartiya Janta Party", R.drawable.abc_btn_radio_material , new PartyFragment()));
//        this.addSection(newSection("Congress", R.drawable.abc_btn_radio_material , new CongressFragment()));
//        this.addSection(newSection("About Us", R.drawable.abc_btn_radio_material , new AboutUs()));

    }
}
