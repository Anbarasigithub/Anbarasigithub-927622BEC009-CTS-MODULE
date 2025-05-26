package bytecode_inspector;

public class BytecodeInspector {
    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        BytecodeInspector inspector = new BytecodeInspector();
        System.out.println("Result: " + inspector.multiply(3, 4));
    }
}
