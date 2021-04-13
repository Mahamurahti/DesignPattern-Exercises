package builder.McDonalds;

import builder.IHamburger;

public class McDonaldsHamburger implements IHamburger {

    private StringBuilder hamburger;

    public McDonaldsHamburger(){
        hamburger = new StringBuilder();
    }

    public void addHamburgerPart(String part){
        hamburger.append(part);
    }

    @Override
    public void describeHamburger(){
        System.out.println("McDonalds hamburger:");
        System.out.println(hamburger);
    }

}
