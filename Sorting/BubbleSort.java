package Sorting;

//Time Complexity O(n2)
public class BubbleSort {

    public static void main(String[] args) throws InterruptedException {
        int[] arr = {2,1,3,4,5};
        int temp = 0;
        int count = 0;
        boolean flag;

        for(int i = 0; i < arr.length; i++)
        {
            flag = false;
            for(int j = 0; j < arr.length - i - 1; j++)
            {
                count++;
                if(arr[j+1] < arr[j])
                {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if(flag == false)
            {
                break;
            }
        }
        System.out.println("No.of comparisons: "+count);
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}
