package stringPro;

public class StringDemo1 {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String hey = new String("abc");
        String hello = new String("abc");
        int s1 = 5;
        int s2 = 5;


        System.out.println(a==b);
        System.out.println(b==hey);
        System.out.println(a==hey);
        System.out.println(hey==hello);
        System.out.println(s1==s2);
    }
}
