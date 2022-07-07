package CaseStudy.models;

public class House extends Facility {
    private String roomStandard;
    private int numberFloors;

    public House() {
    }

    public House(String idFacility, String serviceName, double usableArea, double rentalCosts, int maxPeople, String rentalTyle, String roomStandard, int numberFloors) {
        super(idFacility,serviceName, usableArea, rentalCosts, maxPeople, rentalTyle);
        this.roomStandard = roomStandard;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", numberFloors=" + numberFloors +
                '}';
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "," + roomStandard + "," + numberFloors;    }
}
