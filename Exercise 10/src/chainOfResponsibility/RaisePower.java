package chainOfResponsibility;

public abstract class RaisePower {

    protected static final double BASE_RAISE = 2; // Percentage
    private RaisePower successor;

    public void setSuccessor(RaisePower successor) {
        this.successor = successor;
    }
    public void processRequest(SalaryRequest request){
        if (successor != null)
            successor.processRequest(request);
    }

}
