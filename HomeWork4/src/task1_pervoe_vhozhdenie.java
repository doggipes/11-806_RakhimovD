import java.util.Scanner;

public class task1_pervoe_vhozhdenie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int[] numbers_1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            numbers_1[i] = in.nextInt();
        }
        int n2 = in.nextInt();
        int[] numbers_2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            numbers_2[i] = in.nextInt();
        }
        int x = -1,i = 0,j = 0;
        while((x == -1) && (i != n2 - 1)){
            while((x == -1) && (j != n1 - 1)) {
                if(numbers_2[i] == numbers_1[j])
                {
                    x = j;
                }
                j++;
            }
            j = -1;
            i++;
        }
        System.out.println(x);
    }
}
