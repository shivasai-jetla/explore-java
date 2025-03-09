package training;

public class StringTest4 {
    public static void main(String[] args) {
        String name = "SanJu0506";

        int charCount = 0;
        int intCount = 0;
        int capitalCharcount =0;

        for(int i = 0; i < name.length();i++)
        {
            if(name.charAt(i) >= 'a' && name.charAt(i) <= 'z' )
            {
                charCount++;
            } else if( name.charAt(i) >= 'A' && name.charAt(i) <= 'Z' )
             {
                 capitalCharcount++;

            } else if(name.charAt(i) > 0)
            {
                intCount++;
            }
        }
        System.out.println("Charecter Count: "+charCount);
        System.out.println("Integer Count: "+intCount);
        System.out.println("letters count: "+capitalCharcount);
    }
}
