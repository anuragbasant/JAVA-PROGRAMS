package corejava;
//** METHOD :- A method is a block of code which only runs when it is called.
public class Box4 {
    double height;
    double width;
    double depth;

    double volume(){
        return height*width*depth;
    }
}
class BoxDemo4{
    public static void main(String[] args) {
        Box4 box1  = new Box4();
        Box4 box2  = new Box4();
        double vol;

        box1.height = 10;
        box1.width = 20;
        box1.depth = 30;

        box2.height=29;
        box2.width=2.3;
        box2.depth=3.0;

        vol = box1.volume();
        System.out.println("volume is:"+vol);

        vol = box2.volume();
        System.out.println("volume is :"+vol);

    }
}
