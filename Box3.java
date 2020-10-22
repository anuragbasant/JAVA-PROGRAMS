package corejava;

public class Box3 {
    double height;
    double width;
    double depth;

    void volume() {
        System.out.println("volume is:");
        System.out.println(height * width * depth);
    }
}

class BoxDemo3 {
    public static void main(String[] args) {
        Box3 box1 = new Box3();
        Box3 box2 = new Box3();

        box1.height = 10;
        box1.width = 20;
        box1.depth = 30;

        box2.height=29;
        box2.width=2.3;
        box2.depth=3.0;
        box1.volume();
        box2.volume();
    }
}

