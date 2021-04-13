package builder;

import builder.Hesburger.*;
import builder.McDonalds.*;

public class Main {
    public static void main(String[] args){

        Chef chef = new Chef("Alejandro");

        IHamburgerBuilder builder = new HesburgerBuilder();
        chef.setHamburgerBuilder(builder);

        chef.prepareHamburger();
        System.out.println("\n\n" + chef + " has prepared a hamburger for you!\n\n");
        IHamburger hesburger = builder.getHamburger();
        hesburger.describeHamburger();

        builder = new McDonaldsBuilder();
        chef.setHamburgerBuilder(builder);

        chef.prepareHamburger();
        System.out.println("\n\n" + chef + " has prepared a new hamburger for your tasting!\n\n");
        IHamburger mcburger = builder.getHamburger();
        mcburger.describeHamburger();
    }
}
