package Practice;

public class demoClass {
    String color;
    int RAM;
    int Storage;
    long Price;
    public void mobileInfo()
    {
        System.out.println("Colour: " +color);
        System.out.println("RAM: " +RAM +"GB");
        System.out.println("Price: " +Price);
        System.out.println("Storage: " +Storage +"GB");
    }
    public static void main(String[] args)
    {
        demoClass apple = new demoClass();
        apple.color = "black";
        apple.Price = 50000;
        apple.RAM = 8;
        apple.Storage = 256;
        System.out.println("Apple Specifications");
        apple.mobileInfo();
        demoClass IQ = new demoClass();
        apple.color = "white";
        IQ.Price = 40000;
        IQ.RAM = 8;
        IQ.Storage = 126;
        System.out.println("\nIQ Specifications");
        IQ.mobileInfo();
    }
}
