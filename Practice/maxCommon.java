package Practice;

class maxPeople
{
    public static int Maximum(int[] in,int[] out)
    {
        int sum = 0;
        int max = 0;
        for(int i=0; i < in.length;i++)
        {
            sum+= in[i] - out[i];

            if(sum > max)
            {
                max = sum;
            }
        }
        return max;
    }
    public static void main(String[] arg)
    {

        int[] in = {7, 0, 5, 1, 3};
        int[] out = {1, 2, 1, 3, 3};
        int output= Maximum(in,out);
        System.out.print(output);
    }
}

