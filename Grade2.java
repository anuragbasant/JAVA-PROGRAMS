package corejava;

import java.util.Scanner;

public class Grade2 {

    private static Scanner sc;
    public static void main(String[] args) {
        int English,Science,Math,Social_Science,Hindi;

        sc = new Scanner(System.in);

        System.out.println("Enter the subject marks");
        System.out.println("English :");
        English=sc.nextInt();
        System.out.println("Math :");
        Math= sc.nextInt();
        System.out.println("Science :");
        Science= sc.nextInt();
        System.out.println("Social_Science :");
        Social_Science= sc.nextInt();
        System.out.println("Hindi :");
        Hindi=sc.nextInt();

        int total= English+Science+Math+Social_Science+Hindi;
        int avg = total/5;
        if(avg >=90)
        {
            System.out.println("Grade is A");
        }
        else if(avg >=80 && avg<= 90)
        {
            System.out.println("Grade is B ");
        }
        else if(avg >=70 && avg<=80)
        {
            System.out.println("Grade is c ");
        }
        else if(avg>= 60 && avg <= 70)
        {
            System.out.println("Grade is D ");
        }
        else{
            System.out.println("Grade is F");
        }
    }


    }




