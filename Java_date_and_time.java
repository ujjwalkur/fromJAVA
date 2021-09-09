package com.company;
import java.util.Calendar;
import java.util.GregorianCalendar;

import java.util.Date;
import java.util.TimeZone;

public class Java_date_and_time {
    public static void main(String[] args) {
        GregorianCalendar cl = new GregorianCalendar();
        System.out.println(cl.isLeapYear(2008));
        System.out.println(cl.getWeekYear());
        System.out.println(cl.getGregorianChange());
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);

        /*
        Calendar c1 = Calendar.getInstance();
        System.out.println(c1.get(Calendar.DATE));
        System.out.println(c1.get(Calendar.ERA));
        System.out.println(c1.get(Calendar.DAY_OF_MONTH));
        System.out.println(c1.get(Calendar.DAY_OF_YEAR));
        System.out.println(c1.get(Calendar.HOUR_OF_DAY)+":"+c1.get(Calendar.MINUTE) );
         */

        /*
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());

         */

       /*
       Calendar c1 = Calendar.getInstance();
        System.out.println(c1.getCalendarType());
        System.out.println(c1.getTimeZone());

        System.out.println(c1.getActualMaximum(10));
        */


        /*
        Date d = new Date();

       System.out.println(d);
         */

//        System.out.println(d.getTime()); --> Deprecated
//        System.out.println(d.getDate()); --> Deprecated
//        System.out.println(d.getMonth()); --> Deprecated

    }
}
