
import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Loan Amount = ");
        int loanAmount = sc.nextInt();

        for( int month =1; month <= 3; month ++){
        int interest = (loanAmount * 10)/100;
        loanAmount = loanAmount - interest;
        System.out.println(loanAmount);
        }
    }
}
