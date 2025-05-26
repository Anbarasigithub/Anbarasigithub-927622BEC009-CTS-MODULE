package type_matcher;

public class TypeMatcher {
    public static void typeCheck(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("Integer detected: " + i);
            case String s -> System.out.println("String detected: " + s);
            case Double d -> System.out.println("Double detected: " + d);
            default -> System.out.println("Unknown type");
        }
    }

    public static void main(String[] args) {
        typeCheck(42);
        typeCheck("Hello");
        typeCheck(3.14);
    }
}
