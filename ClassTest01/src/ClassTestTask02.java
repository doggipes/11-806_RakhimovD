//var 1


import java.util.Scanner;

public class ClassTestTask02 {
    static int i = -1;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next(),lowerStr = "";
        char ch;
        for (int j = 0; j < str.length(); j++) { //toLowerCase
            ch = str.charAt(j);
            if(ch >= 65 && ch <= 90)
                ch += 32;
            lowerStr += ch;
        }
        System.out.println(palindrom(lowerStr,lowerStr.length()));
    }

    static boolean palindrom(String str,int n)
    {
        if(n == 0)
            return  true;
        i++;
        if(str.charAt(n - 1) != str.charAt(i))
            return false;
        palindrom(str,n-1);
        return true;
    }
}
