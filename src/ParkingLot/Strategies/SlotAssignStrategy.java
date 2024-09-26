package ParkingLot.Strategies;

import ParkingLot.models.ParkingSlot;
import ParkingLot.models.VehicleType;

public interface SlotAssignStrategy {

    public ParkingSlot assignSlot(VehicleType vehicleType);
}
