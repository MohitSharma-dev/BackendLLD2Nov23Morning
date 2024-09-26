package ParkingLot.services;

import ParkingLot.Strategies.SlotAssignStrategy;
import ParkingLot.models.*;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private SlotAssignStrategy slotAssignStrategy;
    private TicketRepository ticketRepository;

    public TicketService(
            GateRepository gateRepository, VehicleRepository vehicleRepository,
            SlotAssignStrategy slotAssignStrategy, TicketRepository ticketRepository
    ) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.slotAssignStrategy = slotAssignStrategy;
        this.ticketRepository = ticketRepository;
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
            Vehicle vehicle;
            Optional<Vehicle> vehicleOp = vehicleRepository.getVehicleByVehicleNumber(vehicleNUmber);
            if(vehicleOp.isEmpty()){
                vehicle = vehicleRepository.addVehicle(vehicleNUmber,ownerName,vehicleType);
            }
            else {
                vehicle = vehicleOp.get();
            }

//        4. Assign Slot
            ParkingSlot parkingSlot = slotAssignStrategy.assignSlot(vehicleType);
            if(parkingSlot == null){
                throw new RuntimeException("All ParkingSlot are full");
            }
//        5. ticket object creation
            Ticket ticket = new Ticket();
            ticket.setGate(gate);
            ticket.setVehicle(vehicle);
            ticket.setEntryTime(LocalDateTime.now());
            ticket.setOperator(gate.getOperator());
            ticket.setParkingSlot(parkingSlot);
            //ticket.setNumber();
//        6. save ticket object in the database
            ticketRepository.save(ticket);
        return ticket;
    }
}
