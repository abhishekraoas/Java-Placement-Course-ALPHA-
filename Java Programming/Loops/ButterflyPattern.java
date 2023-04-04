import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to Print Butterfly Patter :");
        int n = sc.nextInt();

        // fisrt half
        for (int i = 1; i <= n; i++) {
            // star -- i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space -- 2 * (n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // star -- i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // second half

        for (int i = n; i >= 1; i--) {
            // star -- i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space -- 2 * (n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // star -- i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
