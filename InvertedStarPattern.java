public class InvertedStarPattern {
    public static void main(String[] args) {
        int number = 5;
        for (int line = 1; line <= number; line++) {
            for (int star = 1; star <= number - line + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
