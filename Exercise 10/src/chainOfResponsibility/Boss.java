package chainOfResponsibility;

public class Boss extends RaisePower{

    protected static final double RAISABLE = BASE_RAISE * 2.5;

    private String name;

    public Boss(String name){
        this.name = name;
    }

    @Override
    public void processRequest(SalaryRequest request){
        if(request.raisePercentage() > Superior.RAISABLE && request.raisePercentage() < RAISABLE){
            System.out.println("Boss " + name + " will approve this raise of " + request.raisePercentage() + "% to " + request.getWorker().getName());
            request.getWorker().setSalary(request.getNewSalary());
        }else
            super.processRequest(request);
    }
}
