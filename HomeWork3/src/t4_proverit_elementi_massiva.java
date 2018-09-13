import java.util.Scanner;

public class t4_proverit_elementi_massiva {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
        int i = 0;
        while(i != n-1 && numbers[i] <= numbers[i+1])
        {
            i++;
        }
        while(i != n-1 && numbers[i] >= numbers[i+1])
        {
            i++;
        }
        if(i == n-1)
        System.out.println("true");
        else
            System.out.println("false");
    }
}
