package org.timnielsen.Vampire.controllers;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.timnielsen.Vampire.dto.UserRegistrationDto;
import org.timnielsen.Vampire.models.User;


public interface UserService extends UserDetailsService {
   User findByEmail(String email);
   User save(UserRegistrationDto registration);
   
   
}
