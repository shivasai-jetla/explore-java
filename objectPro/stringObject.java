package objectPro;

public class stringObject {

    String name;

    public stringObject  (String name)
    {
        this.name = name;
    }

    public static stringObject show()
    {
        stringObject strObj = new stringObject("Hello");
        return strObj;

        // return new stringObject("Hello");
    }



    public static void main(String[] args) {

        String name = show().toString();

        String name1 = show().name;

        System.out.println(name);
        System.out.println(name1);
    }
}
