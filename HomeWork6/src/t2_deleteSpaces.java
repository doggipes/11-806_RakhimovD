import java.util.Scanner;

public class t2_deleteSpaces {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(Itrim(str));
    }
    static String Itrim(String str)
    {   String str_clone = "";
        int i = 0;
        while(i < str.length())
        {
            if(str.charAt(i) != ' ')
                break;
            for (int j = 1; j < str.length(); j++) {
                str_clone += str.charAt(j);
            }
            str = str_clone;
            str_clone = "";
        }
        return str;
    }
}
