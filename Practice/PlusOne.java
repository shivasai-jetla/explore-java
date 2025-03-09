package Practice;

public class PlusOne {

    public static void addOne()
    {
        int[] arr = {1,2,3,2,1};

        for(int  i = arr.length - 1; i >= 0; i--)
        {
            if(arr[i] < 9 )
            {
                arr[i]++; // arr[i] = arr[i] + 1

                for(int j : arr) {
                    System.out.print(j + " ");
                }

                return; // It breaks here and return the array and for early exit if we get expect one.
            }
            arr[i] = 0;
        }

        arr = new int[arr.length + 1];
        arr[0] = 1;


    }

    // With method return
    /* public static void addOne()
    {
        int[] arr = {1,2,3,2,9};

        for(int  i = arr.length - 1; i >= 0; i--)
        {
            if(arr[i] < 9 )
            {
                arr[i]++; // arr[i] = arr[i] + 1
                return; // It breaks here and return the array
            }
            arr[i] = 0;
        }

        arr = new int[arr.length + 1];
        arr[0] = 1;

        for(int i : arr) {
            System.out.print(i + " ");
        }

    } */

    public static void main(String[] args) {
        addOne();

    }
}
