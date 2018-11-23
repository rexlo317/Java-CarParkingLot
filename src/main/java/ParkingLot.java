public class ParkingLot {
    private Car[] parkingGrid;
    private boolean isFull;
    private float fullPercentage;
    private int remainPlace;
    private int lotSize;

    public ParkingLot(boolean isFull, float fullPercentage, int remainPlace, int lotSize){
        this.lotSize = lotSize;
        parkingGrid = new Car[lotSize];
        isFull = false;
        fullPercentage = 0;
        remainPlace = lotSize;
    }

    public Car[] getParkingGrid() {
        return parkingGrid;
    }

    public void setParkingGrid(int index, Car car){
        parkingGrid[index] = car;
    }

    public void setParkingGrid(Car[] parkingGrid) {
        this.parkingGrid = parkingGrid;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public float getFullPercentage() {
        return fullPercentage;
    }

    public void setFullPercentage(float fullPercentage) {
        this.fullPercentage = fullPercentage;
    }

    public int getRemainPlace() {
        return remainPlace;
    }

    public void setRemainPlace(int remainPlace) {
        this.remainPlace = remainPlace;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public boolean getIsFull(){
        return isFull;
    }
}
