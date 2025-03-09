package DSA450;

public class Ascending0s1s2s {

    public static int[] ascending(int[] arr)
    {
        int a = 0;
        int b = 0;
        int c = 0;

        int[] arr1 = new int[arr.length];

        for(int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i] == 0)
            {
                a++;
            }

            else if(arr[i] == 1)
            {
                b++;
            }

            else if(arr[i] == 2)
            {
                c++;
            }
        }

        for(int i = 0; i < a; i++)
        {
            arr[i] = 0;
        }

        for(int i = a; i < a+b; i++)
        {
            arr[i] = 1;
        }

        for(int i = a+b; i < arr.length ; i++)
        {
            arr[i] = 2;
        }

        return arr;
    }


    public static void main(String[] args) {

        int arr[] = {2,2,0,1,0,1,0};

        int[] result = ascending(arr);

        for(int i : result)
        {
            System.out.print(i+" ");
        }


    }
}
