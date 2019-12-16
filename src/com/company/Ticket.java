package com.company;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Date;

public class Ticket {
    int carID;

    public int getCarsGarage() {
        return carsGarage;
    }
    /*Number of cars in garage */
    public void setCarsGarage(int carsGarage) {
        carsGarage ++;
        this.carsGarage = carsGarage;
    }

    public int getCarsLost() {
        return carsLost;
    }

    //Number of Cars Lost
    public void setCarsLost(int carsLost) {
        carsLost ++;
        this.carsLost = carsLost;
    }

    public Date getStartTime() {
        return startTime;
    }

    //What time they enter the garage
    public void setStartTime(Date startTime) throws ParseException {
        this.startTime = time.StartTime();
    }

    public Date getFinTime() {
        return finTime;
    }

    //What time they leave the garage
    public void setFinTime(Date finTime) throws ParseException {
        this.finTime = time.FinishTime();
    }

    public double getTickCost() {
        return tickCost;
    }

    public void setTickCost(int tickCost) {
        this.tickCost = tickCost;
    }

    public double getEndOfDay() {
        return endOfDay;
    }

    public void setEndOfDay(int endOfDay) {
        this.endOfDay = endOfDay;
    }

    public double getFinalTotal() {
        return finalTotal;
    }

    //Lost tickets+ reg tickets
    public void setFinalTotal(double finalTotal) {
        finalTotal = carsLost * 25.00 ;
        this.finalTotal = finalTotal;
    }


    int carsGarage;
    int carsLost;
    Date startTime;
    Date finTime;
    double tickCost;
    double endOfDay;
    double finalTotal;
    Time time = new Time();
    Car car = new Car();

    public void DisplayIn(){
        System.out.println("Best Value Parkig Garage");
        System.out.println("========================");
        System.out.println("1 - Check-In");
        System.out.println("2 - Check-Out");
        System.out.println("3 - Close Garage");
        System.out.print("=> ");

    }

    public void DisplayCheckInType(){
        System.out.println("Best Value Parkig Garage");
        System.out.println("Check-In");
        System.out.println("========================");
        System.out.println("1 - Ticket");
        System.out.println("2 - Special Event");
        System.out.print("=> ");
    }

    public void DisplayTicketID(){
        System.out.println("Best Value Parkig Garage");
        System.out.println("Check-Out - Ticket");
        System.out.println("========================");
        System.out.println("Ticket Number =>");
    }

    public void ReceiptIN(int carID, Date startTime){
        System.out.println("Best Value Parkig Garage");
        System.out.println("========================");
        System.out.println("Receipt for a vehicle id #" +carID );
        System.out.println("\n\n" + startTime);
    }
    public void ReceiptOut(int carID, long diff, Date startTime, Date finTime, double total){
        System.out.println("Best Value Parkig Garage");
        System.out.println("========================");
        System.out.println("Ticket for a vehicle id #" +carID );
        System.out.println("\n\n" + diff + "hours parked  " + startTime +"am - " + finTime + "pm");
        System.out.println("$" + total);
    }

    public void DisplayEnd(double cktotal, int numevents, int numtickets, int numLost, double event, double lost, double finalTotal ) {
        System.out.println("Best Value Parking Garage");
        System.out.println("=========================");
        System.out.println("Activity to Date");
        System.out.println("$" + cktotal + " was collected from " + numtickets + " Check Ins");
        System.out.println("$" + event + " was collected from " + numevents + " Lost Tickets");
        System.out.println("$" + lost + " was collected from " + numLost + " Lost Tickets");
        System.out.println("$" + finalTotal + " was collected overall");
    }

    public void DisplayOut(){
        System.out.println("Best Value Parkig Garage");
        System.out.println("========================");
        System.out.println("1 - Check/Out");
        System.out.println("2 - Lost Ticket");
        System.out.print("=> ");
    }

    public void DisplayCustomer(Date startTime, Date finTime, long prkTime, double total, int carID){
        System.out.println("Best Value Parkig Garage");
        System.out.println("========================");
        System.out.println("Receipt for a vehicle id " + carID);
        System.out.println(prkTime + " hours parked  " + startTime + "am - " + finTime + "pm");
        System.out.println("$" + total);
    }

    public void DisplayLost(int carID){
        System.out.println("Best Value Parking Garage");
        System.out.println("=========================");
        System.out.println("Receipt for a vehicle id " + carID);
        System.out.println("Lost Ticket");
        System.out.println("$25.00");
    }

    public void DisplayEvent(int carID){
        System.out.println("Best Value Parking Garage");
        System.out.println("=========================");
        System.out.println("Receipt for a vehicle id " + carID);
        System.out.println("Special Event");
        System.out.println("$20.00");
    }



}
