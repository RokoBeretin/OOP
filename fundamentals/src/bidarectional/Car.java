package bidarectional;

public class Car {
    private String model;
    private String brand;
    private CarFactory carFactory;


    public Car(String model, String brand, CarFactory carFactory){
        this.model = model;
        this.brand = brand;
        this.carFactory = carFactory;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", carFactory=" + carFactory +
                '}';
    }
}
