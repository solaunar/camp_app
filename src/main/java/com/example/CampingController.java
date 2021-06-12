package com.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;

@RestController
public class CampingController {
    @Autowired
    private CampingRepository campingRepository;

    /*Add camping
    @RequestMapping(value = "/camp", method = RequestMethod.POST)
    public RedirectView addCamp(@ModelAttribute("SpringWeb") Camping camping) {
        Optional<Camping> exists = this.campingRepository.findByCname(camping.getCname());
        Camping camp=new Camping(camping.getCampId(),camping.getCname(),camping.getCdesc(), camping.getCloc(),camping.getCbank(),
                        camping.getCphone(),camping.getCemail(),camping.getCadd(),camping.getCut(),camping.getAquantity(),
                        camping.getAfield(),camping.getAcost(),camping.getBquantity(),camping.getBfield(),
                        camping.getBcost(),camping.getCquantity(),camping.getCfield(),camping.getCcost());

        if (exists.isEmpty()) {
            //if a user with the email entered doesn't exist, create user and complete user's connection
            //automatically retrieve user's account(no need of signing-in)
            this.campingRepository.save(camp);
            RedirectView home = new RedirectView();
            home.setUrl("http://localhost:8080/mainSignedIn");

            return home;
        } else {
            // else, reload sign-up form
            RedirectView reload = new RedirectView();
            reload.setUrl("http://localhost:8080/camp");

            return reload;
        }
    }
    END add camping*/

    /*Return Camping Object*/
    @GetMapping(value = "/camp/{cloc}")
    String registerUser(@PathVariable String cloc) throws  JsonProcessingException {
        Optional <Camping> exists= this.campingRepository.findByCloc(cloc);
        return new ObjectMapper().writeValueAsString(exists.get());
    }
}