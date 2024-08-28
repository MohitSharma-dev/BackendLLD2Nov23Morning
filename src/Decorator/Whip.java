package Decorator;

public class Whip extends Addon{

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 5;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", Whip";
    }
}
