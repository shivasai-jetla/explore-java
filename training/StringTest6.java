package training;

public class StringTest6 {

    public static void main(String[] args) {
         String name = "Uma";

         for(int i = 0; i < name.length(); i++)
         {
             char ch = name.charAt(i);

             int AsciiNum = (char) ch;
             System.out.println(ch+": "+AsciiNum);
         }
    }
}
