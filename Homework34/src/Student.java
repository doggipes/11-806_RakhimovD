public class Student {
    private int age;
    public String name;
    private Iterable i;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void passExam(String exam) {
        System.out.println(exam + " ваще на изи, " +
                "всё списал, ваще не палил");
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
