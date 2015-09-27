package com.cfi.chhavi.codeforindia;

/**
 * Created by chhavi on 27/9/15.
 */
public class Utility {

    public static int totalPeople(int day, int previousAvg, int totalStrenght){
        float tasteFactor = 0;
        float adjustmentFactor = 5f;
        float nearHoliday = 0;
        switch (day){
            case 0:
                tasteFactor = 1.7f;
                nearHoliday = 0f;
                break;
            case 1:
                tasteFactor = 0.8f;
                nearHoliday = 0f;
                break;
            case 2:
                tasteFactor = 2f;
                nearHoliday = 0f;
                break;
            case 3:
                tasteFactor = 1.6f;
                nearHoliday = 0.5f;
                break;
            case 4:
                tasteFactor = 1.2f;
                nearHoliday = 0.8f;
                break;



        }

        float studentsPresent = (float)(0.4*0.9*totalStrenght + 0.6*previousAvg);
        float percentage = 0f;

        percentage+= (adjustmentFactor +tasteFactor  - nearHoliday*8);
        int result = (int)(studentsPresent*percentage/100);

        return result;


    }
}
