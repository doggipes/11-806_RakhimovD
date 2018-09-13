import java.util.Scanner;

public class t2_index_max_chisla {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), max_number = -1, index = 0;
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
            if(Math.abs(numbers[i]) > max_number)
            {
                index = i;
                max_number = Math.abs(numbers[i]);
            }
        }
        System.out.println(index);
    }
}
