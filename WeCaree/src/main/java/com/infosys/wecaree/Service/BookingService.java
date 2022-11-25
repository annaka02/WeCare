package com.infosys.wecaree.Service;

import com.infosys.wecaree.DTO.BookingDTO;
import com.infosys.wecaree.Entity.Booking;
import com.infosys.wecaree.Repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public List<BookingDTO> getAllBooking(){
        return bookingRepository.findAll().stream().map(this::convertEntityToDTO).collect(Collectors.toList());
    }
    private BookingDTO convertEntityToDTO(Booking booking){
        BookingDTO bookingDTO = new BookingDTO();
        bookingDTO.setBookingId(booking.getBookingId());
        bookingDTO.setCoachId(booking.getCoachId());
        bookingDTO.setUserId(booking.getUserId());
        bookingDTO.setSlot(booking.getSlot());
        bookingDTO.setDateOfBirth(booking.getAppointementDate());
        return bookingDTO;
    }
    public Booking create(Booking booking){
        return bookingRepository.save(booking);
    }
    public Booking update(Booking booking){
        return bookingRepository.save(booking);
    }
    public void deleteById(Integer id){
        bookingRepository.deleteById(id);
    }

    public Optional<Booking> getById(Integer id) {
            return bookingRepository.findById(id);
        }
    }

