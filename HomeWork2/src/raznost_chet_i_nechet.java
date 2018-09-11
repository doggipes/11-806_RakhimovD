import java.util.Scanner;

public class raznost_chet_i_nechet {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int number, chet=0, nechet=0;
        for(int i=0;i<n;i++)
        {
            number = in.nextInt();
            if(number % 2 == 0)
                chet += number;
            else
                nechet += number;
        }
        System.out.println(chet - nechet);
    }
}
