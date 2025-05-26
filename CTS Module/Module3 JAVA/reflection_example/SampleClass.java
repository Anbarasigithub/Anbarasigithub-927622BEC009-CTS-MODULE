package reflection_example;

public class SampleClass {
    private String message;

    public SampleClass(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Message: " + message);
    }

    private void secretMethod() {
        System.out.println("This is a private method.");
    }
}
