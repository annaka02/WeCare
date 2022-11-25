package com.infosys.wecaree.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class BookingDTO {
    private int bookingId;
    private String userId;
    private String coachId;
    private LocalDate dateOfBirth;
    private String slot;

    public BookingDTO() {

    }
}
