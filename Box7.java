package corejava;

public class Box7 {
    double height;
    double width;
    double depth;

    Box7(double h, double w, double d){
        height = h;
        width = w;
        depth = d;
    }

    double volume(){
        return height*width*depth;
    }
}
class BoxDemo7{
    public static void main(String[] args) {
        Box7 box1 = new Box7(20, 30, 12);
        Box7 box2 = new Box7(30,2,2.9);
        double vol;
        vol = box1.volume();
        System.out.println("volume is:"+vol);
        vol = box2.volume();
        System.out.println("volume is :"+vol);
    }
}
