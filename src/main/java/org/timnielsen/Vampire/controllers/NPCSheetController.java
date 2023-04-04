package org.timnielsen.Vampire.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import org.timnielsen.Vampire.models.NPCSheet;

import java.util.HashMap;
import java.util.Map;

@Controller
public class NPCSheetController {
   private Map<String, NPCSheet> npcMap = new HashMap<>();
   
   @Autowired
   private NPCRepository npcRepository;
   
   static String R = "This is a ";

  @GetMapping("/NPCSheet")
  public String characterForm ()
  {
      return "NPCSheet";
  }

  @PostMapping("/NPCUpdate")
 public String submit( @ModelAttribute("npcsheet") NPCSheet npcsheet, ModelMap model) {

model.addAttribute("nName", npcsheet.getnName());
model.addAttribute("nChronicle", npcsheet.getnChronicle());
model.addAttribute("nSire", npcsheet.getnSire());
model.addAttribute("nConcept", npcsheet.getnConcept());
model.addAttribute("nMotivation", npcsheet.getnMotivation());
model.addAttribute("nPrimeDiscipline", npcsheet.getnPrimeDiscipline());
model.addAttribute("nLocation", npcsheet.getnLocation());
model.addAttribute("nClan", npcsheet.getnClan());
model.addAttribute("nGeneration", npcsheet.getnGeneration());
model.addAttribute("nStrength", npcsheet.getnStrength());
model.addAttribute("nDexterity", npcsheet.getnDexterity());
model.addAttribute("nStamina", npcsheet.getnStamina());
model.addAttribute("nCharisma", npcsheet.getnCharisma());
model.addAttribute("nManipulation", npcsheet.getnManipulation());
model.addAttribute("nComposure", npcsheet.getnComposure());
model.addAttribute("nIntelligence", npcsheet.getnIntelligence());
model.addAttribute("nWits", npcsheet.getnWits());
model.addAttribute("nResolve", npcsheet.getnResolve());
model.addAttribute("nHealth", npcsheet.getnHealth());
model.addAttribute("nWillpower", npcsheet.getnWillpower());

model.addAttribute("nMerit", npcsheet.getnMerit());
model.addAttribute("nAllies", npcsheet.getnAllies());
model.addAttribute("nEnemies", npcsheet.getnEnemies());
model.addAttribute("nSecrets", npcsheet.getnSecrets());



       npcMap.put(npcsheet.getnName(), npcsheet);
       npcRepository.save(npcsheet);
       return "NPCUpdate";
   }
  

  @GetMapping({"/NPCList"})
  public ModelAndView getAllNPCs() {
		ModelAndView lister2 = new ModelAndView("NPCList");
		lister2.addObject("npcSheets", npcRepository.findAll());
		 Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		  String currentPrincipalName = authentication.getName();
		//lister.addObject("charactersheets", characterUpdateRepository.findById(user.getId()));
		//You can use currentPrincipalName to build an email to charaactersheet collection(chars) code here
		  //Later you need to be able to select a character, probably by ID, 
		  //to go to a delete page or back to testsheet
		System.out.println(R+"Lister:  " + lister2);
		System.out.println(R+ "currentPrincipalName:  " + currentPrincipalName);
		return lister2;
				
	}
  @GetMapping("/deleteNPC")
	public String deleteNPC(@RequestParam Long Id) {
		npcRepository.deleteById(Id);
		return "redirect:/NPClist";
	}
  
  @PostMapping("/saveNPC")
	public String saveNPC(@ModelAttribute NPCSheet npcSheet) {
		npcRepository.save(npcSheet);
		return "redirect:/NPCList";
	}
  
 // trying this code out
  @GetMapping("/nShowUpdateForm")
	public ModelAndView nshowUpdateForm(@RequestParam Long Id) {
		ModelAndView sheet = new ModelAndView("NPCUpdate");
		NPCSheet newone = npcRepository.findById(Id).get();
		sheet.addObject("npcSheet", newone);
		return sheet;
	}
}

