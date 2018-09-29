import java.util.Scanner;

public class tE_summaCifr {
    public static int sum = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        System.out.println(sumOfNumbers(q));
    }
    static int sumOfNumbers(int q)
    {
        if(q == 0)
            return sum;
        sum += q%10;
        return sumOfNumbers(q/10);
    }
}
