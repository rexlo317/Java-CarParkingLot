public class Ticket {
    private int resultPlace;
    private int lotNumber;
    private Car car;
    public Ticket(int resultPlace, int lotNumber, Car car){
        this.resultPlace = resultPlace;
        this.lotNumber = lotNumber;
        this.car = car;
    }

    public int getResultPlace() {
        return resultPlace;
    }

    public void setResultPlace(int resultPlace) {
        this.resultPlace = resultPlace;
    }

    public int getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(int lotNumber) {
        this.lotNumber = lotNumber;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
