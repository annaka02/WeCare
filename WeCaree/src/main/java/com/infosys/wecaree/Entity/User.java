package com.infosys.wecaree.Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "users")
public class User {
    @Id
    private String userId;

    @Column(name = "name")
    private String name ;
    @Column(name = "password")
    private String password;

    @Column(name = "gender")
    private char gender;
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "mobile_number")
    private long mobileNumber;

    @Column(name = "email")
    private String email;
    @Column(name = "pincode")

    private int pincode;
    @Column(name = "city")

    private String city;
    @Column(name = "state")

    private String state;
    @Column(name = "country")

    private String country;

    public User() {
    }

    public User(String userId, String name, String password, char gender, LocalDate dateOfBirth, long mobileNumber, String email, int pincode, String city, String state, String country) {
        super();
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.pincode = pincode;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", mobileNumber=" + mobileNumber +
                ", email='" + email + '\'' +
                ", pincode=" + pincode +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
