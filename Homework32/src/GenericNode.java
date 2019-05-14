public class GenericNode<T> {
    private T value;
    private GenericNode next;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public void setNext(GenericNode next){
        this.next = next;
    }

    public GenericNode getNext(){
        return next;
    }
}
