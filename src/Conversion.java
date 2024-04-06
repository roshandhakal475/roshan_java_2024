import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        System.out.println("kilometer into miles conversion!");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter kilometer: ");
        double k = sc.nextDouble();
        double m= k*0.621371;
        System.out.println(" k kilometer is equal to: " +m+ " miles");

    }
}
