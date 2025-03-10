package snd;

public class TestApp {
    public static void main(String[] args) {
        Car car = new Car("M5", "BMW");
        car.carObjectInfo();
        System.out.println(car);
        car.setFailedToStart();
        System.out.println(car);
        car = car.repairCar(new ServiceMan(100));
        System.out.println(car);
        car.carObjectInfo();
        Car sndCar = new Car("Y3", "Toyota", "2020", "blue");
    }
}
