package com.company;

import java.text.ParseException;
import java.util.Date;

public class Car {
    int carID = 0;
    Date entrance;

    Time time = new Time();

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        carID ++;
        this.carID = carID;

    }

    public Date getTim() {
        return entrance;
    }

    public void setTim(Date tim) throws ParseException {
        this.entrance = time.StartTime();
    }


}
