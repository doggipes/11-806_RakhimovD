public class LinkedList implements MyLinkedList{
    private Node head;
    private Node tail;
    private int count = 0;

    @Override
    public void add(int value) { //add new Node after tail
        Node newNode = new Node();
        newNode.setValue(value);
        newNode.setNext(null);

        if(head != null) {
            tail.setNext(newNode);
            tail = tail.getNext();
        }
        else {
            head = newNode;
            tail = head;
        }

        count++;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void remove(int index) { //find previous index and change link to through one Node
        if(index < 0 || count < index)
            throw new IllegalArgumentException("Index - " + index + " invalid");

        Node current = head;

        if(head != null) {
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }

            if(index == 0) {
                head = head.getNext();
            }
            else {
                isTail(current);
                current.setNext(current.getNext().getNext());
            }

            count--;
        }
        else {
            throw new IllegalArgumentException("List is empty");
        }
    }

    private void isTail(Node node) { //if remove last node, then reassign tail to previous node
        if(node.getNext() == tail)
            tail = node;
    }

    @Override
    public int[] getLinkedList() { //representation Node to Array and return him
        int i = 0;
        int[] printArray = new int[size()];
        Node current = head;

        while(i != size()) {
            printArray[i] = current.getValue();
            current = current.getNext();
            i++;
        }

        return printArray;
    }

    @Override
    public int getNodeValue(int index) { //find and return Node Value by index
        if(index < 0 || count < index)
            throw new IllegalArgumentException("Index - " + index + " invalid");

        Node current = head;

        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current.getValue();
    }

    @Override
    public boolean contains(int value) { //find value
        Node current = head;

        for (int i = 0; i < size(); i++) {
            if(current.getValue() == value)
                return true;
            current = current.getNext();
        }
        return false;
    }

    public int getHead()
    {
        return head.getValue();
    }

    public int getTail()
    {
        return tail.getValue();
    }

    @Override
    public void sort() {
        Node current = head;
        int swap = 0;

        for (int i = 0; i < size(); i++) {
            for (int j = 0; j < size() - i - 1; j++) {
                if(current.getValue() > current.getNext().getValue()){
                    swap = current.getValue();
                    current.setValue(current.getNext().getValue());
                    current.getNext().setValue(swap);
                }
                current = current.getNext();
            }
            current = head;
        }
    }

    @Override
    public void addAll(LinkedList list) {
        tail.setNext(list.head);
        tail = list.tail;
        count += list.size();
    }

    @Override
    public void addAll(LinkedList list, int index) {
        if(index == 0){
            list.tail.setNext(head);
            head = list.head;
        }
        else {
            Node newNode = head;
            for (int i = 0; i < index - 1; i++) {
                newNode = newNode.getNext();
            }
            tail = newNode;
            newNode = newNode.getNext();
            list.tail.setNext(newNode);
            tail.setNext(list.head);

        }

        count += list.size();
        tail = list.tail;
    }
}
