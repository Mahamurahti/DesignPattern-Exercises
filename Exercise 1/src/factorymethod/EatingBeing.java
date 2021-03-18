package factorymethod;

public abstract class EatingBeing {

    Drink drink = null;
    Food food = null;
    String name = null;

    public abstract Drink createDrink();
    public abstract Food createFood();

    public void haveMeal(){
        speaker();
        eat();
        drink();
    }

    public void speaker(){
        System.out.println("\n" + this.name + ":");
    }

    public void eat(){
        if(food == null)
            food = createFood();
        System.out.println("This " + food + " tastes awesome!");
    }

    public void drink(){
        if (drink == null)
            drink = createDrink();
        System.out.println("After the meal a glass of " + drink + " does good!");
    }

    public void setName(String name){
        this.name = name;
    }
}
