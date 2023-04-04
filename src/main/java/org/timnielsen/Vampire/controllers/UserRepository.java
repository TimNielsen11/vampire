package org.timnielsen.Vampire.controllers;
import org.springframework.data.jpa.repository.JpaRepository;

import org.timnielsen.Vampire.models.User;




public interface UserRepository extends JpaRepository<User, Long> {
  User findByEmail(String email);
}
