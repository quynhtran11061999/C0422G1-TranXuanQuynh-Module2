package CaseStudy.models;

public class Villa extends Facility {
    private String roomStandard;
    private String poolArea;
    private int numberFloors;

    public Villa() {
    }

    public Villa(String idFacility, String serviceName, double usableArea, double rentalCosts,
                 int maxPeople, String rentalTyle, String roomStandard, String poolArea, int numberFloors) {
        super(idFacility, serviceName, usableArea, rentalCosts, maxPeople, rentalTyle);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", numberFloors=" + numberFloors +
                '}';
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "," + roomStandard + "," + poolArea + "," + numberFloors;
    }

}
