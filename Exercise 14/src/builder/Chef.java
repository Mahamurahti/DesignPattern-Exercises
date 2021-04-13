package builder;

public class Chef {

    private IHamburgerBuilder hamburgerBuilder;
    private String name;

    public Chef(String name){
        this.name = name;
    }

    public void setHamburgerBuilder(IHamburgerBuilder hamburgerBuilder) {
        this.hamburgerBuilder = hamburgerBuilder;
    }

    public void prepareHamburger(){
        hamburgerBuilder.createNewHamburger();
        hamburgerBuilder.buildBun(true);
        hamburgerBuilder.buildSalad();
        hamburgerBuilder.buildExtra();
        hamburgerBuilder.buildPatty();
        hamburgerBuilder.buildMayonnaise();
        hamburgerBuilder.buildBun(false);
    }

    @Override
    public String toString(){
        return this.name;
    }
}
