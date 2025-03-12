package Diksha;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        Optional<String> empty = Optional.empty();

        if(empty.isEmpty())
        {
            System.out.println("Empty Class");
        }
        else{
            System.out.println("Contains value");
        }
    }
}
