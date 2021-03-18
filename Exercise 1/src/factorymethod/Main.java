package factorymethod;

public class Main {
    public static void main(String[] args) {
        EatingBeing teacher = new Teacher();
        EatingBeing student = new Student();
        EatingBeing janitor = new Janitor();

        teacher.haveMeal();
        student.haveMeal();
        janitor.haveMeal();
    }
}
