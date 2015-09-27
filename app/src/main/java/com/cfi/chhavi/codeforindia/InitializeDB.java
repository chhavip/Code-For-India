package com.cfi.chhavi.codeforindia;

import java.util.Date;

/**
 * Created by dell pc on 27-09-2015.
 */
public class InitializeDB {

    public void initializing(){
        Date date=new Date(2015,9,11);
        Consumption c1=new Consumption(date, 450);
        c1.save();

        date=new Date(2015,9,21);
        Consumption c2=new Consumption(date, 460);
        c2.save();

        date=new Date(2015,9,22);
        Consumption c3=new Consumption(date, 450);
        c3.save();

        date=new Date(2015,9,23);
        Consumption c4=new Consumption(date, 470);
        c4.save();

        date=new Date(2015,9,24);
        Consumption c5=new Consumption(date, 480);
        c5.save();

        date=new Date(2015,9,25);
        Consumption c6=new Consumption(date, 440);
        c6.save();

        date=new Date(2015,9,10);
        Consumption c7=new Consumption(date, 430);
        c7.save();



        date=new Date(2015,9,11);
        Consumption ca1=new Consumption(date, 450);
        ca1.save();
        Prediction_Table pd1=new Prediction_Table(date, c1,ca1,1);
        pd1.save();

        date=new Date(2015,9,21);
        Consumption ca2=new Consumption(date, 420);
        ca2.save();
        Prediction_Table pd2=new Prediction_Table(date, c2,ca2,1);
        pd2.save();

        date=new Date(2015,9,22);
        Consumption ca3=new Consumption(date, 460);
        ca3.save();
        Prediction_Table pd3=new Prediction_Table(date, c3,ca3,1);
        pd3.save();

        date=new Date(2015,9,23);
        Consumption ca4=new Consumption(date, 450);
        ca4.save();
        Prediction_Table pd4=new Prediction_Table(date, c4,ca4,1);
        pd4.save();

        date=new Date(2015,9,24);
        Consumption ca5=new Consumption(date, 400);
        ca5.save();
        Prediction_Table pd5=new Prediction_Table(date, c5, ca5,1);
        pd5.save();

        date=new Date(2015,9,25);
        Consumption ca6=new Consumption(date, 440);
        ca6.save();
        Prediction_Table pd6=new Prediction_Table(date, c6,ca6,1);
        pd6.save();

        date=new Date(2015,9,10);
        Consumption ca7=new Consumption(date, 440);
        ca7.save();
        Prediction_Table pd7=new Prediction_Table(date, c7,ca7,1);
        pd7.save();

        date= new Date(2015,9,1);
        Consumption c8=new Consumption(date, 420);
        c8.save();
        Consumption ca8=new Consumption(date, 400);
        ca8.save();
        Prediction_Table pd8=new Prediction_Table(date, c8, ca8,1);
        pd8.save();

        date= new Date(2015,9,2);
        Consumption c9=new Consumption(date, 480);
        c9.save();
        Consumption ca9=new Consumption(date, 470);
        ca9.save();
        Prediction_Table pd9=new Prediction_Table(date, c9, ca9,1);
        pd9.save();

        date= new Date(2015,9,3);
        Consumption c10=new Consumption(date, 420);
        c10.save();
        Consumption ca10=new Consumption(date, 400);
        ca10.save();
        Prediction_Table pd10=new Prediction_Table(date, c10, ca10,1);
        pd10.save();

        date= new Date(2015,9,4);
        Consumption c11=new Consumption(date, 430);
        c11.save();
        Consumption ca11=new Consumption(date, 415);
        ca11.save();
        Prediction_Table pd11=new Prediction_Table(date, c11, ca11,1);
        pd11.save();

        date= new Date(2015,9,7);
        Consumption c12=new Consumption(date, 470);
        c12.save();
        Consumption ca12=new Consumption(date, 450);
        ca12.save();
        Prediction_Table pd12=new Prediction_Table(date, c12, ca12,1);
        pd12.save();

        date= new Date(2015,9,8);
        Consumption c13=new Consumption(date, 300);
        c13.save();
        Consumption ca13=new Consumption(date, 340);
        ca13.save();
        Prediction_Table pd13=new Prediction_Table(date, c13, ca13,1);
        pd13.save();

        date= new Date(2015,9,9);
        Consumption c14=new Consumption(date, 420);
        c14.save();
        Consumption ca14=new Consumption(date, 400);
        ca14.save();
        Prediction_Table pd14=new Prediction_Table(date, c14, ca14,1);
        pd14.save();

        date= new Date(2015,9,14);
        Consumption c15=new Consumption(date, 460);
        c15.save();
        Consumption ca15=new Consumption(date, 460);
        ca8.save();
        Prediction_Table pd15=new Prediction_Table(date, c15, ca15,1);
        pd15.save();

        date= new Date(2015,9,15);
        Consumption c16=new Consumption(date, 425);
        c16.save();
        Consumption ca16=new Consumption(date, 405);
        ca16.save();
        Prediction_Table pd16=new Prediction_Table(date, c16, ca16,1);
        pd16.save();

        date= new Date(2015,9,16);
        Consumption c17=new Consumption(date, 430);
        c17.save();
        Consumption ca17=new Consumption(date, 425);
        ca17.save();
        Prediction_Table pd17=new Prediction_Table(date, c17, ca17,1);
        pd17.save();

        date= new Date(2015,9,17);
        Consumption c18=new Consumption(date, 420);
        c18.save();
        Consumption ca18=new Consumption(date, 400);
        ca18.save();
        Prediction_Table pd18=new Prediction_Table(date, c18, ca18,1);
        pd18.save();

        date= new Date(2015,9,18);
        Consumption c19=new Consumption(date, 440);
        c19.save();
        Consumption ca19=new Consumption(date, 420);
        ca19.save();
        Prediction_Table pd19=new Prediction_Table(date, c19, ca19,1);
        pd19.save();

        date= new Date(2015,8,31);
        Consumption c20=new Consumption(date, 490);
        c8.save();
        Consumption ca20=new Consumption(date, 490);
        ca8.save();
        Prediction_Table pd20=new Prediction_Table(date, c20, ca20,1);
        pd20.save();

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
