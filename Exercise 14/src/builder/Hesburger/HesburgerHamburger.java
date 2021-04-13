package builder.Hesburger;

import builder.Hesburger.Parts.IHamburgerPart;
import builder.IHamburger;

import java.util.ArrayList;
import java.util.List;

public class HesburgerHamburger implements IHamburger {

    private List<IHamburgerPart> hamburger;

    public HesburgerHamburger(){
        hamburger = new ArrayList<>();
    }

    public void addHamburgerPart(IHamburgerPart part){
        hamburger.add(part);
    }

    @Override
    public void describeHamburger(){
        System.out.println("Hesburger hamburger:");
        for (IHamburgerPart hamburger : hamburger)
            System.out.println(hamburger);
    }

}
