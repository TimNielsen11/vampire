package org.timnielsen.Vampire.controllers;

import org.springframework.stereotype.Component;
import org.timnielsen.Vampire.models.CharacterSheet;

@Component
public interface CharacterUpdateService {
 public CharacterSheet update(CharacterSheet charactersheet);
 public CharacterSheet save(CharacterSheet charactersheet);
}
