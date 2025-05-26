package type_casting_example;

public class TypeCastingExample {
    public static void main(String[] args) {
        double doubleValue = 9.75;
        int intValue = (int) doubleValue;

        int intNumber = 42;
        double convertedDouble = (double) intNumber;

        System.out.println("Double to Int: " + intValue);
        System.out.println("Int to Double: " + convertedDouble);
    }
}
