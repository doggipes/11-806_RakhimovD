public interface MyLinkedList {

    void add(int value);

    int size();

    void remove(int index);

    int[] getLinkedList();

    int getNodeValue(int index);

    boolean contains(int value);

    void sort();

    void addAll(LinkedList list);

    void addAll(LinkedList list, int index);
}
