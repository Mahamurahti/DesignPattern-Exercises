package chainOfResponsibility;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SalaryRequest {

    private final Worker worker;
    private final double currentSalary, newSalary;

    public SalaryRequest(Worker worker, double currentSalary, double newSalary){
        this.worker = worker;
        this.currentSalary = currentSalary;
        this.newSalary = newSalary;
    }

    public Worker getWorker(){
        return worker;
    }

    public double getCurrentSalary(){
        return currentSalary;
    }

    public double getNewSalary(){
        return newSalary;
    }

    public double raisePercentage(){
        return BigDecimal.valueOf((newSalary / currentSalary - 1) * 100).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

}
