package com.cfi.chhavi.codeforindia;

import com.orm.SugarRecord;

import java.util.Date;

/**
 * Created by dell pc on 27-09-2015.
 */
public class Consumption extends SugarRecord<Consumption> {
    Date date;
    int attendanceToday;
    int previousWeekAttendance;
    int previousMonthAttendance;

    public Consumption(){

    }

    public Consumption(Date date, int attendanceToday){
    this.date=date;
    this.attendanceToday=attendanceToday;
   // this.previousWeekAttendance=previousWeekAttendance;
   // this.previousMonthAttendance=previousMonthAttendance;
    }
}
