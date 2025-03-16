package Diksha;

import java.util.*;

public class PolicyBazaar {
    public static void main(String[] args) {

        HashMap<Integer, String> sentenceMap = new HashMap<>();
        sentenceMap.put(1, "Java is a programming language");
        sentenceMap.put(2, "HashMap Java key-value pairs");
        sentenceMap.put(3, "Functional interfaces are powerful in Java");
        sentenceMap.put(4, "HashMap allows fast lookup");


        String searchWord = "Java";


        for (Map.Entry<Integer, String> entry : sentenceMap.entrySet()) {
            if (entry.getValue().contains(searchWord)) {
                System.out.println("Word found in Key: " + entry.getKey());
            }
        }
    }
}

