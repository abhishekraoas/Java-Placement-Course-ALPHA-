package Functions;
public class PatternFunction {

    // Hollow Rectangle

    public static void hollowRectangle(int n) {
        for (int i = 1; i <= n; i++) {

        }
    }

    public static void SolidRhombusPattern(int n) {
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Hollow Rhombus Pattern

    public static void HollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // hollow rectangle stars
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Number Pyramid

    public static void NumberPyramid(int n) {

        // outer loops
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");

            }
            System.out.println();
        }
    }

    public static void PalindromicPattern(int n){

        //outer loops
        for(int i=1; i<=n; i++){

            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //descending
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            //ascending
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        // SolidRhombusPattern(10);

        // HollowRhombus(10);

        // NumberPyramid(9);

        PalindromicPattern(10);
    }
}
