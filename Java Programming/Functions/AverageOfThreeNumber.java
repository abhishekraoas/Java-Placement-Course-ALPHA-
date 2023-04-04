package Functions;

import java.util.Scanner;

public class AverageOfThreeNumber {
    public static double Average(double first, double second, double third) {
        return (first + second + third) / 3;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double first = input.nextDouble();
        System.out.print("Enter the second number : ");
        double second = input.nextDouble();
        System.out.print("Enter the third number : ");
        double third = input.nextDouble();

        System.out.print(" The average value is " + Average(first, second, third) + "\n");

    }
}
