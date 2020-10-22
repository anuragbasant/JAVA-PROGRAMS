package corejava;

public class MyClass {
        int x;   // Create a class constructor for the MyClass class

        public void MyClass() {
            x = 5;  // Set the initial value for the class attribute x
        }

        public static void main(String[] args) {
            MyClass myObj = new MyClass();
            System.out.println(myObj.x);
        }
}
