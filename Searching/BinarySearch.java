package Searching;

public class BinarySearch {
    public  static int Searching(int target,int[] arr)
    {
        int left = 0;
        int right = arr.length - 1;
        while(left <= right)
        {
            int mid = (left + right)/2;
            if(arr[mid] == target)
            {
                return mid;
            }

            if(arr[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr = {2,6,10,21,32,42,54,61,76,81};
        int target = 42;
        int index = Searching(target,arr);
        if(index == -1) {
            System.out.println("Target Not Found");
        }
        else {
            System.out.println("Target " + target + " is found at " +"index "+index);
        }
    }

}
