package project.cinemareserve.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.cinemareserve.command.BookingCommand;
import project.cinemareserve.service.BookingService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/booking")
public class BookingController {
    private final BookingService bookingService;


    @PostMapping("/registerBooking")
    public ResponseEntity<String> registerBooking(@RequestBody BookingCommand command) {
        bookingService.registerBooking(command);
        return ResponseEntity.ok("Your seat has been successfully booked");
    }


}
