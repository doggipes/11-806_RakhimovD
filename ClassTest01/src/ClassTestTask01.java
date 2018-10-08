//var 1


import java.util.Scanner;

public class ClassTestTask01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),n2 = n;
        n *= n;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        sortArr(arr,n);

        int[][] matrix = new int[n2][n2];
        spiralFill(matrix,arr,n2);

        System.out.println(overDiagonalSum(matrix,n2));
    }

    static void sortArr(int[] arr,int n)                            //task 1.1
    {
        int max = -1,indexOfMax = 0,swap;
        for (int i = 0; i < n; i++) {
            max = -1;
            for (int j = 0; j < n - i; j++) {
                if(Math.abs(arr[j]) > max)
                {
                    indexOfMax = j;
                    max = Math.abs(arr[j]);
                }
            }
            swap = arr[n - i - 1];
            arr[n - i - 1] = arr[indexOfMax];
            arr[indexOfMax] = swap;
        }
        printArr(arr,n);
    }
    static void printArr(int[] arr,int n)                           //also task 1.1
    {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    static void spiralFill(int[][] matrix,int[] arr,int n2)          //task 1.2
    {
        int right = 0,left = 0,up = 1,down = 0,i = -1,s = -1;
        while(s + 1!=n2*n2) {
            i++;
            while (i < n2 - right) {
                s++;
                matrix[right][i] = arr[s];
                i++;
            }
            right++;

            if(s + 1 == n2*n2)
                break;

            i = right;
            while (i < n2 - down) {
                s++;
                matrix[i][n2-down-1] = arr[s];
                i++;
            }
            down++;

            i -= 2;
            while (i >= left) {
                s++;
                matrix[n2-left-1][i] = arr[s];
                i--;
            }
            left++;

            i = n2 - 1 - up;
            while (i >= up) {
                s++;
                matrix[i][up-1] = arr[s];
                i--;
            }
            up++;
        }
        printMatrix(matrix,n2);
    }
    static void printMatrix(int[][] matrix,int n2)               //also task 1.2
    {
        System.out.println();
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }



    static int overDiagonalSum(int[][] matrix,int n2)             //task 1.3
    {
        int sum = 0;
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n2 - i - 1; j++) {
                sum += matrix[j][i];
            }
        }
        return sum;
    }
}
