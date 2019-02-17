public class Queue<T> {
    Node<T> first;
    Node<T> last;

    void enqueue(T elem) {
        Node<T> oldLast = last;
        last = new Node<>();
        last.item = elem;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
    }

    void dequeue() {
        if(isEmpty())
            throw new IllegalArgumentException("Queue is empty");
        else{
            first = first.getNext();
        }
    }


    boolean isEmpty() {
        return first == null;
    }

    class Node<T> {
        T item;
        Node<T> next;

        public void setValue(T item){
            this.item = item;
        }

        public T getValue(){
            return item;
        }

        public void setNext(Node next){
            this.next = next;
        }

        public Node getNext(){
            return next;
        }
    }
}
