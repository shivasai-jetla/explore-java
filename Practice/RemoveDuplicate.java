package Practice;

public class RemoveDuplicate {

    public static void printDuplicates() {
        int[] arr = {4, 4, 7, 3, 2, 1, 5, 5, 7, 2, 2, 4};
        int n = arr.length;

        boolean[] checked = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (checked[i]) {
                continue;
            }

            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    checked[j] = true;
                }
            }

            if (isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }


    public static void main(String[] args) {
        printDuplicates();
    }

}


