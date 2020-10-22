package corejava;

public class NumberPattern {
    void print(int n) {
        int i, j, temp;
        for (i = 0; i < n; i++) {
            temp = 1;
            for (j = 0; j <= i; j++) {
                System.out.print(temp + " ");
                temp++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NumberPattern obj = new NumberPattern();
        int n = 10;
        obj.print(n);
    }
}
