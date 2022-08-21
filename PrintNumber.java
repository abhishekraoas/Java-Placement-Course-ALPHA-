import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

public class PrintNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int range = sc.nextInt();
        int counter = 1;

        while(counter <= range){
            System.out.println(counter + " ");
            counter++ ;
        }
    }
}