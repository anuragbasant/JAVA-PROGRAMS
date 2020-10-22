package corejava;

public class StarPattern5 {
    void print(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }  
    }

    public static void main(String[] args) {
        StarPattern5 obj = new StarPattern5();
        int n = 5;
        obj.print(n);
    }
}
