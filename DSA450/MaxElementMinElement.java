package DSA450;

import java.util.Arrays;

public class MaxElementMinElement {
    public  static int[] minMaxArray(int[] arr,int n)
    {
        Arrays.sort(arr);
        int[] result = new int[2];

        result[0] = arr[0];
        result[1] = arr[n - 1];
        return result;
    }



    public static void main(String[] args) {

        //Min Max With Array Class
        int[] arr = {3,10,1,4,5,9};
        int n = 6;

        int result[] = minMaxArray(arr,n);

        System.out.println("Minimum Number: "+ result[0]);
        System.out.println("Maximum Number: "+result[1]);


        //Min Max With General Method
        int[] a = {3,10,1,4,5,9};
        int max = 0;
        int min = a[0];

        for(int i = 0;i < a.length; i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }

        for(int i = 0;i < a.length; i++)
        {
            if(a[i] < min)
            {
                min = a[i];
            }
        }
        System.out.println("Minimum Number: "+min);
        System.out.println("Maximum Number: "+max);
    }
}
