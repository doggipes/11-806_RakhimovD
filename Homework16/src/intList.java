public class intList implements MyIntList {

    private int[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    private static final double EXTENSION_COEF = 1.5;
    private int count = 0;

    public intList(){
        this.elements = new int[DEFAULT_CAPACITY];
    }

    public intList(int capacity){
        if(capacity <= 1)
            throw new IllegalArgumentException(capacity + " is non-valid capacity");
        this.elements = new int[capacity];
    }

    @Override
    public void add(int element) {
        if(count == elements.length)
            grow();

        elements[count++] = element;
    }

    private void grow()
    {
        int oldCapacity = elements.length;
        int newCapacity = (int) (oldCapacity * EXTENSION_COEF + 1);
        int[] newElements = new int[newCapacity];
        for (int i = 0; i < oldCapacity; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    @Override
    public void remove(int index) throws IllegalAccessException {
        if(index < 0 || index >= count)
            throw new IllegalAccessException(index + " is non-valid index");
        int newCapacity = elements.length - 1;
        int[] newElements = new int[newCapacity];
        for (int i = 0; i < index; i++) {
            newElements[i] = elements[i];
        }
        for (int i = index; i < elements.length - 1; i++) {
            newElements[i] = elements[i+1];
        }
        elements = newElements;
        count--;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public int get(int index) throws IllegalAccessException {
        if(index < 0 || index >= count)
            throw new IllegalAccessException("Index not valid " + index);
        return elements[index];
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < elements.length; i++) {
            if(value == elements[i])
                return true;
        }
        return false;
    }

    @Override
    public void sort() {
        int e = 0;
        int index = 0;
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length - i - 1; j++) {
                if(elements[j] > elements[j+1])
                {
                    e = elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = e;
                }
            }
        }
    }


    @Override
    public int[] toArray() {
        int[] copyArray = new int[size()];
        for (int i = 0; i < size(); i++) {
            copyArray[i] = elements[i];
        }
        return copyArray;
    }

    @Override
    public void addAll(intList list) throws IllegalAccessException {
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
    }

    @Override
    public void addAll(intList list, int index) throws IllegalAccessException {
        int size = size();
        for (int i = index; i < size; i++) {
            list.add(get(index));
            remove(index);
        }
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
    }
}