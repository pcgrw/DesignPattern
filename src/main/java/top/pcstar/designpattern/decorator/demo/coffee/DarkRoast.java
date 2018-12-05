package top.pcstar.designpattern.decorator.demo.coffee;

import top.pcstar.designpattern.decorator.demo.Beverage;

/**
 * 黑焦咖啡
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        this.description = "黑焦咖啡";
    }

    @Override
    public double cost() {
        return 2;
    }
}
