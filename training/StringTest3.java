package training;

public class StringTest3 {
    public static void main(String[] args) {
        String name = "abb123";
        int intCount = 0;
        int charCount = 0;

        for(int i = 0; i < name.length(); i++)
        {
            int ch = name.charAt(i);
             if(Character.isAlphabetic(ch))
             {
                 intCount++;
             }
             else if(Character.isDigit(ch))
             {
                 charCount++;
             }
        }
        System.out.println("Charecter Count: "+ charCount);
        System.out.println("Integer Count: "+ intCount);
    }
}
