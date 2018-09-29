import java.util.Scanner;

public class t1_magicSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),sumLine = 0;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
            sumLine += arr[0][i];
        }
        if(sumLine(arr,sumLine,n) == sumColumn(arr,sumLine,n) && sumColumn(arr,sumLine,n) == sumDiagonal(arr,sumLine,n))
            System.out.println("It's magic!");
        else
            System.out.println("No magic");
    }
    static boolean sumLine(int[][] arr, int sumLine,int n)
    {
        int sum;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
            if(sum != sumLine)
                return false;
        }
        return true;
    }
    static boolean sumColumn(int[][] arr, int sumLine, int n)
    {
        int sum;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[j][i];
            }
            if(sum != sumLine)
                return false;
        }
        return true;
    }
    static boolean sumDiagonal(int[][] arr,int sumLine,int n)
    {
        int sum1 = 0,sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - 1 - i];
        }
        if(sum1 == sum2 && sum2 == sumLine)
            return true;
        else
            return false;
    }
}
