package Decorator;

public class HouseBlend extends Beverage {
    @Override
    public String getDesc() {
        return "HouseBlend";
    }

    @Override
    public int cost() {
        return 50;
    }
}
