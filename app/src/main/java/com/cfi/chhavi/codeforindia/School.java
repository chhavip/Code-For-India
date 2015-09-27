package com.cfi.chhavi.codeforindia;

import com.orm.SugarRecord;

/**
 * Created by dell pc on 27-09-2015.
 */
public class School extends SugarRecord<School> {
    String schoolName;
    int schoolID;
    int totalStrengthPrimary;
    int totalStrengthUpperPrimary;
    int totalStrength;

    public School(){

    }

public School(String SchoolName,int SchoolID, int TotalStrengthPrimary, int TotalStrengthUpperPrimary ){
    this.schoolName=SchoolName;
    this.schoolID=SchoolID;
    this.totalStrengthPrimary=TotalStrengthPrimary;
    this.totalStrengthUpperPrimary=TotalStrengthUpperPrimary;
    this.totalStrength=this.totalStrengthPrimary+this.totalStrengthUpperPrimary;
}
}