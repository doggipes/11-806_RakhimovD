import java.util.Scanner;

public class tD_tochnayaStepenDvoiki {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        System.out.println(stepen(q));
    }
    static boolean stepen(int q)
    {
        if(q == 2)
            return true;
        if(q < 2)
            return false;
        return stepen(q/2);
    }
}
