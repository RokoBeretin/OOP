package snd;

public class Car {
    private String model;
    private String brand;
    private boolean failedToStart;
    private String yOfProduction;
    private String color;

    public Car(String model, String brand){
        this.brand = brand;
        this.model = model;
        this.failedToStart = false;
        System.out.println("The base constructor");
    }

    public Car(String model, String brand, String yOfProduction, String color){
        this(model, brand);
        this.yOfProduction = yOfProduction;
        this.color = color;
        System.out.println("Additional fields in consturction");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", failedToStart=" + failedToStart +
                '}';
    }

    public void setFailedToStart() {
        this.failedToStart = true;
        System.out.println("Something wrong with car....");
    }

    public Car repairCar(ServiceMan serviceMan){
        System.out.println(serviceMan.getClass().getSimpleName() + " repairing a car...");
        if(failedToStart){
            System.out.println("Repairing a car...");
            this.failedToStart = false;
        } else {
            System.out.println("Already good car");
        }
        return this;
    }

    public void carObjectInfo(){
        System.out.println(this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode()));
    }
}
