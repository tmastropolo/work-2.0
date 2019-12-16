package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Time {
int seven = 7;
int noon = 12;

public Date  StartTime () throws ParseException {
    int hour = new Random().nextInt((12 - 7) +1) +7;
    String time = Integer.toString(hour);
    DateFormat sdf = new SimpleDateFormat("hh");
    Date date = sdf.parse(time);
    return date;
}

    public  Date FinishTime () throws ParseException {
        int hour = new Random().nextInt((11 - 1) +1) +1;
        String time = Integer.toString(hour);
        DateFormat sdf = new SimpleDateFormat("hh");
        Date date = sdf.parse(time);
        return date;
    }




}
