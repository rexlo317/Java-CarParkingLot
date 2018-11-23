import java.util.LinkedList;

public class ParkingBoy {
    private ParkingLot[] parkingLots;
    private Ticket[] tickets;
    private int ticketCount = 0;
    public ParkingBoy(ParkingLot[] parkingLots){
        this.parkingLots = parkingLots;
    }

    public void parkCar(Car car, LinkedList<ParkingLot> parkingLots){
        ParkingLot resultLot = parkingLots.getFirst();
        int lotNumber = 0;
        int resultPlace = 0 ;
        resultLot.setParkingGrid(resultPlace, car);
        car.setParked(true);
        car.setFetched(false);
        generateTicket(lotNumber, resultPlace, car);

    }

    private void generateTicket (int lotNumber, int resultPlace, Car car){
        tickets[ticketCount] = new Ticket(resultPlace, lotNumber, car);
        ticketCount++;
    }

    public void getCarFromParkingLots(Ticket ticket){
        ticket.getCar().setFetched(true);
        ticket.getCar().setParked(false);
    }
}
