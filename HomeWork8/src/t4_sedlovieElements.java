import java.util.Scanner;

public class t4_sedlovieElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),m = in.nextInt(),min = 0,indexIOfMin = 0,indexJOfMin = 0,quantity = 0;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            min = arr[i][0];
            indexIOfMin = i;
            indexJOfMin = 0;
            for (int j = 1; j < m; j++) {
                if(min > arr[i][j]) {
                    min = arr[i][j];
                    indexIOfMin = i;
                    indexJOfMin = j;
                }
            }
            for (int j = 0; j < m; j++) { //check for same elements in line
                if(arr[i][j] == min && j != indexJOfMin)
                    quantity += sedlovoi(arr,n,m,indexIOfMin,indexJOfMin);
            }
                quantity += sedlovoi(arr,n,m,indexIOfMin,indexJOfMin);
        }
        System.out.println(quantity);
    }
    static int sedlovoi(int[][] arr,int n,int m,int indexIOfMin, int indexJOfMin)
    {
        for (int i = 0; i < n; i++) {
            if(arr[indexIOfMin][indexJOfMin] < arr[i][indexJOfMin])
                return 0;
        }
        return 1;
    }
}
