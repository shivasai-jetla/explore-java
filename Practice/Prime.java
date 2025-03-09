package Practice;

public class Prime {
    public static void main(String[] args) {
        int n = 30;
        int count;
        for (int i = 2; i <= n; i++) {
            count = 0;
            for (int j = 2; j < i/2 ; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count < 1) {
                System.out.println(i);
            }
        }
    }

}