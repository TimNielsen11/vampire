package org.timnielsen.Vampire.models;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import jakarta.persistence.UniqueConstraint;
//import lombok.AccessLevel;


//import lombok.NoArgsConstructor;





@Entity
@Table
public class CharacterSheet implements Serializable {
	
	@Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String strength;
	private String chronicle;
	private String sire;
	private String concept;
	private String ambition;
	private String desire;
	private String predator;
	private String clan;
	private String generation;
	private String dexterity;
	private String stamina;
	private String charisma;
	private String manipulation;
	private String composure;
	private String intelligence;
	private String wits;
	private String resolve;
	private String health;
	private String willpower;
	private String athletics;
	private String brawl;
	private String craft;
	private String drive;
	private String firearms;
	private String larceny;
	private String melee;
	private String stealth;
	private String survival;
	private String animalKen;
	private String etiquette;
	private String insight;
	private String intimidation;
	private String leadership;
	private String performance;
	private String persuasion;
	private String streetwise;
	private String subterfuge;
	private String academics;
	private String awareness;
	private String finance;
	private String investigation;
	private String medicine;
	private String occult;
	private String politics;
	private String science;
	private String technology;
	private String animalism;
	private String auspex;
	private String bloodSorcery;
	private String celerity;
	private String dominate;
	private String fortitude;
	private String obfuscate;
	private String oblivion;
	private String potence;
	private String presence;
	private String protean;
	private String alchemy;
	private String humanity;
	private String merit;
	
	


  

   public CharacterSheet(String name, String chronicle, String sire, String concept, 
		   String ambition, String desire, String predator, String clan, String generation, 
		   String strength, String dexterity, String stamina, String charisma, 
		   String manipulation, String composure, String intelligence, String wits, String resolve, 
		   String health, String willpower, String athletics, String brawl, String craft,
		   String drive, String firearms, String larceny, String melee, String stealth,
		   String survival, String animalKen, String etiquette, String insight, String intimidation,
		   String leadership, String performance, String persuasion, String streetwise, String subterfuge, 
		   String academics, String awareness, String finance, String investigation, String medicine, 
		   String occult, String politics, String science, String technology, String animalism, 
		   String auspex, String bloodSorcery, String celerity, String dominate, String fortitude,
		   String obfuscate, String oblivion, String potence, String presence, String protean, String alchemy, String humanity, String merit) 
   {
       
       this.name = name;
       this.chronicle = chronicle;
       this.sire = sire;
       this.concept = concept;
       this.ambition = ambition;
       this.desire = desire;
       this.predator = predator;
       this.clan = clan;
       this.generation = generation;
       this.strength = strength;
       this.dexterity = dexterity;
       this.stamina = stamina;
       this.charisma = charisma;
       this.manipulation = manipulation;
       this.composure = composure;
       this.intelligence = intelligence;
       this.wits = wits;
       this.resolve = resolve;
       this.health = health;
       this.willpower = willpower;
       this.athletics = athletics;
       this.brawl = brawl;
       this.craft = craft;
       this.firearms = firearms;
       this.larceny = larceny;
       this.melee = melee;
       this.stealth = stealth;
       this.survival = survival;
       this.animalKen = animalKen;
       this.etiquette = etiquette;
       this.insight = insight;
       this.intimidation = intimidation;
       this.leadership = leadership;
       this.performance = performance;
       this.persuasion = persuasion;
       this.streetwise = streetwise;
       this.subterfuge = subterfuge;
       this.academics = academics;
       this.awareness = awareness;
       this.finance = finance;
       this.investigation = investigation;
       this.medicine = medicine;
       this.occult = occult;
       this.politics = politics;
       this.science = science;
       this.technology = technology;
       this.animalism = animalism;
       this.auspex = auspex;
       this.bloodSorcery = bloodSorcery;
       this.celerity = celerity;
       this.dominate = dominate;
       this.fortitude = fortitude;
       this.obfuscate = obfuscate;
       this.oblivion = oblivion;
       this.potence = potence;
       this.presence = presence;
       this.protean = protean;
       this.alchemy = alchemy;
       this.humanity = humanity;
       this.merit = merit;
       
       
   }
   
