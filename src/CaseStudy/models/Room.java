package CaseStudy.models;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String idFacility, String serviceName, double usableArea, double rentalCosts, int maxPeople, String rentalTyle, String freeService) {
        super(idFacility, serviceName, usableArea, rentalCosts, maxPeople, rentalTyle);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "," + freeService;
    }

}
