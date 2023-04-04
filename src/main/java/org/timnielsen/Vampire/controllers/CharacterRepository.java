package org.timnielsen.Vampire.controllers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.timnielsen.Vampire.models.CharacterSheet;





public interface CharacterRepository extends JpaRepository<CharacterSheet, Long> {
CharacterSheet findById(String id);


}
