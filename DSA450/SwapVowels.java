package DSA450;

public class SwapVowels {

    public static void main(String[] args) {

        String name = "icecream";


        char[] nameArray = name.toCharArray();
        int vowelCount = 0;

        for(char ch: nameArray)
        {
            if(isVowel(ch))
            {
                vowelCount++;
            }
        }

        char[] vowel = new char[vowelCount];

        int index = 0;
        for(char ch: nameArray)
        {
            if(isVowel(ch))
            {
                vowel[index] = ch;
                index++;
            }
        }

        int left = 0;
        int right = vowel.length - 1;

        while(left < right)
        {
            char temp = vowel[left];
            vowel[left] = vowel[right];
            vowel[right] = temp;

            left++;
            right--;
        }

        index = 0;
        for(int i = 0;i < nameArray.length; i++)
        {
            if(isVowel(nameArray[i]))
            {
                nameArray[i] = vowel[index];
                index++;
            }
        }

        String result = new String(nameArray);
        System.out.println("Result: " + result);

    }

    private static boolean isVowel(char ch)
    {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            return true;
        }
        else{
            return false;
        }
    }
}
