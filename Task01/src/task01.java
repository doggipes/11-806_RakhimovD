import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.function.Predicate;

public class task01 {

    public interface Predicate<String> {
        boolean test(String str);
    }

    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> map = new SimpleMap<>(1);
        Scanner in = new Scanner(new File("in.txt"));
        while(in.hasNext()){
            String str = in.next();
            str = str.replaceAll("\\.","");
            str = str.replaceAll("\\,","");
            if(map.get(str) == null)
                map.put(str, 1);
            else
                map.put(str, map.get(str) + 1);
        }
        in.close();
        map.sort();
        //map.printMap();

        int chet = 0;
        int k;
        for (int i = 0; i < map.getSize() - 1; i++) {
            int q = i;
            Predicate predicate = str -> str.equals(map.getK(q));
            for (int j = 0; j < map.getSize() - 1; j++) {
                k = j;
                if(predicate.test(map.getK(k)))
                    chet++;
            }
            if(chet == 1)
                System.out.println(map.getK(q));
                chet = 0;
        }

    }
}