

import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        System.out.println("taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1: ");
        //int a = sc.nextInt();
        float a= sc.nextFloat();
        System.out.println("enter number 2: ");
        //int b = sc.nextInt();
        float b= sc.nextFloat();
        //int sum = a+b;
        float sum=a+b;
        System.out.println("the sum of two numbers is : ");
        System.out.println(sum);
    }
}
