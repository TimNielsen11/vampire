
package org.timnielsen.Vampire.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.stereotype.Controller;

//import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import org.timnielsen.Vampire.models.CharacterSheet;


//import java.util.HashMap;
//import java.util.Map;
//import java.util.Optional;

@Controller
public class CharacterSheetController{
 //  private Map<String, CharacterSheet> characterMap = new HashMap<>();
   
  // @Autowired
 //  private CharacterRepository characterRepository;

   @Autowired
   private CharacterUpdateService characterUpdateService;
   
   @Autowired
   private CharacterUpdateRepository characterUpdateRepository;
   
 //  @Autowired
 //  private UserRepository userRepository;
   
   static String R = "This is a ";

   //private User user;
   


//Functional items

  @GetMapping("/characterSheet")
  public String characterForm ()
  {
      return "characterSheet";
  }
  
  @PostMapping("/testSheet")
  public CharacterSheet submit( @ModelAttribute("charactersheet") CharacterSheet charactersheet, ModelMap model) {

model.addAttribute("name", charactersheet.getName());
model.addAttribute("chronicle", charactersheet.getChronicle());
model.addAttribute("sire", charactersheet.getSire());
model.addAttribute("concept", charactersheet.getConcept());
model.addAttribute("ambition", charactersheet.getAmbition());
model.addAttribute("desire", charactersheet.getDesire());
model.addAttribute("predator", charactersheet.getPredator());
model.addAttribute("clan", charactersheet.getClan());
model.addAttribute("generation", charactersheet.getGeneration());
model.addAttribute("strength", charactersheet.getStrength());
model.addAttribute("dexterity", charactersheet.getDexterity());
model.addAttribute("stamina", charactersheet.getStamina());
model.addAttribute("charisma", charactersheet.getCharisma());
model.addAttribute("manipulation", charactersheet.getManipulation());
model.addAttribute("composure", charactersheet.getComposure());
model.addAttribute("intelligence", charactersheet.getIntelligence());
model.addAttribute("wits", charactersheet.getWits());
model.addAttribute("resolve", charactersheet.getResolve());
model.addAttribute("health", charactersheet.getHealth());
model.addAttribute("willpower", charactersheet.getWillpower());
model.addAttribute("athletics", charactersheet.getAthletics());
model.addAttribute("brawl", charactersheet.getBrawl());
model.addAttribute("craft", charactersheet.getCraft());
model.addAttribute("drive", charactersheet.getDrive());
model.addAttribute("firearms", charactersheet.getFirearms());
model.addAttribute("larceny", charactersheet.getLarceny());
model.addAttribute("melee", charactersheet.getMelee());
model.addAttribute("stealth", charactersheet.getStealth());
model.addAttribute("survival", charactersheet.getSurvival());
model.addAttribute("animalKen", charactersheet.getAnimalKen());
model.addAttribute("etiquette", charactersheet.getEtiquette());
model.addAttribute("insight", charactersheet.getInsight());
model.addAttribute("intimidation", charactersheet.getIntimidation());
model.addAttribute("leadership", charactersheet.getLeadership());
model.addAttribute("performance", charactersheet.getPerformance());
model.addAttribute("persuasion", charactersheet.getPersuasion());
model.addAttribute("streetwise", charactersheet.getStreetwise());
model.addAttribute("subterfuge", charactersheet.getSubterfuge());
model.addAttribute("academics", charactersheet.getAcademics());
model.addAttribute("awareness", charactersheet.getAwareness());
model.addAttribute("finance", charactersheet.getFinance());
model.addAttribute("investigation", charactersheet.getInvestigation());
model.addAttribute("medicine", charactersheet.getMedicine());
model.addAttribute("occult", charactersheet.getOccult());
model.addAttribute("politics", charactersheet.getPolitics());
model.addAttribute("science", charactersheet.getScience());
model.addAttribute("technology", charactersheet.getTechnology());
model.addAttribute("animalism", charactersheet.getAnimalism());
model.addAttribute("auspex", charactersheet.getAuspex());
model.addAttribute("bloodSorcery", charactersheet.getBloodSorcery());
model.addAttribute("celerity", charactersheet.getCelerity());
model.addAttribute("dominate", charactersheet.getDominate());
model.addAttribute("fortitude", charactersheet.getFortitude());
model.addAttribute("obfuscate", charactersheet.getObfuscate());
model.addAttribute("oblivion", charactersheet.getOblivion());
model.addAttribute("potence", charactersheet.getPotence());
model.addAttribute("presence", charactersheet.getPresence());
model.addAttribute("protean", charactersheet.getProtean());
model.addAttribute("alchemy", charactersheet.getAlchemy());
model.addAttribute("humanity", charactersheet.getHumanity());
model.addAttribute("merit", charactersheet.getMerit());

// Validate if the Character Sheet Exists, then add the id so save updates the existing character sheet row

//if(characterRepository.findById(charactersheet.getId()) != null) {
	//model.addAttribute("id", charactersheet.getId());
	//}

      // characterMap.put(charactersheet.getName(), charactersheet);
      // characterRepository.save(charactersheet); //you need to update the hibernate options in charactersheet before this will work
       characterUpdateService.update(charactersheet);
       System.out.println(R+ "the ID:  " + charactersheet.getId());
       //return "testSheet";
       return charactersheet;
   }
  /*
  @GetMapping({"/CharacterList"})
public ModelAndView getAllCharacters() {
	ModelAndView lister = new ModelAndView("CharacterList");
	lister.addObject("charactersheets", characterUpdateRepository.findAll());
	System.out.println(r+ "Lister a modelandview:  " + lister);
	return lister;
			
} */
  
  
  @GetMapping({"/CharacterList"})
  public ModelAndView getAllCharacters() {
		ModelAndView lister = new ModelAndView("CharacterList");
		lister.addObject("charactersheets", characterUpdateRepository.findAll());
		 Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		  String currentPrincipalName = authentication.getName();
		//lister.addObject("charactersheets", characterUpdateRepository.findById(user.getId()));
		//You can use currentPrincipalName to build an email to charaactersheet collection(chars) code here
		  //Later you need to be able to select a character, probably by ID, 
		  //to go to a delete page or back to testsheet
		System.out.println(R+"Lister:  " + lister);
		System.out.println(R+ "currentPrincipalName:  " + currentPrincipalName);
		return lister;
				
	}
  @GetMapping("/deleteCharacter")
	public String deleteCharacter(@RequestParam Long Id) {
		characterUpdateRepository.deleteById(Id);
		return "redirect:/CharacterList";
	}
  
