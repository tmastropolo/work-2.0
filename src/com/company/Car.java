package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Car {
    int carID = 0;
    Date entrance;
    Date exit = null;
    boolean event = false;

    public boolean isEvent() {
        return event;
    }

    public void setEvent(boolean event) {
        this.event = event;
    }


    Time time = new Time();

    public Date getExit() {
        return exit;
    }

    public void setExit(Date exit) throws ParseException {
        this.exit = time.FinishTime();
    }

    public int getCarID() {
        return carID;
    }

    /**
     * Creat carid
     * @param carID
     */
    public void setCarID(int carID) {
        carID ++;
        this.carID = carID;

    }

    public Date getTime() {
        return entrance;
    }

    public void setTime(Date tim) throws ParseException {
        this.entrance = time.StartTime();
    }

    /**
     * Read out of file into car object.
     * @throws IOException
     * @throws ParseException
     */
    public void ReadFile() throws IOException, ParseException {
        Car car = new Car();
        Path path = Paths.get("src/Garage.txt");
        Scanner scanner = new Scanner(path);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] ticket = line.split(",");
            car.carID = Integer.parseInt(ticket[0]);
            DateFormat dateFormat = new SimpleDateFormat("hh");
            car.entrance = dateFormat.parse((ticket[1]));
            car.exit = dateFormat.parse((ticket[2]));
        }
        return;
    }

    /**
     * @throws IOException
     * Writes into File
     */
    public void WritetoFile() throws IOException {
        Car car = new Car();
        carID ++;
        FileWriter fileWriter = new FileWriter("src/Garage.txt");
        fileWriter.write(String.valueOf(car.carID +"," + car.entrance+ "," + car.event + "," + car.exit ));
        fileWriter.close();
        return;
    }


}
