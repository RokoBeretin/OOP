package pckg_vj4;

import java.util.Date;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected Date dateProduction;
    private int vehicleID;
    private static int cnt = 10;
    private static final String DatePattern = "dd.MM.yyyy.";


    protected Vehicle(String model){
        this.model = model;
        this.vehicleID = cnt++;

    }

    protected Vehicle(String model, String brand){
        this(model);
        this.brand = brand;

    }

    public void start(){
        System.out.println("Starting some: " + this.getClass().getSimpleName());
    }

    public void stop(){
        System.out.println("Stopping some: " + this.getClass().getSimpleName());
    }

    protected abstract void info();
}
