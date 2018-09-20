import java.util.Scanner;

public class t1_calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        String c, sbros;
        double b;
        while (true)
            {
                c = in.next();
                b = in.nextDouble();
                if (c.equals("+")) {
                    a += b;
                    System.out.println(a);
                }
                if (c.equals("-")) {
                    a -= b;
                    System.out.println(a);
                }
                if (c.equals("*")) {
                    a *= b;
                    System.out.println(a);
                }
                if (c.equals("/")) {
                    a /= b;
                    System.out.println(a);
                }
                System.out.println("Sbros? y/n");
                sbros = in.next();
                if(sbros.equals("y"))
                    a = in.nextDouble();
            }
    }
}
