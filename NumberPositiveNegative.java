import java.util.Scanner;

public class NumberPositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        int number = sc.nextInt();

        if(number > 0){
            System.out.println("The number is Positive .");

        } else{
            System.out.println("The number is Negative .");
        }
    
    }
}
