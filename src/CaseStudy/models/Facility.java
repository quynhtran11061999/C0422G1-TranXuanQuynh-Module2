package CaseStudy.models;

public abstract class Facility {
    private String idFacility;
    private String serviceName;
    private double usableArea;
    private double rentalCosts;
    private int maxPeople;
    private String rentalTyle;

    public Facility() {
    }

    public Facility(String idFacility, String serviceName, double usableArea, double rentalCosts, int maxPeople, String rentalTyle) {
        this.idFacility = idFacility;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maxPeople = maxPeople;
        this.rentalTyle = rentalTyle;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentalTyle() {
        return rentalTyle;
    }

    public void setRentalTyle(String rentalTyle) {
        this.rentalTyle = rentalTyle;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "idFacility='" + idFacility + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", maxPeople=" + maxPeople +
                ", rentalTyle='" + rentalTyle + '\'' +
                '}';
    }

    public String getInfo() {
        return idFacility + "," + serviceName + "," + usableArea + "," + rentalCosts + "," + maxPeople + "," + rentalTyle;
    }
}
