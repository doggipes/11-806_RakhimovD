import java.util.Scanner;

public class t3_local_max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), local_max = 0;
        int[] numbers = new int[n];
        numbers[0] = in.nextInt();
        numbers[1] = in.nextInt();
        for (int i = 2; i < n; i++) {
            numbers[i] = in.nextInt();
            if(numbers[i-2]<numbers[i-1] && numbers[i-1] > numbers[i])
                local_max++;
        }
        System.out.println(local_max);
    }
}
