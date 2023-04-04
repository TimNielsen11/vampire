package org.timnielsen.Vampire.controllers;


import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.timnielsen.Vampire.dto.UserRegistrationDto;
import org.timnielsen.Vampire.models.Role;
import org.timnielsen.Vampire.models.User;


@Service
public class UserServiceDelivery implements UserService {

   @Autowired
   private UserRepository userRepository;

   @Autowired
   private BCryptPasswordEncoder passwordEncoder;
   
   private static Logger log = LogManager.getLogger(UserService.class);

   public User findByEmail(String email){
       return userRepository.findByEmail(email);
   }

   public User save(UserRegistrationDto registration){
       User user = new User();
       user.setFirstName(registration.getFirstName());
       user.setLastName(registration.getLastName());
       user.setEmail(registration.getEmail());
       user.setPassword(passwordEncoder.encode(registration.getPassword()));
       user.setRoles(Arrays.asList(new Role("Player")));
       return userRepository.save(user);
   }



   @Override
   public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
       User user = userRepository.findByEmail(email);
       if (user == null){
           throw new UsernameNotFoundException("Invalid username or password.");
       }
       log.info("Member attempting login:  " + user.getEmail());
       return new org.springframework.security.core.userdetails.User(user.getEmail(),
               user.getPassword(),
               mapRolesToAuthorities(user.getRoles()));
      
   }

   private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
       return roles.stream()
               .map(role -> new SimpleGrantedAuthority(role.getName()))
               .collect(Collectors.toList());
   }
}
