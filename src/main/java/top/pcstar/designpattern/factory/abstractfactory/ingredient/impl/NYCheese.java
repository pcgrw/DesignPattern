package top.pcstar.designpattern.factory.abstractfactory.ingredient.impl;

import top.pcstar.designpattern.factory.abstractfactory.ingredient.Cheese;

public class NYCheese implements Cheese {
    @Override
    public String getName() {
        return "纽约奶酪";
    }
}