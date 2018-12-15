import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        intList list = new intList(3);
        list.add(42);
        list.add(50);
        list.add(1);
        //list.remove(5); //start from 0
        //System.out.println(list.get(0));
        //list.sort();
        intList list1 = new intList(4);
        list1.add(18);
        list1.add(20);
        list1.add(1);
        list1.add(30);
        list.addAll(list1,2);
        int[] e = list.toArray();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(e[i]);
        }

        //Generic
        arrayListGeneric<String> lis = new arrayListGeneric<>();
        lis.add("abc");
        lis.add("cde");
        lis.add("qwerty");
        Iterator<String> iter = lis.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
