package ParkingLot.services;

import ParkingLot.models.Gate;
import ParkingLot.models.Ticket;
import ParkingLot.models.VehicleType;
import ParkingLot.repositories.GateRepository;

import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;

    public TicketService(
            GateRepository gateRepository
    ) {
        this.gateRepository = gateRepository;
    }

    public Ticket issueTicket(
            String vehicleNUmber,
            String ownerName,
            VehicleType vehicleType,
            int gateId
    ){

//        1. Get the corresponding Gate object for gateId
            Optional<Gate> gateOptional = gateRepository.findGateById(gateId);

            if(gateOptional.isEmpty()){
                throw new RuntimeException("Invalid Gate Found");
            }
            Gate gate = gateOptional.get();
//        2. Get the corresponding vehicle Object
//        3. If vehicle doesn't already create one object
//        4. Assign Slot
//        5. ticket object creation
//        6. save ticket object in the database


        return null;
    }
}
