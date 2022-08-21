import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int number = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= number) {
            sum += i;
            i++;
        }
        System.out.println("Sum is :" + sum);
    }
}
