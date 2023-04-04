package org.timnielsen.Vampire.controllers;

import org.springframework.security.core.userdetails.UserDetailsService;

import org.timnielsen.Vampire.models.CharacterSheet;


public interface CharacterService extends UserDetailsService {
	CharacterSheet findById(String id);
	   
	}
