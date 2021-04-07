package chainOfResponsibility;

public class Superior extends RaisePower {

    protected static final double RAISABLE = BASE_RAISE;

    private String name;

    public Superior(String name){
        this.name = name;
    }

    @Override
    public void processRequest(SalaryRequest request){
        if(request.raisePercentage() < RAISABLE){
            System.out.println("Superior " + name + " will approve this raise of " + request.raisePercentage() + "% to " + request.getWorker().getName());
            request.getWorker().setSalary(request.getNewSalary());
        }else
            super.processRequest(request);
    }

}
