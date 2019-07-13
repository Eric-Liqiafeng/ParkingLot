package com.thoughtworks.tdd;

import java.util.HashMap;

public class ParkingLot {
    private HashMap<Ticket, Car> parkingCarTicket;

    public ParkingLot(){
        parkingCarTicket = new HashMap<>();
    }

    public Ticket park(Car car){
        Ticket ticket = new Ticket();
        parkingCarTicket.put(ticket, car);
        return ticket;
    }

    public Car getCar(Ticket ticket) throws Exception {
        Car car = parkingCarTicket.get(ticket);
        if (car == null) {
            throw new Exception();
        }
        parkingCarTicket.remove(ticket);
        return car;
    }
}
