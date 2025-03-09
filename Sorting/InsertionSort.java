package Sorting;

//Time complexity : n log n
public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {6,3,1,2,7,4};

        for(int i = 1; i < arr.length; i++)
        {
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key )
            {
                arr[j+1] = arr[j];
                j = j - 1;
            }

            arr[j+1] = key;
        }

        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
}
