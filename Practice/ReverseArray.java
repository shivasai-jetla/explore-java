package Practice;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {20,1,3,17};
        int[] arr1 = new int[arr.length];
        //int temp;
        int j = 0;

        for(int i = arr.length - 1; i >= 0; i--)
        {
            arr1[j] = arr[i];
            j++;
        }

        for(int i=0;i < arr.length;i++)
        {
            arr[i] = arr1[i];
        }

        for (int i: arr)
        {
            System.out.println(i);
        }
    }
}
