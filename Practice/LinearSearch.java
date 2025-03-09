package Practice;

public class LinearSearch {
    public static int targetDis(int[] a,int target)
    {
        for(int i=0;i < a.length;i++)
        {
            if(a[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={3,5,6,1,2,7};
        int target = 6;

        int result = targetDis(a,target);
        System.out.println("Target is found at index "+ result);
    }
}
