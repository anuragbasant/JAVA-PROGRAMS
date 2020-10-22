package corejava;

public class ConsPrac {

    private int x;
    private int y;

    public void setValues(int x, int y){
        this.x = x;
        this.y = y;
    }

    public ConsPrac(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void show(){

        System.out.println("value of x is" +x);
        System.out.println("value of y is "+y);

    }

    public static void main( String args[]) {

        ConsPrac obj = new ConsPrac(0,0);
        obj.setValues(12, 79);
        obj.show();
    }
}
