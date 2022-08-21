public class HalfPyramidPattern {
    public static void main(String[] args) {
        int number = 5;
        for (int line = 1; line <= number; line++) {
            for (int numberPrint = 1; numberPrint <= line; numberPrint++) {
                System.out.print(numberPrint);
            }
            System.out.println();
        }
    }
}
