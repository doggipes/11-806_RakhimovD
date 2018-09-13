import java.util.Scanner;

public class t3_udalit_simvoli {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next(),strResult = "";
        int n1 = in.nextInt(), n2 = in.nextInt();
        for (int i = 0; i < str.length(); i++) {
            if((n1 > i) || (i > n2))
                strResult += str.charAt(i);
        }
        System.out.println(strResult);
    }
}
