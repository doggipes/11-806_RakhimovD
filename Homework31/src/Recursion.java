import java.util.Scanner;

public class Recursion {
    private static String[] strArr;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;

        str = in.nextLine();

        strArr = new String[factorial(str.length())];
        recursion(0, str);

        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
    }

    private static int factorial(int n) {
        int f = 1;
        int i = 1;

        while(i <= n){
            f *= i;
            i++;
        }

        return f;
    }

    private static void recursion(int start, String str) {
        if (str.length() == 0) {
            return;
        }

        int index = start;
        int f = factorial(str.length());

        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < f / str.length(); j++) {
                if(strArr[index] == null)
                    strArr[index] = Character.toString(ch[i]);
                else
                    strArr[index] += Character.toString(ch[i]);

                index++;
            }
            recursion(start + (f / str.length()) * i, str.substring(0, i) + str.substring(i + 1, str.length()));
        }
    }

}