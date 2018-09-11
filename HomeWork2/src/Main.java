import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = -1, number;
        for(int i = 0; i < n;i++)
        {
            number = in.nextInt();
            if(Math.abs(number)>max)
                max = Math.abs(number);
        }
        System.out.println(max);
    }
}
