import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("input.txt"));
        long time;
        fiboncciHeap fh;
        /*while (in.hasNextLine()) {                                       // for tests
            fh = new fiboncciHeap();
            String[] str = in.nextLine().split(" ");
            int[] integer = new int[str.length];

            for (int i = 0; i < str.length; i++) {
                integer[i] = Integer.parseInt(str[i]);
            }
            //System.out.println();
            //time = System.nanoTime();
            for (int i = 0; i < str.length; i++) {
                fh.add(integer[i]);
            }
            //System.out.println(System.nanoTime() - time + " " + str.length);

            time = System.nanoTime();
            for (int i = 0; i < str.length - 1; i++) {
                fh.deleteMin();
            }
            System.out.println(System.nanoTime() - time + " " + str.length);

            /*time = System.nanoTime();
            for (int i = 0; i < str.length; i++) {
                fh.search(integer[i]);
            }
            System.out.println(System.nanoTime() - time + " " + str.length);*/

        fh = new fiboncciHeap();


        //Zadacha - sortirovka


        int[] integer = new int[]{463,834,551,445,290,611,139,540,404,888,232,617,334,975,672,594,848,36,720};
        for (int i = 0; i < integer.length; i++) {
            fh.add(integer[i]);
        }

        for (int i = 0; i < integer.length - 1; i++) {
            System.out.println(fh.getMin());
            fh.deleteMin();
        }
            System.out.println(fh.getMin());
    }
}