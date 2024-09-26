package ParkingLot.repositories;

import ParkingLot.models.ParkingLot;
import ParkingLot.models.ParkingSlot;

import java.util.*;

public class ParkingSlotRepository {
    private List<ParkingSlot> parkingSlots = new ArrayList<>();
    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }
}
