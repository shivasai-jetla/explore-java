package DSA450;

public class ReverseArray {
    public static void main(String[] args) {
        int a[] = {2,4,5,7,1};

        for(int i = a.length - 1; i >= 0 ; i--)
        {
            System.out.print(a[i] +" ");
        }
    }
}
