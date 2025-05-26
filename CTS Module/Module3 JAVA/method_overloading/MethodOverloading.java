package method_overloading;

public class MethodOverloading {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Addition of two integers: " + add(5, 10));
        System.out.println("Addition of two doubles: " + add(4.5, 6.3));
        System.out.println("Addition of three integers: " + add(1, 2, 3));
    }
}
