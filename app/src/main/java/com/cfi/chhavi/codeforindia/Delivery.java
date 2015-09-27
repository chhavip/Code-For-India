package com.cfi.chhavi.codeforindia;

import com.orm.SugarRecord;

/**
 * Created by dell pc on 27-09-2015.
 */
public class Delivery extends SugarRecord<Delivery> {
    String DeliveryName;
    int  DeliveryID;

    public Delivery(){

    }

    public Delivery(String DeliveryName, int DeliveryID){
        this.DeliveryName=DeliveryName;
        this.DeliveryID=DeliveryID;
    }
}
