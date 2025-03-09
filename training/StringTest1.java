package training;

public class StringTest1 {
    public static void main(String[] args) {
        String name = "Shiva sai";

        System.out.println("Name in Uppercase: "+name.toUpperCase());

//        for(int i = 0; i < name.length(); i++)
//        {
//            if(name.charAt(i) == 'a')
//            {
//                System.out.println("First 'a' index in name: "+i);
//                break;
//            }
//        }
//
//        for(int i = name.length() - 1; i > 0; i--)
//        {
//            if(name.charAt(i) == 'a')
//            {
//                System.out.println("Last 'a' index in name: "+i);
//                break;
//            }
//        }
        int firstIndex = name.indexOf('a');
        System.out.println("First 'a' index in name: "+ firstIndex);
        int lastIndex = name.lastIndexOf('a');
        System.out.println("Last 'a' index in name: "+lastIndex);

        System.out.println("Replace 'a' with 'e': "+name.replace('a','e'));

        char[] arr = new char[name.length()];
        for(int i = 0; i < name.length(); i++)
        {
            arr[i] = name.charAt(i);
        }

        for(char i : arr)
        {
            System.out.print(" "+i);
        }

        String[] words = name.split(" ");

        System.out.println();
        for(int i = 0;i < words.length; i++)
        {
            System.out.println(words[i]);
        }

        for(char c = 'a'; c <= 'z'; c++)
        {
            System.out.print(c+" ");
        }

    }
}
