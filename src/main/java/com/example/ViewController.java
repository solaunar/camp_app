package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    /*return main.html*/
    @GetMapping("/home")
    public String home() {
        //returns home.html, located in the folder main->resources->templates
        return "main";
    }

    /*return camp_reg.html*/
    @GetMapping("/campReg")
    public String campReg() {
        return "camp_reg";
    }

    /*return reservation.html*/
    @GetMapping("/reservation")
    public String reservation() {
        return "reservation";
    }

    /*return signin.html*/
    @GetMapping("/signin")
    public String signin() {
        return "signin";
    }

    /*return userRegistration.html*/
    @GetMapping("/signup")
    public String signup() {
        return "userRegistration";
    }

    /*return mainSignedIn.html*/
    @GetMapping("/mainSignedIn")
    public String main() {
        return "mainSignedIn";
    }

    /*return campSearch.html*/
    @GetMapping("/camps")
    public String camping() {
        return "campSearch";
    }

    /*return campSearchSignedIn.html*/
    @GetMapping("/campSignedIn")
    public String campingSingedIn() {
        return "campSearchSignedIn";
    }

}
