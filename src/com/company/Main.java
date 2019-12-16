package com.company;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException, IOException {
        // write your code here



        Ticket tick = new Ticket();
        Time time = new Time();
        Car car = new Car();

        car.ReadFile();


        int id = car.carID;
        Double price;

        long prkHours = time.Difference();
        if (prkHours <= 3) {
            price = 5.00;
        } else if (prkHours <= 13) {
            price = (prkHours - 3) * 1.00 + 5.00;
        } else {
            price = 15.00;
        }

        Date enter = time.StartTime();
        car.entrance = enter;

        Date leave = time.FinishTime();
        car.exit = leave;

        double totalCustomer = 0.00;
        double finaltotal = 0;
        int numtickets = 0;
        int numlost = 0;
        double losttotal = numlost * 25.00;

        int choice;
        Ticket ticket = new Ticket();
        Scanner key = new Scanner(System.in);
        do {
            System.out.println("Enter a choice:\n1)Check In/Close Garage\n2)Check Out\n\n3) Exit");
            choice = key.nextInt();

            if (choice == 1) {
                // display ticket
                tick.DisplayIn();
                int in = key.nextInt();

                if (in == 1) {
                    numtickets++;
                    break;
                } else if (in == 2) {
                    // display end of day
                    finaltotal= losttotal + totalCustomer;
                    tick.DisplayEnd(totalCustomer, numtickets, numlost, losttotal, finaltotal);

                }
            } else if (choice == 2) {
                //display out

                tick.DisplayOut();
                int out = key.nextInt();

                if (out == 1) {
                    long prkHours = time.Difference();
                    if (prkHours <= 3) {
                        price = 5.00;
                    } else if (prkHours <= 13) {
                        price = (prkHours - 3) * 1.00 + 5.00;
                    } else {
                        price = 15.00;
                    }

                    //Car Exit
                    tick.DisplayCustomer(enter, leave, prkHours, price, id);
                    totalCustomer += price;


                } else if (out == 2) {
                    // Display Lost
                    numlost++;
                    tick.DisplayLost(id);

                }


            }

        } while (choice == 3);
    }



}
