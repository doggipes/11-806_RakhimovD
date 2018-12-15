import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);
        //a.remove(0); //start from 0
        LinkedList b = new LinkedList();
        b.add(8);
        b.add(8);
        b.add(8);
        b.add(8);
        a.addAll(b,0);
        int[] arr = a.getLinkedList();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();

        GenericLinkedList<Integer> q = new GenericLinkedList();
        q.add(10);
        q.add(10);
        q.add(10);
        q.add(10);
        q.remove(3);
        Integer[] ar = Arrays.copyOf(q.getLinkedList(),q.size(),Integer[].class);
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
