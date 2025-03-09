package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraylistDemo1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.addAll(Arrays.asList(30,20,40)); //Multiple values at a time
        list.remove(0);
        System.out.println(list.size());
        //list.clear();

        List<Integer> sortList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortList);
        System.out.println(list.contains(10));
        System.out.println(list.get(1));
        System.out.println(list);
    }
}
