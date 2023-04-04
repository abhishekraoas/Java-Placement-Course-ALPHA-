
import java.util.Scanner;

public class Loops {
    public static void positiveNegative(int number){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number = ");
        number = input.nextInt();
        if(number<0){
            System.out.print(" Number is Negative");
        } else{
            System.out.print("Number is Positive");
        }

    }
    public static void main(String[] args) {
       positiveNegative(10);
    }
}
