package com.pcgrw.designpattern.factory.factorymethod.product.chicagostyle;


import com.pcgrw.designpattern.factory.factorymethod.product.Pizza;

/**
 * 芝加哥香肠比萨
 */
public class ChicagoPepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("准备芝加哥香肠比萨");
    }

    @Override
    public void bake() {
        System.out.println("烘烤芝加哥香肠比萨");
    }

    @Override
    public void cut() {
        System.out.println("切片芝加哥香肠比萨");
    }

    @Override
    public void box() {
        System.out.println("装盒芝加哥香肠比萨");
    }
}
