public class OddOrEven {

    public static void oddOrEvenCheck(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // even number
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        oddOrEvenCheck(3);
        oddOrEvenCheck(6);
        oddOrEvenCheck(5);
        oddOrEvenCheck(4);
    }
}
