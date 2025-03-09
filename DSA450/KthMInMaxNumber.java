package DSA450;

import java.util.Arrays;

public class KthMInMaxNumber {
    public static int smallestKthNumber(int[] arr,int k)
    {
        Arrays.sort(arr);

        return arr[k - 1];
    }

    public  static int largestKthNumber(int[] arr,int k)
    {
        Arrays.sort(arr);

        return arr[arr.length - k];
    }


    public static void main(String[] args) {
        int[] arr = {6,2,4,5,8,3};
        int k = 3;

        int kthSmallest = smallestKthNumber(arr,k);
        int kthLargest  = largestKthNumber(arr,k);

        System.out.println(k +" smallest: "+kthSmallest);
        System.out.println(k +" largest: "+kthLargest);
    }
}
