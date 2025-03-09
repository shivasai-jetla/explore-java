package Concept;

class Engine {
    public void start() {
        System.out.println("Engine started.");
    }
}

class Car {
    private Engine1 engine;

    public Car() {
        // The Car class directly creates an Engine object.
        engine = new Engine1();
    }

    public void startCar() {
        engine.start();
        System.out.println("Car started.");
    }
}

public class TightCoupling {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
    }
}
