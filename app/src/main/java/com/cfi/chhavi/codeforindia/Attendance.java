package com.cfi.chhavi.codeforindia;

import com.orm.SugarRecord;

import java.util.Date;

/**
 * Created by dell pc on 27-09-2015.
 */
public class Attendance extends SugarRecord<Attendance> {
    int present_Today_Primary;
    int present_Today_Upper_Primary;
    Date date;
    int SchoolID;

    public Attendance(){

    }

    public Attendance(int present_Today_Primary,int present_Today_Upper_Primary, Date date, int SchoolID){
    this.present_Today_Primary=present_Today_Primary;
    this.present_Today_Upper_Primary=present_Today_Upper_Primary;
    this.date=date;
    this.SchoolID=SchoolID;
    }
}
