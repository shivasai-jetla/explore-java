package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

//Set doesn't allow duplicate values
public class HashSetDemo1 {

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(50);
        hashSet.add(50);

        System.out.println(hashSet);

    }
}
