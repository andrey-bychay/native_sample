public class HelloJNI {
    static {
        System.loadLibrary("hello"); // Load native library at runtime
        // hello.dll (Windows) or libhello.so (Unixes)
    }

    private native void sayHello();

    // Test Driver
    public static void main(String[] args) {
        new HelloJNI().sayHello();  // invoke the native method
    }
}
