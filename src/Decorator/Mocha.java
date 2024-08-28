package Decorator;

public class Mocha extends Addon {
    private Beverage beverage;

    Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 11;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", Mocha";
    }
}
