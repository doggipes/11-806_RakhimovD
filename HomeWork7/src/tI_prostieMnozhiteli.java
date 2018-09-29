import java.util.Scanner;

public class tI_prostieMnozhiteli {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        prostoe(n,2);
    }
    static void prostoe(int n, int del)
    {
        if(n == 0)
            return;
        if(del == n) {
            System.out.print(n + " ");
            return;
        }
        if(n % del == 0)
        {System.out.print(del + " ");
            prostoe(n/del,del);}
            else
         prostoe(n,del+1);
    }
}
