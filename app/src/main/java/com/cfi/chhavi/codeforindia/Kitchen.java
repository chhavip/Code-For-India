package com.cfi.chhavi.codeforindia;

import com.orm.SugarRecord;

/**
 * Created by dell pc on 27-09-2015.
 */
public class Kitchen extends SugarRecord<Kitchen> {
    String KitchenName;
    int KitchenID;
 //   Prediction_Table prediction_table;

    public Kitchen(){

    }

    public Kitchen(String KitchenName, int KitchenID) {
        this.KitchenName = KitchenName;
        this.KitchenID=KitchenID;
      //  this.prediction_table=prediction_table;
    }
}
