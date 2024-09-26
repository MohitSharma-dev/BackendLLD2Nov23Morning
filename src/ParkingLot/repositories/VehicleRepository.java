package ParkingLot.repositories;

import ParkingLot.models.Vehicle;
import ParkingLot.models.VehicleType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VehicleRepository {
    //private Map<Integer, Vehicle> vehicles = new HashMap<>();
    //private static int previousId = 0;
    private List<Vehicle> vehicles = new ArrayList<>();

    public Vehicle addVehicle(String vehicleNumber, String ownerName, VehicleType vehicleType) {
        Vehicle vehicle = new Vehicle();
        //vehicle.setId(previousId++);
        vehicle.setVehicleType(vehicleType);
        vehicle.setLicenseNumber(vehicleNumber);
        vehicle.setOwnerName(ownerName);
        //vehicles.put(previousId, vehicle);
        vehicles.add(vehicle);
        return vehicle;
    }

    //    public Optional<Vehicle> getVehicle(int id){
//        Vehicle vehicle = vehicles.get(id);
//        return Optional.of(vehicle);
//    }
    public Optional<Vehicle> getVehicleByVehicleNumber(String vehicleNumber) {
        return vehicles.stream().filter(x -> x.getLicenseNumber().equals(vehicleNumber)).findFirst();
    }
}
