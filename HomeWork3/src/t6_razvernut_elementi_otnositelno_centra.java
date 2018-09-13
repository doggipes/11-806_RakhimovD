import java.util.Scanner;

public class t6_razvernut_elementi_otnositelno_centra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
        for (int i = n-1; i >= 0; --i) {
            System.out.print(numbers[i] + " ");
        }
    }
}
