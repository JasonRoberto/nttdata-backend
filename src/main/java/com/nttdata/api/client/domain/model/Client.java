package com.nttdata.api.client.domain.model;

public class Client {
    private String firstName;
    private String secondName;
    private String firstSurname;
    private String secondSurname;
    private String phone;
    private String address;
    private String city;

    private Client(String firstName, String secondName, String firstSurname, String secondSurname, String phone, String address, String city) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.firstSurname = firstSurname;
        this.secondSurname = secondSurname;
        this.phone = phone;
        this.address = address;
        this.city = city;
    }
    
    public static Client create(String firstName, String secondName, String firstSurname, String secondSurname, String phone, String address, String city) {
        return new Client(firstName, secondName, firstSurname, secondSurname, phone, address, city);
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getSecondName() {
        return secondName;
    }
    
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    
    public String getFirstSurname() {
        return firstSurname;
    }
    
    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }
    
    public String getSecondSurname() {
        return secondSurname;
    }
    
    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    @Override
    public String toString() {
        return "{" +
                "\"firstName\":\"" + firstName + "\"," +
                "\"secondName\":\"" + secondName + "\"," +
                "\"firstSurname\":\"" + firstSurname + "\"," +
                "\"secondSurname\":\"" + secondSurname + "\"," +
                "\"phone\":\"" + phone + "\"," +
                "\"address\":\"" + address + "\"," +
                "\"city\":\"" + city + "\"" +
                "}";
    }
}
