import java.util.Scanner;

public class t3_maxSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),max = 1,sequence = 0;
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if(arr[i-1] == arr[i])
                max++;
            else
            {
                if(max > sequence)
                sequence = max;
                max = 1;
            }
        }
        if(max > sequence)
        System.out.println(max);
        else
            System.out.println(sequence);
    }
}
