package Sorting;

public class MergeSort {

    private static void mergeSort(int[] arr, int l, int r) {

        if(l < r)
        {
            int mid  = (l + r) / 2;

            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);

            Merge(arr,l,mid,r);
        }

    }

    private static void Merge(int[] arr, int l, int mid, int r) {

        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        for(int x = 0;x < n1; x++)
        {
            lArr[x] = arr[l + x];
        }

        for(int x = 0;x < n2; x++)
        {
            rArr[x] = arr[mid + 1 + x];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while(i < n1 && j < n2)
        {
            if(lArr[i] <= rArr[j])
            {
                arr[k] = lArr[i];
                i++;
            }

            else
            {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        while(i < n1)
        {
            arr[k] = lArr[i];
            i++;
            j++;
        }

        while(j < n2)
        {
            arr[k] = rArr[j];
            i++;
            j++;
        }
    }

    public static void main(String[] args) {

        int[] arr = {44,4,232,12,6,51};

        mergeSort(arr,0,arr.length - 1);

        for(int i: arr)
        {
            System.out.print(" "+i);
        }
    }
}
