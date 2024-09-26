package ParkingLot.Strtegies;

import ParkingLot.models.ParkingSlot;
import ParkingLot.models.VehicleType;
import ParkingLot.repositories.ParkingSlotRepository;

public interface SlotAssignStrategy {

    public ParkingSlot assignSlot(VehicleType vehicleType);
}
