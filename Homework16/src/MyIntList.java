public interface MyIntList {

    //добавление элемента в конец списка
    void add(int element);

    //удаление элемента по индексу(со смещением элементов влево)
    void remove(int index) throws IllegalAccessException;

    //число элементов в списке
    int size();

    //получение элемента по индексу
    int get(int index) throws IllegalAccessException;

    //если ли в списке такой элемент
    boolean contains(int value);

    //sort
    void sort();

    //return all elements in Array vision
    int[] toArray();

    //add all elements to other list to end
    void addAll(intList list) throws IllegalAccessException;

    //add all elements to other list after index position
    void addAll(intList list, int index) throws IllegalAccessException;
}
