package org.timnielsen.Vampire.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.timnielsen.Vampire.models.CharacterSheet;
@Service
public class CharacterUpdateServiceDelivery implements CharacterUpdateService{
	@Autowired
    private CharacterUpdateRepository characterUpdateRepository;

	@Override
	@Transactional
	public CharacterSheet update(CharacterSheet charactersheet) {
		CharacterSheet updateResponse = characterUpdateRepository.save(charactersheet);
		return updateResponse;
	}

	@Override
	@Transactional
	public CharacterSheet save(CharacterSheet charactersheet) {
		// TODO Auto-generated method stub
		CharacterSheet createResponse = null;
		createResponse = characterUpdateRepository.save(charactersheet);
		return createResponse;
		
	}
}
