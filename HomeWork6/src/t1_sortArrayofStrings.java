import java.util.Scanner;

public class t1_sortArrayofStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),max,number;
        String[] str = new String[n];
        String swap = "";
        for (int i = 0; i < n; i++) {
            str[i] = in.next();
        }
        for (int i = 0; i < n; i++) {
            max = str[i].length();
            number = i;
            for (int j = 0; j < n - i; j++) {
                if(max > str[j].length())
                {max = str[j].length();
                number = j;}
            }
            swap = str[number];
            str[number] = str[n - i - 1];
            str[n - i - 1] = swap;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }
    }
}
