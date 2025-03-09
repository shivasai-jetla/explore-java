package CollectionFramework;

import java.util.Vector;

public class VectorDemo1 {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();

        vector.add(10);
        vector.add(20);
        vector.add(30);
        //vector.removeAllElements();
        //
        vector.remove(2);

        synchronized (vector){
            for (int i: vector)
            {
                System.out.println(i);
            }
        }

        System.out.println(vector);
    }
}
