package org.timnielsen.Vampire.controllers;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.timnielsen.Vampire.dto.UserRegistrationDto;
import org.timnielsen.Vampire.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.*;
@Slf4j


@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

   @Autowired
   private UserService userService;
   
   Logger log = LoggerFactory.getLogger(UserRegistrationController.class);

   @ModelAttribute("user")
   public UserRegistrationDto userRegistrationDto() {
       return new UserRegistrationDto();
   }

   @GetMapping
   public String showRegistrationForm(Model model) {
       return "registration";
   }

   @PostMapping
   public String registerUserAccount(@ModelAttribute("user") @Valid UserRegistrationDto userDto, BindingResult result){

       User existing = userService.findByEmail(userDto.getEmail());
       if (existing != null){
           result.rejectValue("email", null, "There is an account currently registered with that email");
       }

       if (result.hasErrors()){
           return "registration";
       }

       userService.save(userDto);
       
      
   log.warn("Warn Example");
   log.error("Error Example");
   log.trace("Trace Example");
   log.debug("Debug Example");
   log.info("This is a log entry using log4J in the registration module");
   
  
   		
   	

       return "redirect:/registration?success";
   }
}
