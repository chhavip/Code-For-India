package com.cfi.chhavi.codeforindia;

import java.util.Date;

/**
 * Created by dell pc on 27-09-2015.
 */
public class InitializeDB {

    public void initializing(){
        Date date=new Date(2015,7,20);
        Consumption c1=new Consumption(date, 450);
        c1.save();

        date=new Date(2015,7,21);
        Consumption c2=new Consumption(date, 460);
        c2.save();

        date=new Date(2015,7,22);
        Consumption c3=new Consumption(date, 450);
        c3.save();

        date=new Date(2015,7,23);
        Consumption c4=new Consumption(date, 470);
        c4.save();

        date=new Date(2015,7,24);
        Consumption c5=new Consumption(date, 480);
        c5.save();

        date=new Date(2015,7,25);
        Consumption c6=new Consumption(date, 440);
        c6.save();

        date=new Date(2015,7,26);
        Consumption c7=new Consumption(date, 430);
        c7.save();



        date=new Date(2015,7,20);
        Consumption ca1=new Consumption(date, 450);
        ca1.save();
        Prediction_Table pd1=new Prediction_Table(date, c1,ca1,1);
        pd1.save();

        date=new Date(2015,7,21);
        Consumption ca2=new Consumption(date, 420);
        ca2.save();
        Prediction_Table pd2=new Prediction_Table(date, c2,ca2,1);
        pd2.save();

        date=new Date(2015,7,22);
        Consumption ca3=new Consumption(date, 460);
        ca3.save();
        Prediction_Table pd3=new Prediction_Table(date, c3,ca3,1);
        pd3.save();

        date=new Date(2015,7,23);
        Consumption ca4=new Consumption(date, 450);
        ca4.save();
        Prediction_Table pd4=new Prediction_Table(date, c4,ca4,1);
        pd4.save();

        date=new Date(2015,7,24);
        Consumption ca5=new Consumption(date, 400);
        ca5.save();
        Prediction_Table pd5=new Prediction_Table(date, c5, ca5,1);
        pd5.save();

        date=new Date(2015,7,25);
        Consumption ca6=new Consumption(date, 440);
        ca6.save();
        Prediction_Table pd6=new Prediction_Table(date, c6,ca6,1);
        pd6.save();

        date=new Date(2015,7,26);
        Consumption ca7=new Consumption(date, 440);
        ca7.save();
        Prediction_Table pd7=new Prediction_Table(date, c7,ca7,1);
        pd7.save();


        Kitchen kitchen1=new Kitchen("Visakhapatnam Kitchen",1);
        kitchen1.save();
         School school1=new School("Sarvodaya Vidyalaya", 1, 250, 250, 1);
        school1.save();
        School school2=new School("Bal Bharti", 2, 250, 250, 1);
        school2.save();

        Kitchen kitchen2=new Kitchen("Guwahati Kitchen",2);
        kitchen2.save();
        School school3=new School("Vidya Mandir", 3, 250, 250,2);
        school3.save();
        School school4=new School("Sarvodaya Vidyalaya", 4, 250, 250, 2);
        school4.save();

        Kitchen kitchen3=new Kitchen("Bengaluru Kitchen",3);
        kitchen3.save();
        School school5=new School("Kendriya Vidyalaya", 5, 250, 250, 3);
        school5.save();
        School school6=new School("Bal Bhavan", 6, 250, 250, 3);
        school6.save();

        Delivery delivery1=new Delivery("Mohan", 1);
        delivery1.save();

        Delivery delivery2=new Delivery("Rohan", 2);
        delivery2.save();

        Delivery delivery3=new Delivery("Sohan", 3);
        delivery3.save();

        Delivery delivery4=new Delivery("Kannan", 4);
        delivery4.save();

        Kitchen_Delivery_School kds1=new Kitchen_Delivery_School(kitchen1,delivery1,school1);
        kds1.save();

        Kitchen_Delivery_School kds2=new Kitchen_Delivery_School(kitchen1,delivery1,school2);
        kds1.save();

        Kitchen_Delivery_School kds3=new Kitchen_Delivery_School(kitchen2,delivery2,school3);
        kds3.save();

        Kitchen_Delivery_School kds4=new Kitchen_Delivery_School(kitchen2,delivery2,school4);
        kds4.save();

        Kitchen_Delivery_School kds5=new Kitchen_Delivery_School(kitchen3,delivery3,school5);
        kds5.save();

        Kitchen_Delivery_School kds6=new Kitchen_Delivery_School(kitchen3,delivery4,school6);
        kds6.save();

    }
}
