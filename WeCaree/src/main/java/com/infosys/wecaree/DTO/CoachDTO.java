package com.infosys.wecaree.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class CoachDTO {
    private String coachId;
    private String password;
    private String name;
    private LocalDate dateOfBirth;
    private char gender;
    private long mobileNumber;
    private String speciality;

    public CoachDTO() {

    }
}
