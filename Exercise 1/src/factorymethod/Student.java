package factorymethod;

public class Student extends EatingBeing {

    public Student(){ setName("Student Sharon"); }

    public Drink createDrink() { return new Lemonade(); }

    public Food createFood(){ return new Sausage(); }

}
