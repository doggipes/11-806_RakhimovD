public class Students {
    int group;
    String name;
    String surname;

    public Students(String name, String surname, int group){
        this.group = group;
        this.name = name;
        this.surname = surname;
    }

    public int hashCode(){
        int result = 1;
        result = result * 31 + group;
        result = result * 31 + name.hashCode();
        result = result * 31 + surname.hashCode();
        return result;
    }

    public boolean equals(Object obj){
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Students)) {
            return false;
        }
        Students student = (Students) obj;
        return this.group == student.group &&
                this.surname.equals(student.surname) &&
                this.name.equals(student.name);
    }
}
