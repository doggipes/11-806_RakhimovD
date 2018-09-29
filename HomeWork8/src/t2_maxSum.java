import java.util.Scanner;

public class t2_maxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),m = in.nextInt(),maxLine = -1,maxColumn = -1,sum1,sum2,indexLine = 0,indexColumn = 0;
        int[][] arr = new int[n][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            sum1 = 0;
            sum2 = 0;
            for (int j = 0; j < m; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            if(sum1 > maxLine)
            {
                maxLine = sum1;
                indexLine = i;
            }
            if(sum2 > maxColumn)
            {
                maxColumn = sum2;
                indexColumn = i;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[indexLine][i] + " ");
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][indexColumn]);
        }
    }
}