   public CharacterSheet(String name, String chronicle, String sire, String concept, 
		   String ambition, String desire, String predator, String clan, String generation, 
		   String strength, String dexterity, String stamina, String charisma, 
		   String manipulation, String composure, String intelligence, String wits, String resolve, 
		   String health, String willpower, String athletics, String brawl, String craft,
		   String drive, String firearms, String larceny, String melee, String stealth,
		   String survival, String animalKen, String etiquette, String insight, String intimidation,
		   String leadership, String performance, String persuasion, String streetwise, String subterfuge, 
		   String academics, String awareness, String finance, String investigation, String medicine, 
		   String occult, String politics, String science, String technology, String animalism, 
		   String auspex, String bloodSorcery, String celerity, String dominate, String fortitude,
		   String obfuscate, String oblivion, String potence, String presence, String protean, String alchemy, String humanity, String merit, Long id) 
   {
       
       this.name = name;
       this.chronicle = chronicle;
       this.sire = sire;
       this.concept = concept;
       this.ambition = ambition;
       this.desire = desire;
       this.predator = predator;
       this.clan = clan;
       this.generation = generation;
       this.strength = strength;
       this.dexterity = dexterity;
       this.stamina = stamina;
       this.charisma = charisma;
       this.manipulation = manipulation;
       this.composure = composure;
       this.intelligence = intelligence;
       this.wits = wits;
       this.resolve = resolve;
       this.health = health;
       this.willpower = willpower;
       this.athletics = athletics;
       this.brawl = brawl;
       this.craft = craft;
       this.firearms = firearms;
       this.larceny = larceny;
       this.melee = melee;
       this.stealth = stealth;
       this.survival = survival;
       this.animalKen = animalKen;
       this.etiquette = etiquette;
       this.insight = insight;
       this.intimidation = intimidation;
       this.leadership = leadership;
       this.performance = performance;
       this.persuasion = persuasion;
       this.streetwise = streetwise;
       this.subterfuge = subterfuge;
       this.academics = academics;
       this.awareness = awareness;
       this.finance = finance;
       this.investigation = investigation;
       this.medicine = medicine;
       this.occult = occult;
       this.politics = politics;
       this.science = science;
       this.technology = technology;
       this.animalism = animalism;
       this.auspex = auspex;
       this.bloodSorcery = bloodSorcery;
       this.celerity = celerity;
       this.dominate = dominate;
       this.fortitude = fortitude;
       this.obfuscate = obfuscate;
       this.oblivion = oblivion;
       this.potence = potence;
       this.presence = presence;
       this.protean = protean;
       this.alchemy = alchemy;
       this.humanity = humanity;
       this.merit = merit;
       this.id = id;
       
       
   }
   public CharacterSheet() {}
   
   public String getChronicle() {
	return chronicle;
}

public void setChronicle(String chronicle) {
	this.chronicle = chronicle;
}

public String getSire() {
	return sire;
}

public void setSire(String sire) {
	this.sire = sire;
}

public String getConcept() {
	return concept;
}

public void setConcept(String concept) {
	this.concept = concept;
}

public String getAmbition() {
	return ambition;
}

public void setAmbition(String ambition) {
	this.ambition = ambition;
}

public String getDesire() {
	return desire;
}

public void setDesire(String desire) {
	this.desire = desire;
}

public String getPredator() {
	return predator;
}

public void setPredator(String predator) {
	this.predator = predator;
}

public String getClan() {
	return clan;
}

public void setClan(String clan) {
	this.clan = clan;
}

public String getGeneration() {
	return generation;
}

public void setGeneration(String generation) {
	this.generation = generation;
}

public String getDexterity() {
	return dexterity;
}

public void setDexterity(String dexterity) {
	this.dexterity = dexterity;
}

public String getStrength() {
       return strength;
   }

