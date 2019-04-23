public interface Map<K, V> {
    void put(K key, V value);
    V get(K key);
    void printMap();
    void sort();
    int getSize();
    String getK(int index);
}

// key - string
//value - int