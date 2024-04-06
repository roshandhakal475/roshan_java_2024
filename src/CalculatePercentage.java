import java.util.Scanner;

public class CalculatePercentage {
    public static void main(String[] args) {
        System.out.println("Student details: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of maths: ");
        float m = sc.nextFloat();
        System.out.println("enter marks of english: ");
        float e = sc.nextFloat();
        System.out.println("enter marks of science: ");
        float s = sc.nextFloat();
        System.out.println("enter marks of computer: ");
        float c = sc.nextFloat();
        System.out.println("enter marks of nepali: ");
        float n = sc.nextFloat();
        float percentage= ((m+e+s+c+n)/500)*100;
        System.out.println("Total percentage is: " +percentage);


    }
}
