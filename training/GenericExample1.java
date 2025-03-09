package training;

// Generic class with a type parameter T
class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericExample1 {
    public static void main(String[] args) {
        // Create a Box for Integers
        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);
        System.out.println("Integer Box: " + intBox.getValue());

        // Create a Box for Strings
        Box<String> strBox = new Box<>();
        strBox.setValue("Hello Generics");
        System.out.println("String Box: " + strBox.getValue());
    }
}

