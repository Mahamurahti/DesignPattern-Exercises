package chainOfResponsibility;

public class Main {
    public static void main(String[] args){
        Worker worker1 = new Worker("Stephan", 1962.31);
        Worker worker2 = new Worker("Joan", 2000.73);
        Worker worker3 = new Worker("Peter", 1299.40);
        Superior superior = new Superior("Anastasia");
        Boss boss = new Boss("Maverick");
        CEO ceo = new CEO("José");

        superior.setSuccessor(boss);
        boss.setSuccessor(ceo);

        System.out.println("\n"); // Stephan first raise

        System.out.println(worker1.getName() + " has proven himself to be capable. " + worker1.getName() +
                " asks to raise his salary from " + worker1.getSalary() + "€ to 1969.31€");
        superior.processRequest(new SalaryRequest(worker1, worker1.getSalary(), 1969.31));

        System.out.println("\n"); // Stephan second raise

        System.out.println(worker1.getName() + " has been hard at work and thinks he deserves a raise. " + worker1.getName() +
                           " asks to raise his salary from " + worker1.getSalary() + "€ to 2000.32€");
        superior.processRequest(new SalaryRequest(worker1, worker1.getSalary(), 2000.32));

        System.out.println("\n"); // Joan first raise

        System.out.println(worker2.getName() + " has done a huge project and did most of it by herself. " + worker2.getName() +
                " asks to raise her salary from " + worker2.getSalary() + "€ to 2046.42€");
        superior.processRequest(new SalaryRequest(worker2, worker2.getSalary(), 2046.42));

        System.out.println("\n"); // Peter first raise

        System.out.println(worker3.getName() + " has just been promoted because of a huge successful campaign which gained a lot of " +
                "money to the company. " + worker3.getName() + " asks to raise his salary from " + worker3.getSalary() + "€ to 1400.45€");
        superior.processRequest(new SalaryRequest(worker3, worker3.getSalary(), 1400.45));

        System.out.println("\n"); // Stephan third raise

        System.out.println(worker1.getName() + " has been very hard at work again and think he deserves a substantial raise. " +
                worker1.getName() + " asks to raise his salary from " + worker1.getSalary() + "€ to 2090.50€");
        superior.processRequest(new SalaryRequest(worker1, worker1.getSalary(), 2090.50));

    }
}