   public void setStrength(String strength) {
       this.strength = strength;
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

public String getStamina() {
	return stamina;
}

public void setStamina(String stamina) {
	this.stamina = stamina;
}

public String getCharisma() {
	return charisma;
}

public void setCharisma(String charisma) {
	this.charisma = charisma;
}

public String getManipulation() {
	return manipulation;
}

public void setManipulation(String manipulation) {
	this.manipulation = manipulation;
}

public String getComposure() {
	return composure;
}

public void setComposure(String composure) {
	this.composure = composure;
}

public String getIntelligence() {
	return intelligence;
}

public void setIntelligence(String intelligence) {
	this.intelligence = intelligence;
}

public String getWits() {
	return wits;
}

public void setWits(String wits) {
	this.wits = wits;
}

public String getResolve() {
	return resolve;
}

public void setResolve(String resolve) {
	this.resolve = resolve;
}

public String getHealth() {
	return health;
}

public void setHealth(String health) {
	this.health = health;
}

public String getWillpower() {
	return willpower;
}

public void setWillpower(String willpower) {
	this.willpower = willpower;
}

public String getAthletics() {
	return athletics;
}

public void setAthletics(String athletics) {
	this.athletics = athletics;
}

public String getBrawl() {
	return brawl;
}

public void setBrawl(String brawl) {
	this.brawl = brawl;
}

public String getCraft() {
	return craft;
}

public void setCraft(String craft) {
	this.craft = craft;
}

public String getDrive() {
	return drive;
}

public void setDrive(String drive) {
	this.drive = drive;
}

public String getFirearms() {
	return firearms;
}

public void setFirearms(String firearms) {
	this.firearms = firearms;
}

public String getLarceny() {
	return larceny;
}

public void setLarceny(String larceny) {
	this.larceny = larceny;
}

public String getMelee() {
	return melee;
}

public void setMelee(String melee) {
	this.melee = melee;
}

public String getStealth() {
	return stealth;
}

public void setStealth(String stealth) {
	this.stealth = stealth;
}

public String getSurvival() {
	return survival;
}

public void setSurvival(String survival) {
	this.survival = survival;
}

public String getAnimalKen() {
	return animalKen;
}

public void setAnimalKen(String animalKen) {
	this.animalKen = animalKen;
}

public String getEtiquette() {
	return etiquette;
}

public void setEtiquette(String etiquette) {
	this.etiquette = etiquette;
}

public String getInsight() {
	return insight;
}

public void setInsight(String insight) {
	this.insight = insight;
}

public String getIntimidation() {
	return intimidation;
}

public void setIntimidation(String intimidation) {
	this.intimidation = intimidation;
}

public String getLeadership() {
	return leadership;
}

public void setLeadership(String leadership) {
	this.leadership = leadership;
}

public String getPerformance() {
	return performance;
}

public void setPerformance(String performance) {
	this.performance = performance;
}

public String getPersuasion() {
	return persuasion;
}

public void setPersuasion(String persuasion) {
	this.persuasion = persuasion;
}

public String getStreetwise() {
	return streetwise;
}

public void setStreetwise(String streetwise) {
	this.streetwise = streetwise;
}

public String getSubterfuge() {
	return subterfuge;
}

public void setSubterfuge(String subterfuge) {
	this.subterfuge = subterfuge;
}

public String getAcademics() {
	return academics;
}

public void setAcademics(String academics) {
	this.academics = academics;
}

public String getAwareness() {
	return awareness;
}

public void setAwareness(String awareness) {
	this.awareness = awareness;
}

public String getFinance() {
	return finance;
}

public void setFinance(String finance) {
	this.finance = finance;
}

public String getInvestigation() {
	return investigation;
}

public void setInvestigation(String investigation) {
	this.investigation = investigation;
}

public String getMedicine() {
	return medicine;
}

public void setMedicine(String medicine) {
	this.medicine = medicine;
}

public String getOccult() {
	return occult;
}

public void setOccult(String occult) {
	this.occult = occult;
}

public String getPolitics() {
	return politics;
}

public void setPolitics(String politics) {
	this.politics = politics;
}

public String getScience() {
	return science;
}

public void setScience(String science) {
	this.science = science;
}

public String getTechnology() {
	return technology;
}

public void setTechnology(String technology) {
	this.technology = technology;
}

public String getAnimalism() {
	return animalism;
}

public void setAnimalism(String animalism) {
	this.animalism = animalism;
}

public String getAuspex() {
	return auspex;
}

public void setAuspex(String auspex) {
	this.auspex = auspex;
}

public String getBloodSorcery() {
	return bloodSorcery;
}

public void setBloodSorcery(String bloodSorcery) {
	this.bloodSorcery = bloodSorcery;
}

public String getCelerity() {
	return celerity;
}

public void setCelerity(String celerity) {
	this.celerity = celerity;
}

public String getDominate() {
	return dominate;
}

public void setDominate(String dominate) {
	this.dominate = dominate;
}

public String getFortitude() {
	return fortitude;
}

public void setFortitude(String fortitude) {
	this.fortitude = fortitude;
}

public String getObfuscate() {
	return obfuscate;
}

public void setObfuscate(String obfuscate) {
	this.obfuscate = obfuscate;
}

public String getOblivion() {
	return oblivion;
}

public void setOblivion(String oblivion) {
	this.oblivion = oblivion;
}

public String getPotence() {
	return potence;
}

public void setPotence(String potence) {
	this.potence = potence;
}

public String getPresence() {
	return presence;
}

public void setPresence(String presence) {
	this.presence = presence;
}

public String getProtean() {
	return protean;
}

public void setProtean(String protean) {
	this.protean = protean;
}

public String getAlchemy() {
	return alchemy;
}

public void setAlchemy(String alchemy) {
	this.alchemy = alchemy;
}

public String getHumanity() {
	return humanity;
}

public void setHumanity(String humanity) {
	this.humanity = humanity;
}

public String getMerit() {
	return merit;
}

public void setMerit(String merit) {
	this.merit = merit;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

   // standard getters and setters removed
}
