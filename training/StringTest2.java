package training;

//Telugu alphabets
public class StringTest2 {
    public static void main(String[] args) {
        int unicode = 3077;
        for(int i = 0; i < 55;i++)
        {
            char telugu = (char) (unicode + i);
            System.out.println(telugu);
        }
    }
}