  @PostMapping("/saveCharacter")
	public String saveCharacter(@ModelAttribute CharacterSheet charactersheet) {
		characterUpdateRepository.save(charactersheet);
		return "redirect:/CharacterList";
	}
  /*
  @GetMapping("/updateCharacter")
	public String updateCharacter(@RequestParam Long Id) {
	  Optional<CharacterSheet> characterSheet = characterUpdateRepository.findById(Id);
	  if (characterSheet.isPresent()) {
		  CharacterSheet cs = characterSheet.get();
		  cs.setId(characterSheet.getId());
		  // use setters to load up entire cs and see if that works
		characterUpdateRepository.save(cs);
	  }
		return "redirect:/CharacterList";
	  
	}
  */
 // trying this code out
  @GetMapping("/showUpdateForm")
	public ModelAndView showUpdateForm(@RequestParam Long Id) {
		ModelAndView sheet = new ModelAndView("CharacterUpdate");
		CharacterSheet newone = characterUpdateRepository.findById(Id).get();
		sheet.addObject("charactersheet", newone);
		return sheet;
	}

}
/*
@Override
@PutMapping("/testSheet")
public CharacterSheet update(@RequestBody CharacterSheet charactersheet) {
	// TODO Auto-generated method stub
	CharacterSheet updateResponse = characterUpdateService.save(charactersheet);
	return updateResponse;
	
}
*/


/*
public CharacterSheet save( @ModelAttribute("charactersheet") CharacterSheet charactersheet) {



		// Validate if the Character Sheet Exists, then add the id so save updates the existing character sheet row

		//if(characterRepository.findById(charactersheet.getId()) != null) {
			//model.addAttribute("id", charactersheet.getId());
			//}

		       characterMap.put(charactersheet.getName(), charactersheet);
		       characterRepository.save(charactersheet); //you need to update the hibernate options in charactersheet before this will work
		       System.out.println(" Secondary Save - This is the ID:  " + charactersheet.getId());
		       return charactersheet;
	

}*/

// @Autowired
//  private CharacterUpdateServiceDelivery characterUpdateServiceDelivery;

// public CharacterSheet findById(Long id){
   //  return characterRepository.findById(id);
//  }
 
