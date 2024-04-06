import java.util.Scanner;

public class Integerornot {
    public static void main(String[] args) {
        System.out.println("to check whether the input item is integer or not!");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer: ");

        System.out.println(sc.hasNextInt());
    }
}
