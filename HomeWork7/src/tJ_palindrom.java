import java.util.Scanner;

public class tJ_palindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        if(n.equals(palindrom(n)))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    static String palindrom(String n)
    {
        if(n.length() == 0)
            return "";
        return n.charAt(n.length()-1) + palindrom(n.substring(0,n.length()-1));
    }
}
