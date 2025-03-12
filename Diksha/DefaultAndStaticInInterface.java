package Diksha;

interface Vehicle {

    void speed();

    default void start(){
        System.out.println("Start from Vehicle");
    }
    static void stop(){

    };

}

class Car implements Vehicle{
    public void speed(){
        System.out.println("Speed");
    }

    @Override
    public void start(){
        System.out.println("Start from Car");
    }

}

public class DefaultAndStaticInInterface{
    public static void main(String[] args) {

        Vehicle v = new Car();
        v.speed();
        Car c = new Car();
        c.speed();
        c.start();
    }
}


