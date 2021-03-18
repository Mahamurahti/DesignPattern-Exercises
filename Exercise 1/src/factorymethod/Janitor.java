package factorymethod;

public class Janitor extends EatingBeing {

    public Janitor(){ setName("Janitor Jan"); }

    public Drink createDrink(){ return new Tea(); }

    public Food createFood(){ return new Donut(); }

}
