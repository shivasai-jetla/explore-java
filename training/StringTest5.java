package training;

public class StringTest5 {
    public static void main(String[] args) {

        String name = "sanju";
        int vowelCount = 0;


        for(int i = 0; i < name.length();i++)
        {
            char ch = name.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels in a String: "+vowelCount);
    }
}
