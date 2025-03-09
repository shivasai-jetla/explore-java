package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class DemoStream {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>(List.of(10,10,20,20,80,30,40,50,60,70));

        List<Integer> filterList = num.stream().filter(n-> n < 50).collect(Collectors.toList());
        System.out.println("Numbers less than 50: "+filterList);

        List<Integer> squareNumber = num.stream().map(n -> n *10).collect(Collectors.toList());
        System.out.println("Square Numbers: "+squareNumber);

        List<Integer> square1 = num.stream().filter(n -> n < 50).map(n -> n *10).collect(Collectors.toList());
        System.out.println("Square of numbers less than 50: "+ square1);

        List<Integer> sorted = num.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted List: "+sorted);

        List<Integer> distinctList = num.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct List: " +distinctList);

        int sum = num.stream().reduce(0,(x,y) -> x+y);
        System.out.println("List Sum: "+ sum);

        long numberLength  = num.stream().count();
        System.out.println("List Length: "+numberLength);

        Optional<Integer> minNumber = num.stream().min(Integer::compareTo);

//      Optional<Integer> minNumber = num.stream().min((a,b) -> a-b);
        minNumber.ifPresent(min -> System.out.println("Minimum Number: "+min));

        Optional<Integer> maxNumber = num.stream().max(Integer::compareTo);

//      Optional<Integer> maxNumber = num.stream().max((a,b)-> a-b);
        maxNumber.ifPresent(max -> System.out.println("Maximum Number: "+max));

        OptionalDouble Average = num.stream().mapToInt(n -> n).average();
        Average.ifPresent(avg -> System.out.println("Average: "+ avg));

    }

}
