package corejava;
//**  Recursion in java is a process in which a method calls itself continuously. A method in java that calls itself
// is called recursive method.

public class Recursion {
    static void p(){
        System.out.println("hello");
        p();
    }

    public static void main(String[] args) {
        p();
    }
}
           