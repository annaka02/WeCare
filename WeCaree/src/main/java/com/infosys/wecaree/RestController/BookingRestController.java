package com.infosys.wecaree.RestController;

import com.infosys.wecaree.DTO.BookingDTO;
import com.infosys.wecaree.Entity.Booking;
import com.infosys.wecaree.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/booking")
public class BookingRestController {

    @Autowired
    private BookingService bookingService;

    @GetMapping
    private List<BookingDTO> getAllBooking(){
        return bookingService.getAllBooking();
    }
    @GetMapping("/id")
    public Optional<Booking> getById(@PathVariable Integer id){
        return bookingService.getById(id);
    }

    @PostMapping("/create")
    public Booking create(@RequestBody Booking booking){
        return bookingService.create(booking);
    }

    @PutMapping("/update")
    public Booking update(@RequestBody Booking booking){
        return bookingService.update(booking);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        bookingService.deleteById(id);
    }

}
