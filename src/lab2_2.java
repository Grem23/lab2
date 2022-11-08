import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Scanner;

public class lab2_2 {

    public static void SetArray(byte[] arr){
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Element " + (i + 1));
                arr[i] = sc.nextByte();
            }
        } catch (InputMismatchException e){
            System.err.println("Your element wasn't byte type or byte type supports digits in range from -128 to 127.");
        }
    }

    public static int MaxWrong(int max){
        if (max != 0) {
            if (max > 127 || max < (-128)) {
                throw new IllegalArgumentException("Byte type supports digits in range from -128 to 127, your is " + max);
            } else {
                System.out.println("MAX: " + max);
                return max;
            }
        }
        return 0;
    }
    public static int MaxElem(byte[] arr){
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
        if (count != 0) {
            return max;
        }
        return 0;
    }

    public static void main(String[] args) {
        try {
            Scanner ns = new Scanner(System.in, StandardCharsets.UTF_8);
            System.out.println("Enter length of array: ");
            byte numbers = ns.nextByte();

            byte[] arr = new byte[numbers];

            SetArray(arr);

            int max = MaxWrong(MaxElem(arr));
            if (max == 0) {
                System.out.println("Positive elements are missing");
            }
        } catch (InputMismatchException e){
            System.err.println("Input number of elements in byte format.");
        }
    }
}
