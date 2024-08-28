package Decorator;

public class Milk extends Addon{
    private Beverage beverage;

    Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + ", Milk";
    }

    @Override
    public int cost() {
        return beverage.cost() + 23;
    }
}
