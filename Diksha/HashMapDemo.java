package Diksha;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo  {

    public static void main(String[] args) {

        Map<Integer,String> hm = new HashMap<>();

        hm.put(1,"ram");
        hm.put(null,"sure");
        hm.put(4,"john");
        hm.remove(4);
        System.out.println(hm.size());

        System.out.println(hm.containsKey(1));

        System.out.println(hm.get(null));

        System.out.println(hm.keySet());

        System.out.println();

        for(Map.Entry<Integer,String> m: hm.entrySet())
        {
            System.out.println(m.getKey());
        }
    }
}
