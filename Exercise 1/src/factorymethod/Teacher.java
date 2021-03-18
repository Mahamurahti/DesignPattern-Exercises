package factorymethod;

public class Teacher extends EatingBeing {

    public Teacher(){ setName("Teacher Trudy"); }

    public Drink createDrink(){ return new Water(); }

    public Food createFood(){ return new Salad(); }

}
