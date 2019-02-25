import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Group vosemnolshest = new Group(new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.group - o2.group;
            }
        });
        Students s1 = new Students("Vanya", "Vanya", 806);
        Students s2 = new Students("Sanya", "Vanya", 806);
        Students s3 = new Students("Vanya", "Sanya", 806);
        Students s4 = new Students("Sanya", "Sanya", 806);
        Students s5 = new Students("Igor", "Igorek", 806);
        vosemnolshest.add(s2);
        vosemnolshest.add(s5);
        vosemnolshest.add(s4);
        vosemnolshest.add(s3);
        vosemnolshest.add(s1);

        vosemnolshest.printStudents();
        System.out.println();

        Group vtoraya = new Group(((o1, o2) -> o1.name.compareTo(o2.name)));
        vtoraya.add(s1);
        vtoraya.add(s2);
        vtoraya.add(s3);
        vtoraya.add(s4);
        vtoraya.add(s5);

        vtoraya.printStudents();
    }
}
