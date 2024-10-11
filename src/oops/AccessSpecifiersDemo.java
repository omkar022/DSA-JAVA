package oops;

public class AccessSpecifiersDemo {
    public static void main(String[] args) {
        // Public access
        PublicExample publicExample = new PublicExample();
        publicExample.publicVar = 5; // Accessible
        publicExample.publicMethod(); // Accessible

        // Private access
        PrivateExample privateExample = new PrivateExample();
        privateExample.accessPrivate(); // Accessible, invokes private method internally

        // Protected access
        SubClass subClass = new SubClass();
        subClass.accessProtected(); // Accessible

        // Default access
        DefaultExample defaultExample = new DefaultExample();
        defaultExample.defaultVar = 15; // Accessible within the same package
        defaultExample.defaultMethod(); // Accessible within the same package
    }
}
