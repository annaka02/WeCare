package com.infosys.wecaree.Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId;
    @Column(name = "user_id")

    private String userId;
    @Column(name = "coach_id")

    private String CoachId;
    @Column(name = "slot")

    private String slot;
    @Column(name = "appointment_date")

    private LocalDate appointementDate;

    public Booking() {
    }

    public Booking(int bookingId, String userId, String coachId, String slot, LocalDate appointementDate) {
        super();
        this.bookingId = bookingId;
        this.userId = userId;
        CoachId = coachId;
        this.slot = slot;
        this.appointementDate = appointementDate;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCoachId() {
        return CoachId;
    }

    public void setCoachId(String coachId) {
        CoachId = coachId;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public LocalDate getAppointementDate() {
        return appointementDate;
    }

    public void setAppointementDate(LocalDate appointementDate) {
        this.appointementDate = appointementDate;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", userId='" + userId + '\'' +
                ", CoachId='" + CoachId + '\'' +
                ", slot='" + slot + '\'' +
                ", appointementDate=" + appointementDate +
                '}';
    }
}
