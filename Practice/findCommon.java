package Practice;

import java.util.*;
class findCommon
{
    static void FindCom(String[] arr1,String[] arr2)
    {
        Set<String> set= new HashSet<>();
        //if we use set we avoid duplicate elements
        for(int i=0;i < arr1.length;i++)
        {
            for(int j=0;j < arr2.length;j++)
            {
                if(arr1[i].equals(arr2[j]))
                {
                    set.add(arr1[i]);
                    break;
                }
            }
        }
        for(String i:set)
        {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] arg)
    {
        String[] arr1= {"Article", "in", "Geeks", "fors", "Geeks"};
        String[] arr2= {"Geeks", "for", "Geeks","in"};
        FindCom(arr1,arr2);
    }
}

