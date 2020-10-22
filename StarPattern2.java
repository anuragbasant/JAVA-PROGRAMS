package corejava;

public class StarPattern2 {
    void print(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StarPattern2 obj = new StarPattern2();
        int n = 5;
        obj.print(n);
    }
}
