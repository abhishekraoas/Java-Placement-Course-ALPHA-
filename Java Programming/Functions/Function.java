package Functions;
import java.util.Scanner;

public class Function {

    // Creating a Sum Function
    public static void Sum() {
        Scanner input = new Scanner(System.in);

        // input the first number
        System.out.print("Enter the First Number : ");
        int fisrtNumber = input.nextInt();

        // input second number
        System.out.print("Enter the Second Number : ");
        int secondNumber = input.nextInt();

        // Sum of two number

        int sum = fisrtNumber + secondNumber;
        System.out.print("The Sum Of Two Number is : " + sum);

    }

    // MultiPly Function
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    // Factorial Function

    public static int Factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f; // factorial of n
    }

    // Butterfly Pattern

    public static void ButterflyPattern(int n) {
        // first half
        for (int i = 1; i <= n; i++) {

            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space - 2 * (n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // // second half
        for (int i = n; i >= 1; i--) {
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space - 2 * (n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
           
    
    }

    public static void main(String[] args) {

        // System.out.println(Factorial(5));
        ButterflyPattern(10);
    }
}
