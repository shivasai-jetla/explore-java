package training;

public class StringBufferTest1 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Uma");
        StringBuffer sb1 = new StringBuffer("Maheshwar Rao");

        sb.append(sb1);
        System.out.println(sb);
    }
}
