package Diksha;

class Encryption
{
    String decodeMesssage(String message)
    {
         String str = message.replaceAll("[AEIOUaeiou]","");
         return str;
    }
}

public class EncodeDecode {

    public static void main(String[] args) {
        Encryption e = new Encryption();
        System.out.println(e.decodeMesssage("QIwearee"));

    }
}
