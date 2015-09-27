package com.cfi.chhavi.codeforindia;

import com.orm.SugarRecord;

import java.util.Date;

/**
 * Created by dell pc on 27-09-2015.
 */
public class Prediction_Table extends SugarRecord<Prediction_Table> {
    Date date;
    Consumption predictedConsumption;
    Consumption actualConsumption;
    int SchoolID;

    public Prediction_Table(){

    }
    public Prediction_Table(Date date, Consumption predictedConsumption, Consumption actualConsumption, int SchoolID){
        this.date=date;
        this.predictedConsumption=predictedConsumption;
        this.actualConsumption=actualConsumption;
        this.SchoolID=SchoolID;
    }
}
