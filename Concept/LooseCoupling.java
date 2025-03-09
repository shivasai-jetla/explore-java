package Concept;

interface Engine3 {
    void start();
}

class PetrolEngine3 implements Engine3 {
    public void start() {
        System.out.println("Petrol Engine started.");
    }
}

class DieselEngine3 implements Engine3 {
    public void start() {
        System.out.println("Diesel Engine started.");
    }
}

class ElectricEngine3 implements Engine3{
    public void start(){
        System.out.println("Electric Engine Started");
    }
}

class Car3 {
    private Engine3 engine;

    // Dependency Injection via Constructor
    public Car3(Engine3 engine) {
        this.engine = engine;
    }

    public void startCar() {
        engine.start();
        System.out.println("Car started.");
    }
}

public class LooseCoupling {
    public static void main(String[] args) {
        // We can easily switch between different engine implementations.
        Engine3 petrolEngine = new PetrolEngine3();
        Car3 petrolCar = new Car3(petrolEngine);
        petrolCar.startCar();

        Engine3 dieselEngine = new DieselEngine3();
        Car3 dieselCar = new Car3(dieselEngine);
        dieselCar.startCar();

        Engine3 electricEngine = new ElectricEngine3();
        Car3 electricCar = new Car3(electricEngine);
        electricCar.startCar();
    }
}
