package oops;

public class ProtectedExample {
    protected int protectedVar;

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }
}

class SubClass extends ProtectedExample {
    public void accessProtected() {
        protectedVar = 20; // Accessible in subclass
        protectedMethod(); // Accessible in subclass
    }
}
