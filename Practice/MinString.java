package Practice;

public class MinString {
    public static void main(String[] args) {

        String[] strArray = {"aaaa", "bb", "ccc", "d", "eeeee"};

        String minString = findMinimumString(strArray);

        System.out.println("The minimum string is: " + minString);
    }


    public static String findMinimumString(String[] array) {

        String minString = "";

        int min = array[0].length();

        for (int i = 0; i < array.length; i++) {


            int value = array[i].length();

            if(value <= min)
            {
                min = value;
                minString= array[i];
            }
        }
        return minString;
    }
}
