import javax.xml.soap.Node;
import java.util.Iterator;


public class GenericLinkedList<T> implements Iterable<T> {
    private int count = 0;
    private GenericNode head;
    private GenericNode tail;


    public void add(T value) {
        GenericNode current = new GenericNode();
        current.setValue(value);
        current.setNext(null);

        if(head != null){
            tail.setNext(current);
            tail = tail.getNext();
        }
        else{
            head = current;
            tail = head;
        }
        count++;
    }

    public int size() {
        return count;
    }

    public void remove(int index) {
        if (index < 0 || count < index)
            throw new IllegalArgumentException("Index - " + index + " invalid");

        if(index == 0) {
            head = head.getNext();
            count--;
        }

        GenericNode node = head;

        if (head != null) {
            for (int i = 0; i < index - 1; i++) {
                node = node.getNext();
            }

            isTail(node);
            node.setNext(node.getNext().getNext());

            count--;
        }
        else{
            throw new IllegalArgumentException(index + "- invalid index");
        }
    }


    private void isTail(GenericNode node) { //if we remove last node, then we reassign tail to previous node
        if(node.getNext() == tail)
            tail = node;
    }

    public T[] getLinkedList() {
        T[] print = (T[]) new Object[size()];

        GenericNode node = head;
        for (int i = 0; i < size(); i++) {
            print[i] = (T) node.getValue();
            node = node.getNext();
        }
        return print;
    }

    public T getNodeValue(int index) {
        if(index < 0 || count < index)
            throw new IllegalArgumentException("Index - " + index + " invalid");

        GenericNode node = head;

        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }

        return (T) node.getValue();
    }

    public boolean contains(T value) {
        GenericNode node = head;

        for (int i = 0; i < size(); i++) {
            if(value == (T) node.getValue())
                return true;
            node = node.getNext();
        }

        return false;
    }


    public void addAll(GenericLinkedList list) {
        tail.setNext(list.head);
        tail = list.tail;
        count += list.size();
    }

    public void addAll(GenericLinkedList list, int index) {
            if(index == 0){
                list.tail.setNext(head);
                head = list.head;
            }
            else{
                GenericNode node = head;

                for (int i = 0; i < index - 1; i++) {
                    node = node.getNext();
                }

                tail = node;
                node = node.getNext();
                list.tail.setNext(node);
                tail.setNext(list.head);
            }

        count += list.size();
        tail = list.tail;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator<T>{
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public T next() {
            GenericNode node = head;
            for (int i = 0; i < currentIndex; i++) {
                node = node.getNext();
            }
            currentIndex++;
            return (T) node;
        }
    }
}
