public class Car {
    private boolean isParked;
    private boolean isFetched;
    private String carID;

    public Car(boolean isParked, boolean isFetched, String carID){
        this.isParked = isParked;
        this.isFetched = isFetched;
        this.carID = carID;
    }

    public boolean isParked() {
        return isParked;
    }

    public void setParked(boolean parked) {
        isParked = parked;
    }

    public boolean isFetched() {
        return isFetched;
    }

    public void setFetched(boolean fetched) {
        isFetched = fetched;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

}
