package Practice;

public class RemoveDuplicate {

    public static void removeDup()
    {
        int[] arr = {4,4,7,3,2,1,5,5,7,2,2,4};
        int j = 0;

        for(int i = 0; i < arr.length - 1; i++)
        {
            boolean isDuplicate = false;
            for(int k = 0; k < j; k++)
            {
                if(arr[i] == arr[k])
                {
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate)
            {
                arr[j] = arr[i];
                j++;
            }
        }


        for(int i = 0; i < j; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {

        removeDup();
    }
}
