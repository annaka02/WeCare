package com.infosys.wecaree.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class UserDTO {
    private String coachId;
    private String password;
    private  String name;
    private LocalDate dateOfBirth;
    private char gender;
    private long mobileNumber;
    private String email;
    private int pincode;
    private String city;
    private String state;
    private String Country;

    public UserDTO() {

    }
}
