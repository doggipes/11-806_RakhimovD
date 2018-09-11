import java.util.Scanner;

public class factorial {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int factorial = n;
        n -= 1;
        while(n!=0)
        {
            factorial *= n;
            n -= 1;
        }
        System.out.println(factorial);
    }
}
