package assignment.privateaccess;

public class TestPrivate {
    public static void main(String[] args) {
        PrivateClass privateClass = new PrivateClass();
        // privateClass.privateMethod(); // Uncommenting this line will cause a compile-time error
    }
}
