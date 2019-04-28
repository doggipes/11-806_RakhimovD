import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

    public class randomMoi {
    public static int random(int min, int max){
        java.util.Random r = new java.util.Random();
        int ran = r.nextInt((max - min) + 1) + min;
        return ran;
    }

    public static void main(String[] args) throws IOException {
        int i = 100;
        PrintWriter pw = new PrintWriter(new File("input.txt"));
        for (int j = 0; j < i; j++) {
            for (int k = 0; k < random(10, 100); k++) {
                pw.print(random(0,1000) + " ");
            }
            pw.println();
        }
        pw.close();
    }
}
