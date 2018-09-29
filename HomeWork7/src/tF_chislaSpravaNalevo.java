import java.util.Scanner;

public class tF_chislaSpravaNalevo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        cifri(n);
    }
    static void cifri(int n)
    {
        if (n == 0)
            return;
        System.out.print(n%10 + " ");
        cifri(n/10);
    }
}
