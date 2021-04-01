package strategy;

public class Sorter {
    private ISort strategy;

    public Sorter(ISort strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(int[] tableToBeSorted){
        strategy.sort(tableToBeSorted);
    }
}
