import java.lang.reflect.GenericArrayType;
import java.util.Arrays;
import java.util.Iterator;

public class arrayListGeneric<T> implements Iterable<T> {
    private T[] elements;
    private int count = 0;

    public arrayListGeneric(){
        elements = (T[]) new Object[10];
    }

    public void add(T e){
        if(count == elements.length)
            grow();

        elements[count++] = e;
    }

    private void grow(){
        int oldCapacity = elements.length;
        int newCapacity = (int) (oldCapacity * 1.5 + 1);
        T[] newElements = (T[]) new Object[10];
        for (int i = 0; i < oldCapacity; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    public T get(int index){
        return elements[index];
    }

    public int size(){
        return count;
    }

    boolean contains(T value){
        for (int i = 0; i < count; i++) {
            if(elements[i] == value)
                return true;
        }
        return false;
    }

    void remove(int index){
        T[] newElements = (T[]) new Object[size() - 1];
        for (int i = 0; i < index; i++) {
            newElements[i] = elements[i];
        }
        for (int i = index; i < newElements.length; i++) {
            newElements[i] = elements[i+1];
        }
        elements = newElements;
        count--;
    }

    T[] toArray(){
        return Arrays.copyOf(elements,count);
    }

        void addAll(arrayListGeneric<T> list){
            for (int i = 0; i < list.size(); i++) {
                add(list.get(i));
            }
        }

        void addAll(arrayListGeneric<T> list, int index){
            int size = size();
            for (int i = index; i < size; i++) {
                list.add(get(index));
                remove(index);
            }
            for (int i = 0; i < list.size(); i++) {
                add(list.get(i));
            }
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
            return elements[currentIndex++];
        }
    }
}
