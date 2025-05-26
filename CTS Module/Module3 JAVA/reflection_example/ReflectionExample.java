package reflection_example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("reflection_example.SampleClass");

            Method[] methods = clazz.getDeclaredMethods();
            System.out.println("Methods in SampleClass:");
            for (Method method : methods) {
                System.out.println("- " + method.getName());
            }

            Constructor<?> constructor = clazz.getDeclaredConstructor(String.class);
            Object instance = constructor.newInstance("Hello, Reflection!");

            Method publicMethod = clazz.getMethod("printMessage");
            publicMethod.invoke(instance);

            Method privateMethod = clazz.getDeclaredMethod("secretMethod");
            privateMethod.setAccessible(true); 
            privateMethod.invoke(instance);
        } catch (Exception e) {
            System.out.println("Reflection error: " + e.getMessage());
        }
    }
}
