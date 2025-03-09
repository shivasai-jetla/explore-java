package Practice;

public class frequncyArray {
    public static void main(String[] args) {
        int[] num = {2,3,3,2,2,3,3,4,5};
        int count;

        for(int i = 0; i < num.length - 1; i++)
        {
            count = 0;
            if(num[i] == num[i+1])
            {
                continue;
            }
            else {
                for (int j = 0; j < num.length; j++) {
                    if (num[i] == num[j]) {
                        count++;
                    }
                }
            }
            System.out.println(num[i] +" count: "+ count);
        }
    }



}
