package com.pcgrw.designpattern.factory.abstractfactory.factory.impl;

import com.pcgrw.designpattern.factory.abstractfactory.factory.PizzaIngredientFactory;
import com.pcgrw.designpattern.factory.abstractfactory.ingredient.*;
import com.pcgrw.designpattern.factory.abstractfactory.ingredient.impl.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return new NYCheese();
    }

    @Override
    public Dough createDough() {
        return new NYDough();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new NYPepperoni();
    }

    @Override
    public Sauce createSauce() {
        return new NYSauce();
    }

    @Override
    public Clams createClams() {
        return new NYClams();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new NYVeggies()};
        return veggies;
    }
}
