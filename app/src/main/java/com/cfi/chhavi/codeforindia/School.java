package com.cfi.chhavi.codeforindia;

import com.orm.SugarRecord;

/**
 * Created by dell pc on 27-09-2015.
 */
public class School extends SugarRecord<School> {
    String schoolName;
    int schoolID;
    int kitchenID;
    int totalStrengthPrimary;
    int totalStrengthUpperPrimary;
    int totalStrength;
   // Prediction_Table prediction_table;

    public School(){

    }

public School(String SchoolName,int SchoolID, int TotalStrengthPrimary, int TotalStrengthUpperPrimary ,int kitchenID){
    this.schoolName=SchoolName;
    this.schoolID=SchoolID;
    this.totalStrengthPrimary=TotalStrengthPrimary;
    this.totalStrengthUpperPrimary=TotalStrengthUpperPrimary;
    this.kitchenID=kitchenID;
    this.totalStrength=this.totalStrengthPrimary+this.totalStrengthUpperPrimary;
}
}