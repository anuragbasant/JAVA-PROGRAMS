package corejava;

public class Box6 {
    double height;
    double width;
    double depth;
//** A constructor initializes an object immediately upon creation.
//** constructor has the same name as the class and it is syntactically similar to the method.
//** The constructor is  automatically called immediately after object creation.
    Box6(){
        System.out.println("constructing box");
        height = 10;
        width = 20;
        depth = 25;

    }

    double volume(){
        return height*width*depth;
    }
}

class BoxDemo6{
    public static void main(String[] args) {
        Box6 box1 = new Box6();
        Box6 box2 = new Box6();
        double vol;

        vol = box1.volume();
        System.out.println("volume is "+vol);

        vol = box2.volume();
        System.out.println("volume is :" +vol);

    }
}
