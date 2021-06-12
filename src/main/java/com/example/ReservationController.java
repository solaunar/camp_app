package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Date;
import java.util.Optional;

@Controller
public class ReservationController {
    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private UserRepository userRepository;

    /*Create user*/
    @RequestMapping(value = "/addReservation", method = RequestMethod.POST)
    public  String addReservation(@ModelAttribute("SpringWeb") Reservation reservation) {
        Optional<User> validUser=this.userRepository.findByUsername(reservation.getUname());
        if(validUser.isEmpty()){
            return "Error";
        }else {
            Optional<Reservation> exists = this.reservationRepository.findByUserIdAndCampIdAndRdateAndDdate(reservation.getUserId(), reservation.getCampId(), reservation.getRdate(), reservation.getDdate());
            Reservation reservation1 = new Reservation(reservation.getResId(), reservation.getCname(), reservation.getAquantity(), reservation.getBquantity(), reservation.getCquantity(),
                    reservation.getRdate(), reservation.getDdate(), reservation.getUname(), reservation.getUlastname(), reservation.getUemail(), reservation.getUsername(),
                    reservation.getCampId(), reservation.getUserId());

            if (exists.isEmpty()) {
                //if a user with the email entered doesn't exist, create user and complete user's connection
                //automatically retrieve user's account(no need of signing-in)
                this.reservationRepository.save(reservation1);
                return "OK";
            } else {
                // else, reload sign-up form
                return "ERROR";
            }
        }
    }
    /*END create user*/
}