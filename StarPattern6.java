package corejava;

public class StarPattern6 {
    void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StarPattern6 obj = new StarPattern6();
        int n = 5;
        obj.print(n);
    }

}
