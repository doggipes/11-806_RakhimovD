
import java.util.Arrays;
import java.util.Comparator;

public class SimpleMap<K, V> implements Map<K, V> {
    Entry[] entries;
    int n = 0;
    int size;

    public SimpleMap(int size) {
        entries = new Entry[size];
        this.size = size;
    }

    @Override
    public void put(K key, V value) {
        if(n >= size){
            size++;
            entries = Arrays.copyOf(entries,size);
        }
        for (int i = 0; i < n; i++) {
            if (entries[i].key.equals(key)) {
                entries[i].value = value;
                return;
            }
        }
        Entry<K, V> newEntry = new Entry<>(key, value);
        entries[n] = newEntry;
        n++;
    }

    @Override
    public V get(K key) {
        for (int i = 0; i < n; i++) {
            if (entries[i].key.equals(key)) {
                return (V) entries[i].value;
            }
        }
        return null;
    }

    @Override
    public void printMap(){
        for (int i = 0; i < getSize() - 1; i++) {
            System.out.println(entries[i].key + " " + entries[i].value);
        }
    }

    @Override
    public void sort() {
        Entry swap;
        MyComparator comp = new MyComparator();
        for (int i = 0; i < getSize(); i++) {
            for (int j = 0; j < getSize() - i - 2; j++) {
                if(comp.compare(entries[j],entries[j+1]) < 0){
                    swap = entries[j];
                    entries[j] = entries[j+1];
                    entries[j+1] = swap;
                }
            }
        }
    }

    @Override
    public int getSize() {
        return entries.length;
    }

    @Override
    public String getK(int index) {
        return (String)entries[index].key;
    }


    class Entry<A, B> {
        A key;
        B value;

        public Entry(A key, B value) {
            this.key = key;
            this.value = value;
        }
    }

    public class MyComparator implements Comparator<Entry>{

        @Override
        public int compare(Entry o1, Entry o2) {
            return (Integer) o1.value - (Integer) o2.value;
        }
    }
}