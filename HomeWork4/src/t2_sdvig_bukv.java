import java.util.Scanner;

public class t2_sdvig_bukv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next(),str2 = "";
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            str2 += str.charAt(str.length()-1);
            for (int j = 0; j < str.length()-1; j++) {
                str2 += str.charAt(j);
            }
            str = str2;
            str2 = "";
        }
        System.out.println(str);
    }
}
