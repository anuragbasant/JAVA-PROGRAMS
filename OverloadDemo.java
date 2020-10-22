package corejava;

//** Method Overloading is a feature that allows a class to have more than one method having the same name,
// if their argument lists are different.

public class OverloadDemo {
    void test() {
        System.out.println("no parameter");
    }

    void test(int a) {
        System.out.println("a:" + a);
    }

    void test(int a, int b) {
        System.out.println("a and b " + a + " " + b);
    }

    double test(double a) {
        System.out.println("double");
        return a * a;
    }
}

class Overload {
    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();;

        obj.test();
        obj.test(10);
        obj.test(11, 20);
        double result = obj.test(12.55);
        System.out.println("result obj.test :" + result);
    }
}
