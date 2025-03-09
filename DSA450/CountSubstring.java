package DSA450;

public class CountSubstring {

    public static void frequencyCount()
    {
        String sentence = "This is a fish is";
        String word = "is";

        int count = 0;
        int length = word.length();

        for(int i= 0; i < sentence.length()-1;i++)
        {
            String sub = sentence.substring(i,i+length);
            if(word.equals(sub))
            {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {

        frequencyCount();
    }
}
