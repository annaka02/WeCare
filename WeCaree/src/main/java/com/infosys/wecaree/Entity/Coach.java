package com.infosys.wecaree.Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "coach")
public class Coach {
    @Id
    private String CoachId;
    @Column(name = "name")

    private String name;
    @Column(name = "password")

    private String password;
    @Column(name = "gender")

    private char gender;
    @Column(name = "date_of_birth")

    private LocalDate dateOfBirth;
    @Column(name = "mobile_number")

    private long MobileNumber;
    @Column(name = "speciality")

    private String speciality;

    public Coach() {
    }

    public Coach(String coachId, String name, String password, char gender, LocalDate dateOfBirth, long mobileNumber, String speciality) {
        super();
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        MobileNumber = mobileNumber;
        this.speciality = speciality;
    }

    public String getCoachId() {
        return CoachId;
    }

    public void setCoachId(String coachId) {
        CoachId = coachId;
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
        return MobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "CoachId='" + CoachId + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", MobileNumber=" + MobileNumber +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
