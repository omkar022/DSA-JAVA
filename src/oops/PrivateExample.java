package oops;

public class PrivateExample {
    private int privateVar;

    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    public void accessPrivate() {
        privateVar = 10; // Accessible within the same class
        privateMethod(); // Accessible within the same class
    }
}
