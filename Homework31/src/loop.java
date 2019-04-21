import java.util.ArrayList;
import java.util.Scanner;

public class loop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList arr = perestanovka(in.nextLine());

        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.println(arr.get(i).toString());
        }
    }

    public static ArrayList<String> perestanovka(String str) {
        ArrayList<String> results = new ArrayList<>();
        results.add(Character.toString(str.charAt(0)));
        int n1 = str.length();

            for (int i = 1;  i < n1;  i++) {
                char c = str.charAt(i);
                int size = results.size();

                for (int j = 0;  j < size;  j++) {
                    String p = results.remove(0);
                    int n2 = p.length();

                    for (int k = 0;  k <= n2;  k++) {
                        results.add(p.substring(0, k) + c + p.substring(k));
                    }
                }
            }
        return results;
    }
}
