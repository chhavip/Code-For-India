package com.cfi.chhavi.kitchenhelper;

import com.cfi.chhavi.codeforindia.Consumption;

import java.util.List;

/**
 * Created by dell pc on 27-09-2015.
 */
public class CalculateValuesForPrediction {

    public void valuesForPrediction(){
        List<Consumption> consumptionList=Consumption.listAll(Consumption.class);
        int sumMonday=0;
        int sumTuesday=0;
        int sumWednesday=0;
        int sumThursday=0;
        int sumFriday=0;

        for(int i=0;i<40;i=i+2){
            Consumption current =consumptionList.get(i);
            int day=current.date.getDay();
            if(day==0){
                sumMonday+=current.attendanceToday;
            }
            else if(day==1){
                sumTuesday+=current.attendanceToday;

            }
            else if(day==2){
                sumWednesday+=current.attendanceToday;

            }
            else if(day==3){
                sumThursday+=current.attendanceToday;

            }
            else if(day==4){
                sumFriday+=current.attendanceToday;

            }
        }
        sumMonday=sumMonday/4;
        sumTuesday=sumTuesday/4;
        sumWednesday=sumWednesday/4;
        sumThursday=sumThursday/4;
        sumFriday=sumFriday/4;

    }
}
