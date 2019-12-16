package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Time {
    int seven = 7;
    int noon = 12;

    public Date StartTime() throws ParseException {
        int hour = new Random().nextInt((12 - 7) + 1) + 7;
        String time = Integer.toString(hour);
        DateFormat sdf = new SimpleDateFormat("hh");
        Date date = sdf.parse(time);
        return date;
    }

    public Date FinishTime() throws ParseException {
        int hour = new Random().nextInt((11 - 1) + 1) + 1;
        String time = Integer.toString(hour);
        DateFormat sdf = new SimpleDateFormat("hh");
        Date date = sdf.parse(time);
        return date;
    }

    public long Difference() throws ParseException {
        Date start = StartTime();
        Date finish = FinishTime();

        long str = start.getTime();
        long fin = finish.getTime();

        long difference = fin - str;

        return difference;
    }


}
