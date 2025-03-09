package Concept;

class Engine2 {
    void start(){
    }
}

class PetrolEngine2 extends Engine2 {
    public void start() {
        System.out.println("Petrol Engine started.");
    }
}

class DieselEngine2 extends Engine2 {
    public void start() {
        System.out.println("Diesel Engine started.");
    }
}

class ElectricEngine2 extends Engine2{
    public void start(){
        System.out.println("Electric Engine Started");
    }
}

class Car2 {
    private Engine2 engine;

    // Dependency Injection via Constructor
    public void setCar2(Engine2 engine2) {
        this.engine = engine2;
    }

    public void startCar() {
        engine.start();
        System.out.println("Car started.");
    }
}

public class MyLooseCoupling {
    public static void main(String[] args) {
        // We can easily switch between different engine implementations.
        Engine2 petrolEngine = new PetrolEngine2();
        Car2 petrolCar = new Car2();
        petrolCar.setCar2(petrolEngine);
        petrolCar.startCar();

//        Engine2 dieselEngine = new DieselEngine2();
//        Car2 dieselCar = new Car2(dieselEngine);
//        dieselCar.startCar();
//
//        Engine2 electricEngine = new ElectricEngine2();
//        Car2 electricCar = new Car2(electricEngine);
//        electricCar.startCar();
    }
}
