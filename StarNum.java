package corejava;

public class StarNum {
    void print(int n) {
        int temp = 1;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(temp + " ");
                temp++;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        StarNum obj = new StarNum();
        int n = 5;
        obj.print(n);
    }
}
