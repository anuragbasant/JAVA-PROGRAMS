package corejava;

public class Tringle {
    public static void printTriagle(int n){
        for(int i=0;i<n;i++){

            for (int j=n-i; j>1; j--)
            {
                // printing spaces
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ )
            {
                // printing stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int n = 9;
        printTriagle(n);
    }
}

