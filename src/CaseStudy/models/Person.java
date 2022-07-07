package CaseStudy.models;

import CaseStudy.common.FormatDate;

import java.time.LocalDate;

public abstract class Person {
    private String name;
    private LocalDate birthDay;
    private String gender;
    private int idCode;
    private int phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String name, LocalDate birthDay, String gender, int idCode, int phoneNumber, String email) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.idCode = idCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCode() {
        return idCode;
    }

    public void setIdCode(int idCode) {
        this.idCode = idCode;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDay=" + FormatDate.getDateFormatted(birthDay) +
                ", gender='" + gender + '\'' +
                ", idCode=" + idCode +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }

    public String getInfo() {
        return  name + "," + birthDay + "," + gender + "," + idCode + "," + phoneNumber + "," + email;
    }
}
