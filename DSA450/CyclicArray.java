package DSA450;

public class CyclicArray {
    public static int[] rotate(int[] arr) {
        int n = arr.length;

        int[] a = new int[n];
        int lastValue = arr[n - 1];
        for(int i = 0; i < n - 1; i++)
        {
            a[i + 1] = arr[i];
        }
        a[0] = lastValue;

        return a;
    }


    //Alternate Way
//    public static int[] Alternaterotate(int[] arr) {
//        int n = arr.length;
//
//        int[] a = new int[n];
//        int lastValue = arr[n - 1];
//        for(int i = n - 1; i > 0; i--)
//        {
//            a[i] = arr[i - 1];
//        }
//        a[0] = lastValue;
//
//        return a;
//    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int[] result = rotate(arr);

        for(int i : result)
        {
            System.out.print(i+" ");
        }
    }
}
