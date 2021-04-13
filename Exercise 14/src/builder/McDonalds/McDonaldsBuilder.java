package builder.McDonalds;

import builder.IHamburgerBuilder;

public class McDonaldsBuilder implements IHamburgerBuilder {

    private McDonaldsHamburger hamburger;

    @Override
    public void createNewHamburger() {
        hamburger = new McDonaldsHamburger();
    }

    @Override
    public void buildBun(boolean top) {
        hamburger.addHamburgerPart(" Regular bun, " + (top ? "on top " : "at bottom ") + "\n");
    }

    @Override
    public void buildPatty() {
        hamburger.addHamburgerPart(" Medium well patty \n");
    }

    @Override
    public void buildSalad() {
        hamburger.addHamburgerPart(" Lettuce, onion rings and pickles \n");
    }

    @Override
    public void buildMayonnaise() {
        hamburger.addHamburgerPart(" Spicy chipotle mayonnaise \n");
    }

    @Override
    public void buildExtra() {
        hamburger.addHamburgerPart(" Bacon strips \n");
    }

    @Override
    public McDonaldsHamburger getHamburger() {
        return hamburger;
    }
}
