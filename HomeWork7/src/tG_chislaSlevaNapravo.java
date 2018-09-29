import java.util.Scanner;

public class tG_chislaSlevaNapravo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        cifri(n);
    }
    static void cifri(int n)
    {
        if (n == 0)
            return;
        cifri(n/10);
        System.out.print(n%10 + " ");
    }
}
