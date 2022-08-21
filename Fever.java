import java.util.Scanner;

public class Fever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = 103.5;

        if (temp > 100) {
            System.out.println("You have fever ");
        } else {
            System.out.println("You don't have fever");
        }
    }
}
