package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static Date main(String[] args) throws ParseException, IOException {
        // write your code here

        Main obj = new Main();

        Ticket tick = new Ticket();
        Time time = new Time();
        Car car = new Car();

        car.ReadFile();


        int id = car.carID;
        Double price;

        long prkHours = time.Difference();
        if (prkHours <= 3){
            price = 5.00;
        }
        else if (prkHours <= 13) {
              price = (prkHours - 3) * 1.00 +5.00;
        }
        else {
            price = 15.00;
        }

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
                    tick.DisplayEnd(cktotal, numtickets, numlost, losttotal, finaltotal);

                }
            } else if (choice == 2) {
                //display out

                tick.DisplayOut();
                int out = key.nextInt();

                if (out == 1) {

                    prkStart = ticket.getStrDate();
                    parkfin = ticket.getFinDate();
                    prked = ticket.difference();
                    //Car Exit
                    tick.DisplayCustomer(prkStart, parkfin, prked, total, id);

                } else if (out == 2) {
                    // Display Lost
                    numlost++;
                    tick.DisplayLost();

                }


            }

        } while (choice == 3);


        return prkStart;
    }


}
