import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner userNumber= new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int input =userNumber.nextInt();
        int i=1;
        int sum=0;

        while(i<=input){
            sum+= i;
            i++;
        }
        System.out.println(sum);
    }
}
