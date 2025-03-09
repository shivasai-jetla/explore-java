package Sorting;

//Time Complexity is O(n2)
// Minimum Index
public class SelectionSort {

    public static void main(String[] args) {
        int[] num = {5,3,1,2,8,7};

        int minIndex = 0;
        int temp = -1;

        for(int i = 0; i < num.length; i++)
        {
            minIndex = i;
            for(int j = i+1; j < num.length; j++)
            {
                if(num[j] < num[minIndex])
                {
                    minIndex = j;
                }
            }
            temp = num[minIndex];
            num[minIndex] = num[i];
            num[i] = temp;
        }
        for(int i: num)
        {
            System.out.print(" "+i);
        }
    }
}
