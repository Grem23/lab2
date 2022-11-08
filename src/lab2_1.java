import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Scanner;

public class lab2_1 {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in, StandardCharsets.UTF_8);
        byte num;
        try {
            System.out.println("Enter length of array: ");
            num = ns.nextByte();
            byte[] arr = new byte[num];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Element " + (i + 1));
                arr[i] = ns.nextByte();
            }
            int max = 0;
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 0) {
                    count++;
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }
            }
            if (count == 0) {
                System.out.println("Positive elements are missing");
            } else {
                System.out.println("MAX: " + max);
            }
        } catch(InputMismatchException e){
            System.out.println("Your element wasn't byte type or byte type supports digits in range from -128 to 127");
        }
    }
}
