package com.company;

import java.io.Console;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException, IOException {
        // write your code here

/**
 * Inherit Classes
 */
        Ticket tick = new Ticket();
        Time time = new Time();
        Car car = new Car();


        int id = car.carID;
        Double price;

        long prkHours;
        int checkoutID;


        double totalCustomer = 0.00;
        double finaltotal = 0;
        int numtickets = 0;
        int numlost = 0;
        int numevents = 0;

/**
 * Start of program
 */
        int choice;
        Ticket ticket = new Ticket();
        Scanner key = new Scanner(System.in);
        do {
            car.ReadFile();
            Date enter = time.StartTime();
            car.entrance = enter;

            Date leave = time.FinishTime();
            car.exit = leave;

            System.out.println("Enter a choice:\n1)Check In/Close Garage\n2)Check Out\n3) Close Garage\n4) Exit");
            choice = key.nextInt();

            if (choice == 1) {
                /**
                 * Display ticket                  */

                tick.DisplayIn();
                int in = key.nextInt();

                if (in == 1) {

                    tick.DisplayCheckInType();
                    int type = key.nextInt();
                    if (type == 1) {
                        tick.ReceiptIN(id, enter);
                        numtickets++;
                    } else if (type == 2) {
                        tick.ReceiptIN(id, enter);
                        numevents++;
                        car.event = true;
                    }
                } else if (in == 2) {
                    int out;
                    tick.DisplayOut();
                    out = key.nextInt();

                    if (out == 1) {
                        tick.DisplayTicketID();
                        checkoutID = key.nextInt();

                        //Match Id

                        if (car.event = false) {
                            tick.DisplayEvent(checkoutID);
                        } else {
                            prkHours = time.Difference();
                            if (prkHours <= 3) {
                                price = 5.00;
                            } else if (prkHours <= 13) {
                                price = (prkHours - 3) * 1.00 + 5.00;
                            } else {
                                price = 15.00;
                            }
                            tick.DisplayCustomer(car.entrance, car.exit, prkHours, price, checkoutID);
                            totalCustomer += price;
                        }
                    } else if (out == 2) {
                        tick.DisplayLost(id);
                        numlost++;

                    } else if (in == 3) {
                        // display end of day
                        double losttotal = numlost * 25.00;
                        double eventtotal = numevents * 20.00;
                        finaltotal = losttotal + numevents + totalCustomer;

                        tick.DisplayEnd(totalCustomer, numevents, numtickets, numlost, eventtotal, losttotal, finaltotal);

                    }
                }
            }

        }
        while (choice == 4);
    }


}
