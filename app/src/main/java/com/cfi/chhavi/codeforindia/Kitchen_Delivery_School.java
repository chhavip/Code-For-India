package com.cfi.chhavi.codeforindia;

import com.orm.SugarRecord;

/**
 * Created by dell pc on 27-09-2015.
 */
public class Kitchen_Delivery_School extends SugarRecord<Kitchen_Delivery_School> {
    Kitchen kitchen;
    Delivery delivery;
    School school;

public Kitchen_Delivery_School(){

}
    public Kitchen_Delivery_School(Kitchen kitchen, Delivery delivery,School school){
        this.delivery=delivery;
        this.kitchen=kitchen;
        this.school=school;

    }
}
