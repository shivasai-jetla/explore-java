package Test;


public class TestArray {

    public static void binarySearch()
    {

        int[] arr = {3,2,1,1,2,7,4,4};
        int j = 0;

        for(int i = 0; i < arr.length; i++)
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


        for(int x = 0; x < j; x++)
        {
            System.out.print(arr[x]+" ");
        }
    }

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Array Size: ");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//        System.out.println("Enter Array: ");
//        for (int i = 0; i < size; i++) {
//            arr[i] = sc.nextInt();
//        }

        binarySearch();

    }
}
