import java.util.*;

public class Average {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a, b, c;
        int a= sc.nextInt();
        // System.out.println("Enter the first number "+ a);
        int b= sc.nextInt();
        // System.out.println("Enter the second number "+ b);
        int c= sc.nextInt();
        // System.out.println("Enter the third number "+ c);
        int average = (a + b + c)/3;
        System.out.println("The average of 3 number is " + average);
    }
}
