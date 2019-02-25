import java.util.Comparator;

public class Group {
    private Students[] arr;
    int n = 0;
    int size = 5;

    public Group(Comparator<Students> comparator) {
        this.arr = new Students[size];
        this.comparator = comparator;
    }

    private Comparator<Students> comparator = new ByNameCompare();

    public void add(Students student) {
        int c = 0;
        while (c < n && n != 0 && comparator.compare(arr[c],student) <= 0) {
            c++;
        }
        for(int i = n; i > c; i--){
            arr[i] = arr[i - 1];
        }
        arr[c] = student;
        n++;
    }

    public void printStudents(){
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i].name + " " + arr[i].surname + " " + arr[i].group);
        }
    }
}

