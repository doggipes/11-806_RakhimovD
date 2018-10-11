import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

import java.io.*;
import java.util.Scanner;

public class t2_sortIntFromTwoFiles {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in1 = new Scanner(new File("in1.txt"));
        Scanner in2 = new Scanner(new File("in2.txt"));

        PrintWriter out = new PrintWriter(new File("out.txt"));

        int a = in1.nextInt();
        int b = in2.nextInt();
        boolean flag = true;
        while (in1.hasNextInt() || in2.hasNextInt() || flag) {
                    if (a >= b) {
                        out.println(b);
                        if(!in2.hasNextInt()) {
                            out.println(a);
                            flag = false;
                            while (in1.hasNextInt())
                                out.println(in1.nextInt());
                        }
                        else
                            b = in2.nextInt();
                    } else {
                        out.println(a);
                        if(!in1.hasNextInt()){
                            out.println(b);
                            flag = false;
                            while(in2.hasNextInt())
                                out.println(in2.nextInt());
                        }
                        else
                            a = in1.nextInt();
                    }
                }
        out.flush();
        out.close();
    }
}