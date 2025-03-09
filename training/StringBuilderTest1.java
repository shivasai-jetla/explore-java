package training;

public class StringBuilderTest1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Uma");
        StringBuilder sb1 = new StringBuilder("Maheshwar Rao");

        sb.append(sb1);

        System.out.println(sb);
    }
}
