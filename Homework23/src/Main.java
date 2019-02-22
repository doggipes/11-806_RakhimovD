public class Main {
    public static void main(String[] args) {
        Students Nikita = new Students("Nikita", "Cherpnigov",806);
        Students Nikita2 = new Students(new String("Nikita"), new String("Cherpnigov"),806);
        if(Nikita.equals(Nikita2) && Nikita.hashCode() == Nikita2.hashCode())
            System.out.println(true);
        else
            System.out.println(false);
    }
}
