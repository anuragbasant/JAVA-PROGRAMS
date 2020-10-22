package corejava;


    public class ConsPract {
        private int x;
        private int y;

        public void setValues() {
            x = 10;
            y = 20;
        }

        public void show() {

            System.out.println("value of x is" + x);
            System.out.println("value of y is " + y);

        }

        public static void main(String args[]) {

            ConsPract obj = new ConsPract();
            obj.setValues();
            obj.show();
        }
    
}

