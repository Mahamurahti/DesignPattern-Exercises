package compositemethod;

class Main {
    public static void main(String[] args){
        Computer computer = new Computer();

        IFactory factory = new BudgetFactory();
        computer.setComputer(factory.createComputer());
        System.out.println("\n --- Budget Factory --- \n");
        System.out.println("Computer price: " + computer.getComputer().getPrice() + "€");
        System.out.println("Computer parts: " + computer.getComputer().getPart());

        factory = new MidrangeFactory();
        computer.setComputer(factory.createComputer());
        System.out.println("\n --- Midrange Factory --- \n");
        System.out.println("Computer price: " + computer.getComputer().getPrice() + "€");
        System.out.println("Computer parts: " + computer.getComputer().getPart());

        factory = new ExpensiveFactory();
        computer.setComputer(factory.createComputer());
        System.out.println("\n --- Expensive Factory --- \n");
        System.out.println("Computer price: " + computer.getComputer().getPrice() + "€");
        System.out.println("Computer parts: " + computer.getComputer().getPart());
    }
}
