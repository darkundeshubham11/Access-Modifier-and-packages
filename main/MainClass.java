package assignment.main;

import assignment.publicaccess.PublicClass;
import assignment.protectedaccess.SubProtectedClass;

public class MainClass {
    public static void main(String[] args) {
        // Accessing PublicClass
        PublicClass publicClass = new PublicClass();
        publicClass.publicMethod();

        // Accessing ProtectedClass via SubProtectedClass
        SubProtectedClass subProtectedClass = new SubProtectedClass();
        subProtectedClass.callProtectedMethod();

    }
}
