package chainOfResponsibility;

public class CEO extends RaisePower{

    private String name;

    public CEO(String name){
        this.name = name;
    }

    @Override
    public void processRequest(SalaryRequest request){
        if(request.raisePercentage() > Boss.RAISABLE){
            System.out.println("CEO " + name + " the all mighty, will approve this raise of " + request.raisePercentage() + "% to " + request.getWorker().getName());
            request.getWorker().setSalary(request.getNewSalary());
        }else
            System.out.println("Something is fishy about this request, it is denied.");
    }

}
