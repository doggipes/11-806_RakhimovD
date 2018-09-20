import java.util.Scanner;

public class t3_iz_String_v_int {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char[] ch = str.toCharArray();
        int a = 0;
        for (int i = 0; i < str.length(); i++) {
            a *= 10;
            a = a + Character.digit(ch[i], 10);
        }
        System.out.println(a);
    }
}
