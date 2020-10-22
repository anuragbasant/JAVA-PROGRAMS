package corejava;

public class Box1 {
    double height;
    double width;
    double depth;
}

class Box1Demo{
    public static void main(String args[]){
        Box1 mybox1 = new Box1();
        Box1 mybox2 = new Box1();
        double vol;
        mybox1.height = 10;
        mybox1.width = 20;
        mybox1.depth = 30;

        mybox2.height = 5;
        mybox2.width = 10;
        mybox2.depth = 20;

        vol = mybox1.height*mybox1.width*mybox1.depth;
        System.out.println("vol is : " +vol);

        vol = mybox2.height*mybox2.width*mybox2.depth;
        System.out.println("vol is :" +vol);
    }
}
