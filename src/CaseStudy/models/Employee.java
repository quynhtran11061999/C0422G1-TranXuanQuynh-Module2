package CaseStudy.models;

import java.time.LocalDate;

public class Employee extends Person {
    private int employeeCode;
    private String level;
    private String location;
    private double wage;

    public Employee() {
    }


    public Employee(String name, LocalDate birthDay, String gender, int idCode, int phoneNumber, String email, int employeeCode, String level, String location, double wage) {
        super(name, birthDay, gender, idCode, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "employeeCode=" + employeeCode +
                ", level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", wage=" + wage +
                '}';
    }

    public String getInfoEmployee() {
        return super.getInfo() + "," + employeeCode + "," + level + "," + location + "," + wage;
    }
}
