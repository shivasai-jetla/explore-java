package CollectionFramework;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LinkedHashSetDemo1 {

    public static void main(String[] args) {

        Set<Integer> linkedHashSet  = new LinkedHashSet<>();

        linkedHashSet.add(30);
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(40);

        System.out.println(linkedHashSet);

        System.out.println(linkedHashSet.stream().sorted().collect(Collectors.toList()));



    }
}
