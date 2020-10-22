package corejava;
// A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:
// constructor are invoked on object creation and used to initialize values
public class ConsDemo {

    private double height;
    private double width;

    // Default Cons: allows to create default obj without any parameter,
    public ConsDemo(){}

    public ConsDemo(double height, double width) {
        this.height = height;
        this.width = width;
    }

    // initializing variables using methods
    public void setDimensions(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void showDimensions() {
        System.out.println("Height:" + height);
        System.out.println("Width:" + width);
    }

    public static void main(String[] args) {
        ConsDemo consDemo = new ConsDemo(11, 12);
        consDemo.setDimensions(13, 14);

        consDemo.showDimensions();

        ConsDemo consDemo1 = new ConsDemo();
        consDemo1.setDimensions(1,2.0);
        consDemo1.showDimensions();
    }
}
