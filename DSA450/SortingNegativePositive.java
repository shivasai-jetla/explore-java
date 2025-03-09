package DSA450;


public class SortingNegativePositive {

    public static int[] sortPosNeg(int[] arr)
    {

        int[] a = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < 0)
            {
                a[left++] = arr[i];
            }

            else
            {
                a[right--] = arr[i];
            }

        }

        return a;
    }
    public static void main(String[] args) {

        int[] arr = {-2,2,4,1,-1,-3,};

        int[] result = sortPosNeg(arr);

        for(int i: result)
        {
            System.out.print(i+" ");
        }
    }

}
