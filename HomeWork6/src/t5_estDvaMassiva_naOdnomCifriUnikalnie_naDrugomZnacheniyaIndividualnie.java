import java.util.Scanner;

public class t5_estDvaMassiva_naOdnomCifriUnikalnie_naDrugomZnacheniyaIndividualnie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = in.nextInt();
        }
        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = in.nextInt();
        }
        System.out.println((uniqueInFirst(arr1,arr2) + uniqueInSecond(arr1,arr2)));
    }
    static int uniqueInFirst(int[] arr1,int[] arr2)
    {
        int unique_numbers = 0;
        boolean flag = true;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j])
                    flag = false;
            }
            if(flag == true)
                unique_numbers++;
            flag = true;
        }
        return unique_numbers;
    }
    static int uniqueInSecond(int[] arr1,int[] arr2)
    {
        int unique_numbers2 = 0;
        boolean flag2 = true;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if(arr2[i] == arr1[j])
                    flag2 = false;
            }
            if(flag2 == true)
                unique_numbers2++;
            flag2 = true;
        }
        return unique_numbers2;
    }
}
