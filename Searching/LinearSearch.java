package Searching;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {4,1,2,3,7,6};
        int key = 7;

        boolean flag = false;
        int index = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == key)
            {
                flag = true;
                index = i;
            }
        }

        if(flag == true)
        {
            System.out.println("Key "+key+" found at index "+index);
        }
        else {
            System.out.println("key not found");
        }
    }
}
