import java.util.Scanner;

public class CostOfItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float itemPrice = pencil + pen + eraser;

        // Adding 18% GST in Bill
        float gst = (itemPrice*18)/100;
        float TotalBill= itemPrice + gst;
        System.out.println(TotalBill);
    }
}
