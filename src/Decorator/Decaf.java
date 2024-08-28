package Decorator;

public class Decaf extends Beverage {

    @Override
    public String getDesc() {
        return "Decaf";
    }

    @Override
    public int cost() {
        return 75;
    }
}
