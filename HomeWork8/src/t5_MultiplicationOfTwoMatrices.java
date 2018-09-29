import java.util.Scanner;

public class t5_MultiplicationOfTwoMatrices {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt(), m1 = in.nextInt();
        int[][] arr1 = new int[n1][m1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                arr1[i][j] = in.nextInt();
            }
        }
        int n2 = in.nextInt(), m2 = in.nextInt();
        if(m1 != n2) {
            System.out.println("Sorry, no net");
            return;
        }
        int[][] arr2 = new int[n2][m2];
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                arr2[i][j] = in.nextInt();
            }
        }
        int[][] finalArr = new int[n1][m2];
        multiplication(arr1,n1,m1,arr2,n2,m2,finalArr);
    }
    static void multiplication(int[][] arr1,int n1,int m1,int[][] arr2,int n2,int m2,int[][] finalArr)
    {
        int sum, chet = 0;
        for (int k = 0; k < n1; k++) {
            for (int i = 0; i < m2; i++) {
                sum = 0;
                for (int j = 0; j < n2; j++) {
                    sum += arr1[chet][j] * arr2[j][i];
                }
                finalArr[chet][i] = sum;
            }
            chet++;
        }
        printArr(finalArr,n1,m2);
    }
    static void printArr(int[][] finalArr,int n1,int m2)
    {
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                System.out.print(finalArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
