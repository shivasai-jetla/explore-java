package DSA450;

public class MaxContiguousSubArray {

    public static void main(String[] args) {
        int[] arr = {3,2,1,7,-1,4};

        int maxCount = 0;


        // Alternative method time complexity is O(n2)
        /*for(int i =0; i < arr.length; i++)
        {
            int curCount = 0;
            for(int j = i; j < arr.length; j++)
            {
                curCount += arr[j];
            }

            if(curCount > maxCount)
            {
                maxCount = curCount;
            }

            if(curCount < 0)
            {
                curCount = 0;
            }
        }*/


        //Kadane algorithm time complexity O(n)
        int curSum = 0;

        for(int i = 0; i < arr.length; i++)
        {


            curSum += arr[i];

            if(curSum > maxCount)
            {
                maxCount = curSum;
            }

            if(curSum < 0)
            {
                curSum = 0;
            }
        }


        System.out.println(maxCount);
    }
}
