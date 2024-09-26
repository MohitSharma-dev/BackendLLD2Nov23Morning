package ParkingLot.Strtegies;

import ParkingLot.models.ParkingSlot;
import ParkingLot.models.ParkingSlotStatus;
import ParkingLot.models.VehicleType;
import ParkingLot.repositories.ParkingSlotRepository;

import java.util.List;

public class NearestSlotAssignStrategy implements SlotAssignStrategy{
    public ParkingSlotRepository parkingSlotRepository;

    public NearestSlotAssignStrategy(ParkingSlotRepository parkingSlotRepository){
        this.parkingSlotRepository = parkingSlotRepository;
    }

    @Override
    public ParkingSlot assignSlot(VehicleType vehicleType) {
        List<ParkingSlot> parkingSlotList = parkingSlotRepository.getParkingSlots();
        return parkingSlotList.stream().filter(x -> x.getVehicleType().equals(vehicleType) && x.getParkingSlotStatus().equals(ParkingSlotStatus.EMPTY)).findFirst().orElse(null);
    }
}
