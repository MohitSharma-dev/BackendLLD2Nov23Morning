package Strategy;

public class PathCalculatorStrategyFactory {
    public static PathCalculatorStrategy getPathCalculatorStrategyByMode(TravelMode travelMode) {
        PathCalculatorStrategy pathCalculatorStrategy = null;
        if(travelMode.equals(TravelMode.BIKE)){
            pathCalculatorStrategy = new BikePathCalculatorStrategy();
        } else if(travelMode.equals(TravelMode.CAR)){
            pathCalculatorStrategy = new CarPathCalculatorStrategy();
        } else if(travelMode.equals(TravelMode.WALK)){
            pathCalculatorStrategy = new WalkPathCalculatorStrategy();
        }
        return pathCalculatorStrategy;
    }
}
