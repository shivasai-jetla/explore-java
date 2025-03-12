package Diksha;

public class ColorCodeValidator {
    String str = "#A1B3KC1";

    int validateHexa()
    {
        if(str.matches("^#[A-fa-f0-9]{6}$"))
        {
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        ColorCodeValidator c = new ColorCodeValidator();
        System.out.println(c.validateHexa()==1?"Valid":"Not Valid");
    }


}
