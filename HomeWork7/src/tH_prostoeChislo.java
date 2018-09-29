import java.util.Scanner;

public class tH_prostoeChislo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), del = 2;
        System.out.println(prostoe(n,del));
    }
    static boolean prostoe(int n, int del)
    {
        if(del == n)
        return true;
        if(n % del == 0)
            return false;
        return prostoe(n,del+1);
    }
}
