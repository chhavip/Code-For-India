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
    boolean delivered;



    public static String address = "demo address";
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

    public int getKitchenID() {
        return kitchenID;
    }

    public void setKitchenID(int kitchenID) {
        this.kitchenID = kitchenID;
    }

    public int getTotalStrengthPrimary() {
        return totalStrengthPrimary;
    }

    public void setTotalStrengthPrimary(int totalStrengthPrimary) {
        this.totalStrengthPrimary = totalStrengthPrimary;
    }

    public int getTotalStrengthUpperPrimary() {
        return totalStrengthUpperPrimary;
    }

    public void setTotalStrengthUpperPrimary(int totalStrengthUpperPrimary) {
        this.totalStrengthUpperPrimary = totalStrengthUpperPrimary;
    }

    public int getTotalStrength() {
        return totalStrength;
    }

    public void setTotalStrength(int totalStrength) {
        this.totalStrength = totalStrength;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }
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