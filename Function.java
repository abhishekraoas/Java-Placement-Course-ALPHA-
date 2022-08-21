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

    public static void main(String[] args) {
        
        System.out.println(Factorial(5));
    }
}
