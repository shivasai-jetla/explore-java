package Practice;

import java.util.Arrays;

public class SortRemoveDuplicate {

    static int removeDuplicates(int[] arr, int n)
    {

        Arrays.sort(arr);
        if (n == 0 || n == 1)
        {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++)
        {
            if (arr[i] != arr[i + 1])
            {
                temp[j] = arr[i];
                j++;
            }
        }
        temp[j] = arr[n - 1];
        j++;
        for(int i = 0; i < j; i++)
        {
            arr[i] = temp[i];
        }

        return j;
    }
    public static void main(String[] args)
    {
        int[] arr = { 4, 4, 5, 5 ,6 ,1, 2, 2, 3, 4};
        int n = arr.length;

        // removeDuplicates() returns new size of array
        n = removeDuplicates(arr, n);

        // Print updated array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
