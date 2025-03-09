package Practice;

import java.util.Scanner;

public class AddArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of the array1 and array2");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] arr1 = new int[a][b];
        int[][] arr2 = new int[a][b];
        int[][] result = new int[a][b];

        System.out.println("Enter Array1: ");

        for(int i = 0;i < a;i++)
        {
            for(int j = 0; j < b; j++)
            {

                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Array2: ");
        for(int i = 0;i < a;i++)
        {
            for(int j = 0; j < b; j++)
            {

                arr2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0;i < a;i++) {
            for (int j = 0; j < b; j++)
            {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }

        }

        for(int i = 0; i < a; i++)
        {
            System.out.println();
            for(int j= 0; j < b; j++)
            {
                System.out.print(result[i][j]+" ");
            }
        }

    }
}
