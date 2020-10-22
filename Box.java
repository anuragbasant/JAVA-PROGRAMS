package corejava;

public class Box {
    double height;
    double width;
    double depth;
}

class BoxDemo{
    public static void main(String args[]){
        Box mybox = new Box();
        double vol;
        mybox.height =  20;
        mybox.width = 10;
        mybox.depth = 10;
        vol = mybox.height*mybox.depth*mybox.width;
        System.out.println("volume is :"+vol);
    }
}
