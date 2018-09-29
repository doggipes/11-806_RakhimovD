import java.util.Scanner;

public class t3_spiral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        spiral(arr,n);
    }
    static void spiral(int[][] arr,int n)
    {
            int right = 0,left = 0,up = 1, down = 0,i = -1,s = 0;
            while(s!=n*n) {
                i++;
                while (i < n - right) {
                    s++;
                    arr[right][i] = s;
                    i++;
                }
                right++;
                if(s == n*n)
                    break;

                i = right;
                while (i < n - down) {
                    s++;
                    arr[i][n-down-1] = s;
                    i++;
                }
                down++;

                i -= 2;
                while (i >= left) {
                    s++;
                    arr[n-left-1][i] = s;
                    i--;
                }
                left++;

                i = n - 1 - up;
                while (i >= up) {
                    s++;
                    arr[i][up-1] = s;
                    i--;
                }
                up++;
            }
        for (i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
