import java.util.Scanner;

public class t5_is_elementov_massiva_chislo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        String number_str = "";
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
            number_str += numbers[i];
        }
        int x = Integer.parseInt(number_str);
        System.out.println(x);
    }
}
