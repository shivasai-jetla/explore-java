package Concept;

class Engine1 {
    public void start() {
        System.out.println("Engine started.");
    }
}

class DieselEngine extends Engine1 {
    @Override
    public void start() {
        System.out.println("Diesel Engine started.");
    }
}

class Car1 {
    private DieselEngine2 engine;

    public Car1() {
        // The Car class now directly creates a DieselEngine object.
        engine = new DieselEngine2();
    }

    public void startCar() {
        engine.start();
        System.out.println("Car started.");
    }
}

public class ModTightCoupling {
    public static void main(String[] args) {
        Car1 car = new Car1();
        car.startCar();
    }
}
