import java.util.Scanner;

public class summa_cifr {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int summa = 0;
        while(n!=0)
        {
            summa += n%10;
            n /= 10;
        }
        System.out.println(summa);
    }
}
