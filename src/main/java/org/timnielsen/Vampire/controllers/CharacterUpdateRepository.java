package org.timnielsen.Vampire.controllers;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.timnielsen.Vampire.models.CharacterSheet;

public interface CharacterUpdateRepository extends JpaRepository<CharacterSheet, Serializable> {
	//CharacterSheet findById(String id);
}





