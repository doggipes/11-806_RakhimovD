import java.io.*;
import java.util.Scanner;

public class t1_sortStrings {
    public static void main(String[] args) throws IOException {
        int length = maxLength();
        for (int i = 0; i < length; i++) {
            sortInFiles(i);
            merge();
        }
    }

    static void merge() throws FileNotFoundException {
        PrintWriter out = new PrintWriter(new File("inStr.txt"));
        Scanner[] scanners = new Scanner[27];
        for (int i = 0; i <= 26; i++) {
            scanners[i] = new Scanner(new File("out" + (char) (i + 96) + ".txt"));
        }
        for (int i = 0; i <= 26; i++) {
            while(scanners[i].hasNext()){
                out.println(scanners[i].next());
            }
        }
        out.close();
    }

    static void sortInFiles(int k) throws IOException{
        PrintWriter[] printWriters = new PrintWriter[27];
        for (int i = 0; i <= 26; i++) {
            printWriters[i] = new PrintWriter(new File("out" + (char) (i + 96) + ".txt"));
        }
        Scanner in = new Scanner(new File("inStr.txt"));
        while(in.hasNext())
        {
            String x = in.next();
            if(k >= x.length())
                printWriters[0].println(x);
            else {
                int q = (int) ((char) (x.charAt(x.length() - k - 1) - 96));
                printWriters[q].println(x);
            }
        }
        for (int i = 0; i <= 26; i++) {
            printWriters[i].close();
        }
    }

    static int maxLength() throws IOException
    {
        Scanner in = new Scanner(new File("inStr.txt"));
        int max = 0;
        while(in.hasNext())
        {
            String x = in.next();
            if (x.length() > max)
                max = x.length();
        }
        return max;
    }
}
