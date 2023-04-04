import java.util.Scanner;

public class Array {

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        // int marks[] = new int[50]; // declare marks array
        // Scanner sc = new Scanner(System.in);

        // marks[0] = sc.nextInt(); // physics
        // marks[1] = sc.nextInt(); // chemistry
        // marks[2] = sc.nextInt(); // maths

        // int percentage = (marks[0]+marks[1]+marks[2])/3; // percentage calculate

        // System.out.println("Physics : " + marks[0]);
        // System.out.println("Chemistry : " + marks[1]);
        // System.out.println("Maths : " + marks[2]);
        // System.out.println("Percentage = " + percentage);

        // System.out.println("lenth of marks " + marks.length);

        // Linear Search Array

        int numbers[] = { 2, 4, 6, 10, 12, 14, 16 };
        int key = 6;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.print("Not Found");

        }else{
            System.out.println("Key is at index : " + index);
        }

    }
}
