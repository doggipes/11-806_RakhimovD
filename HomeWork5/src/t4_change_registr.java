import java.util.Scanner;

public class t4_change_registr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next(),registr = in.next(), str_change = "";
        char ch;
        boolean flag = false;
        if(registr.equals("u"))
            flag = true;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if(flag == true && ch >= 97 && ch <= 122)
                ch -= 32;
            if(flag == false && ch >= 65 && ch <= 90)
                ch += 32;
            str_change += ch;
        }
        System.out.println(str_change);
    }
}
