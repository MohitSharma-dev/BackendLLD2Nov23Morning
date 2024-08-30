package Strategy;

public class GoogleMaps {
    void findPathVersion1(TravelMode travelMode){
        if(travelMode.equals(TravelMode.BIKE)){
//            certain algo
            System.out.println("Bike path is being calculated");
        } else if(travelMode.equals(TravelMode.CAR)){
            System.out.println("Car path is being calculated");
        } else if(travelMode.equals(TravelMode.WALK)){
            System.out.println("Walk path is being calculated");
        }
    }

    void findPathVersion2(TravelMode travelMode){
        PathCalculatorStrategy pathCalculatorStrategy = null;
        if(travelMode.equals(TravelMode.BIKE)){
//            certain algo
            pathCalculatorStrategy = new BikePathCalculatorStrategy();
        } else if(travelMode.equals(TravelMode.CAR)){
            pathCalculatorStrategy = new CarPathCalculatorStrategy();
        } else if(travelMode.equals(TravelMode.WALK)){
            pathCalculatorStrategy = new WalkPathCalculatorStrategy();
        }
        pathCalculatorStrategy.findPath();
    }

    void findPathVersion3(TravelMode travelMode){
        PathCalculatorStrategyFactory.getPathCalculatorStrategyByMode(travelMode)
                .findPath();
    }
}
