package Practice;

public class MergeSort {
    public static int[] arrayDis(int[] a,int[] b,int m,int n,int p)
    {
        int[] c = new int[p];
        int i = 0,j = 0,k = 0;
        while(i < m && j < n)
        {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        for(;i < m;i++)
        {
            c[k++] = a[i];
        }
        for(; j < n;j++)
        {
            c[k++] = b[j];
        }
        return c;

    }
    public static void main(String[] args) {
        int[] a={2,4,6,8,11,18,69,90};
        int[] b={3,5,7,13,14};
        int m = a.length;
        int n = b.length;
        int p = m + n;
        int[] d = arrayDis(a,b,m,n,p);
        for (int i:d)
        {
            System.out.print(i+" ");
        }
    }
}
