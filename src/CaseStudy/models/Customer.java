package CaseStudy.models;

import java.time.LocalDate;

public class Customer extends Person {
    private int customerCode;
    private String clientType;
    private String address;

    public Customer() {
    }


    public Customer(String name, LocalDate birthDay, String gender, int idCode, int phoneNumber, String email, int customerCode, String clientType, String address) {
        super(name, birthDay, gender, idCode, phoneNumber, email);
        this.customerCode = customerCode;
        this.clientType = clientType;
        this.address = address;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "customerCode='" + customerCode + '\'' +
                "clientType='" + clientType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getInfoCustomer() {
        return super.getInfo() + "," + customerCode + "," + clientType + "," + address;
    }
}
