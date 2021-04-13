package builder.Hesburger;

import builder.Hesburger.Parts.*;
import builder.IHamburgerBuilder;

public class HesburgerBuilder implements IHamburgerBuilder {

    private HesburgerHamburger hamburger;

    @Override
    public void createNewHamburger() {
        hamburger = new HesburgerHamburger();
    }

    @Override
    public void buildBun(boolean top) {
        hamburger.addHamburgerPart(new Bun("Bun with sesame seeds,", top));
    }

    @Override
    public void buildPatty() {
        hamburger.addHamburgerPart(new Patty("Medium rare patty"));
    }

    @Override
    public void buildSalad() {
        hamburger.addHamburgerPart(new Salad("Lettuce, cucumber and tomato slices"));
    }

    @Override
    public void buildMayonnaise() {
        hamburger.addHamburgerPart(new Mayonnaise("Light garlic mayonnaise"));
    }

    @Override
    public void buildExtra() {
        hamburger.addHamburgerPart(new Extra("Cheese"));
    }

    @Override
    public HesburgerHamburger getHamburger() {
        return hamburger;
    }
}
