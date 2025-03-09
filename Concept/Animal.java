package Concept;

public class Animal {
    public void sound()
    {
        System.out.println("Here is Some sounds of animals");
    }
}

class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal{
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

class Test
{
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound();
        myAnimal = new Cat();
        myAnimal.sound();
    }
}