package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    /*Create user*/
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public RedirectView addUser(@ModelAttribute("SpringWeb") User user, BindingResult result, Model model) {
        Optional<User> exists = this.userRepository.findByUsername(user.getUsername());
        User usr=new User(user.getName(),user.getLastname(),user.getEmail(),user.getLocation(), user.getPhone(), user.getUsername(),user.getPassword());

        if (exists.isEmpty()) {
            //if a user with the email entered doesn't exist, create user and complete user's connection
            //automatically retrieve user's account(no need of signing-in)
            this.userRepository.save(usr);
            RedirectView home = new RedirectView();
            home.setUrl("http://localhost:8080/mainSignedIn");

            return home;
        } else {
            // else, reload sign-up form
            RedirectView reload = new RedirectView();
            reload.setUrl("http://localhost:8080/signup");

            return reload;
        }
    }
    /*END create user*/

    /*Signin user*/
    @RequestMapping(value = "/signinUser", method = RequestMethod.GET)
    RedirectView registerUser(@RequestParam String username, @RequestParam String password){
        Optional<User> exists= this.userRepository.findByUsernameAndPassword(username, password);
        if (exists.isEmpty()) {
            RedirectView home = new RedirectView();
            home.setUrl("http://localhost:8080/signin");
            return home;
        } else {
            // else, reload signin form
            RedirectView reload = new RedirectView();
            reload.setUrl("http://localhost:8080/mainSignedIn");
            return reload;
        }
    }
}