/*
@GetMapping("/CharacterList")
public String listConstruct () 
{
	return "CharacterList";
}

@PostMapping("/CharacterList")
public String update( @ModelAttribute("charactersheet") CharacterSheet charactersheet, ModelMap model2) {
//initial page load will contain rows of id, name, concept, clan
	
model2.addAttribute("name", charactersheet.getName());
model2.addAttribute("chronicle", charactersheet.getChronicle());
model2.addAttribute("sire", charactersheet.getSire());
model2.addAttribute("concept", charactersheet.getConcept());
model2.addAttribute("ambition", charactersheet.getAmbition());
model2.addAttribute("desire", charactersheet.getDesire());
model2.addAttribute("predator", charactersheet.getPredator());
model2.addAttribute("clan", charactersheet.getClan());
model2.addAttribute("generation", charactersheet.getGeneration());
model2.addAttribute("strength", charactersheet.getStrength());
model2.addAttribute("dexterity", charactersheet.getDexterity());
model2.addAttribute("stamina", charactersheet.getStamina());
model2.addAttribute("charisma", charactersheet.getCharisma());
model2.addAttribute("manipulation", charactersheet.getManipulation());
model2.addAttribute("composure", charactersheet.getComposure());
model2.addAttribute("intelligence", charactersheet.getIntelligence());
model2.addAttribute("wits", charactersheet.getWits());
model2.addAttribute("resolve", charactersheet.getResolve());
model2.addAttribute("health", charactersheet.getHealth());
model2.addAttribute("willpower", charactersheet.getWillpower());
model2.addAttribute("athletics", charactersheet.getAthletics());
model2.addAttribute("brawl", charactersheet.getBrawl());
model2.addAttribute("craft", charactersheet.getCraft());
model2.addAttribute("drive", charactersheet.getDrive());
model2.addAttribute("firearms", charactersheet.getFirearms());
model2.addAttribute("larceny", charactersheet.getLarceny());
model2.addAttribute("melee", charactersheet.getMelee());
model2.addAttribute("stealth", charactersheet.getStealth());
model2.addAttribute("survival", charactersheet.getSurvival());
model2.addAttribute("animalKen", charactersheet.getAnimalKen());
model2.addAttribute("etiquette", charactersheet.getEtiquette());
model2.addAttribute("insight", charactersheet.getInsight());
model2.addAttribute("intimidation", charactersheet.getIntimidation());
model2.addAttribute("leadership", charactersheet.getLeadership());
model2.addAttribute("performance", charactersheet.getPerformance());
model2.addAttribute("persuasion", charactersheet.getPersuasion());
model2.addAttribute("streetwise", charactersheet.getStreetwise());
model2.addAttribute("subterfuge", charactersheet.getSubterfuge());
model2.addAttribute("academics", charactersheet.getAcademics());
model2.addAttribute("awareness", charactersheet.getAwareness());
model2.addAttribute("finance", charactersheet.getFinance());
model2.addAttribute("investigation", charactersheet.getInvestigation());
model2.addAttribute("medicine", charactersheet.getMedicine());
model2.addAttribute("occult", charactersheet.getOccult());
model2.addAttribute("politics", charactersheet.getPolitics());
model2.addAttribute("science", charactersheet.getScience());
model2.addAttribute("technology", charactersheet.getTechnology());
model2.addAttribute("animalism", charactersheet.getAnimalism());
model2.addAttribute("auspex", charactersheet.getAuspex());
model2.addAttribute("bloodSorcery", charactersheet.getBloodSorcery());
model2.addAttribute("celerity", charactersheet.getCelerity());
model2.addAttribute("dominate", charactersheet.getDominate());
model2.addAttribute("fortitude", charactersheet.getFortitude());
model2.addAttribute("obfuscate", charactersheet.getObfuscate());
model2.addAttribute("oblivion", charactersheet.getOblivion());
model2.addAttribute("potence", charactersheet.getPotence());
model2.addAttribute("presence", charactersheet.getPresence());
model2.addAttribute("protean", charactersheet.getProtean());
model2.addAttribute("alchemy", charactersheet.getAlchemy());
model2.addAttribute("humanity", charactersheet.getHumanity());
model2.addAttribute("merit", charactersheet.getMerit());
model2.addAttribute("id", charactersheet.getId());

characterRepository.save(charactersheet); //you need to update the hibernate options in charactersheet before this will work

  return "testSheet";
} */
