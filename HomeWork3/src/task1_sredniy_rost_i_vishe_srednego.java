import java.util.Scanner;

public class task1_sredniy_rost_i_vishe_srednego {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int average = 0, above_average = 0;
        int[] growths = new int[n];
        for (int i = 0; i < n; i++) {
            growths[i] = in.nextInt();
            average += growths[i];
        }
        average /= n;
        for (int i = 0; i < n; i++) {
            if(growths[i] > average)
                above_average++;
        }
        System.out.println(average + " " + above_average);
    }
}
