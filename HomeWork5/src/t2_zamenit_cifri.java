import java.util.Scanner;

public class t2_zamenit_cifri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine(),str_new = "";
        char a;
        for (int i = 0; i < str.length(); i++) {
            a = str.charAt(i);
            if(a >= '0' && a <= '9')
                a = '*';
            str_new += a;
        }
        System.out.println(str_new);
    }
}
