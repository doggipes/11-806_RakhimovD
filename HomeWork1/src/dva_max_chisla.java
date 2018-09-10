import java.util.Scanner;

public class dva_max_chisla {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max1 = -1000000000, max2 = -1000000000, number;
        for(int i = 0;i < n; i++) {
            number = in.nextInt();
            if (number > max1)
            {
               max2 = max1;
               max1 = number;
            }
            else
            {
                if(number > max2)
                    max2 = number;
            }
        }
        System.out.println(max1+" "+max2);
    }
}
