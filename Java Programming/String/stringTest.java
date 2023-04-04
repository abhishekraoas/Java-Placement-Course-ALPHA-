public class stringTest {

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {

                // not a Palindromme
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String name = "Hello";

        System.out.println(isPalindrome(name));
    }
}