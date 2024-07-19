package assignment.testprotected;

import assignment.protectedaccess.ProtectedClass;

public class TestProtected {
    public static void main(String[] args) {
        ProtectedClass protectedClass = new ProtectedClass();
        // protectedClass.protectedMethod(); // Uncommenting this line will cause a compile-time error
    }
}
