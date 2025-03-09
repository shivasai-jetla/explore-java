package training;


public class GenericExample2 {

    // Generic method with type parameter T
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] strArray = {"A", "B", "C"};

        // Call the generic method with different types
        printArray(intArray); // Prints: 1 2 3
        printArray(strArray); // Prints: A B C
    }
}

