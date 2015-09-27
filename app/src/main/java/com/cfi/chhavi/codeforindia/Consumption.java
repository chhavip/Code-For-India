package com.cfi.chhavi.codeforindia;

import com.orm.SugarRecord;

import java.util.Date;
import java.util.List;

/**
 * Created by dell pc on 27-09-2015.
 */
public class Consumption extends SugarRecord<Consumption> {
    public Date date;
    public int attendanceToday;
    int previousWeekAttendance;
    int previousMonthAttendance;
    public Consumption(){

    }

    public Consumption(Date date, int attendanceToday){
    this.date=date;
    this.attendanceToday=attendanceToday;
    final long MILLIS_IN_A_DAY = 1000*60*60*24;
    previousWeekAttendance=0;
    Date temp=date;
   /* for(int i=0;i<7;i++) {
        Date yesterday = new Date(temp.getTime() - MILLIS_IN_A_DAY);
        List<Attendance> c = Attendance.find(Attendance.class, "date=?", yesterday.toString());
        previousWeekAttendance=previousWeekAttendance+c.get(0).present_Today;
        temp=yesterday;
    }
    temp=date;
        for(int i=0;i<30;i++) {
            Date yesterday = new Date(temp.getTime() - MILLIS_IN_A_DAY);
            List<Attendance> c = Attendance.find(Attendance.class, "date=?", yesterday.toString());
            previousMonthAttendance=previousMonthAttendance+c.get(0).present_Today;
            temp=yesterday;
        } */
   // this.previousWeekAttendance=previousWeekAttendance;
   // this.previousMonthAttendance=previousMonthAttendance;
    }

}
