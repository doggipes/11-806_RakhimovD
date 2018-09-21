import java.util.Scanner;

public class t4_uniqueElementsInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(check_unique(arr));
    }
    static boolean check_unique(int[] arr)
    {
        int q = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    q++;
            }
            if(q != 1)
                return false;
            q = 0;
        }
        return true;
    }
}
