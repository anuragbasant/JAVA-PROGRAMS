import java.util.Arrays;
class Test3{

    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,3,4,5,};
        if (Arrays.equals(arr1,arr2))
        System.out.println("same");
        else
        System.out.println("not same");
    }
}
