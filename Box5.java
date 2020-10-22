package corejava;

public class Box5 {
    double height;
    double width;
    double depth;

    double volume(){
        return height*width*depth;
    }
//** A method is a block of code which only runs when it is called
//**
    void setDim(double h, double w, double d){
        height = h;
        width = w;
        depth = d;
    }
}

class BoxDemo5{
    public static void main(String[] args) {
        Box5 box1 = new Box5();
        Box5 box2 = new Box5();
        double vol;

        box1.setDim(20,22,25);
        box2.setDim(12.5,20,18);

        vol = box1.volume();
        System.out.println("volume is :"+vol);

        vol = box2.volume();
        System.out.println("volume is :"+vol);
    }
}
