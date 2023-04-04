package org.timnielsen.Vampire.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import lombok.AccessLevel;




@Entity
@Table
public class NPCSheet {
	@Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nName;
	private String nChronicle;
	private String nSire;
	private String nConcept;
	private String nMotivation;
	private String nPrimeDiscipline;
	private String nLocation;
	private String nClan;
	private String nGeneration;
	private String nStrength;
	private String nDexterity;
	private String nStamina;
	private String nCharisma;
	private String nManipulation;
	private String nComposure;
	private String nIntelligence;
	private String nWits;
	private String nResolve;
	private String nHealth;
	private String nWillpower;

	private String nMerit;
	private String nAllies;
	private String nEnemies;
	private String nSecrets;
	
	
	public NPCSheet() {}

  

   public NPCSheet(String nName, String nChronicle, String nSire, String nConcept, 
		   String nMotivation, String nPrimeDiscipline, String nLocation, String nClan, String nGeneration, 
		   String nStrength, String nDexterity, String nStamina, String nCharisma, 
		   String nManipulation, String nComposure, String nIntelligence, String nWits, String nResolve, 
		   String nHealth, String nWillpower,  String nMerit, String nAllies, String nEnemies, String nSecrets) 
   {
       
       this.nName = nName;
       this.nChronicle = nChronicle;
       this.nSire = nSire;
       this.nConcept = nConcept;
       this.nMotivation = nMotivation;
       this.nPrimeDiscipline = nPrimeDiscipline;
       this.nLocation = nLocation;
       this.nClan = nClan;
       this.nGeneration = nGeneration;
       this.nStrength = nStrength;
       this.nDexterity = nDexterity;
       this.nStamina = nStamina;
       this.nCharisma = nCharisma;
       this.nManipulation = nManipulation;
       this.nComposure = nComposure;
       this.nIntelligence = nIntelligence;
       this.nWits = nWits;
       this.nResolve = nResolve;
       this.nHealth = nHealth;
       this.nWillpower = nWillpower;

       this.nMerit = nMerit;
       this.nAllies = nAllies;
       this.nEnemies = nEnemies;
       this.nSecrets = nSecrets;
       
       
   }


   public NPCSheet(String nName, String nChronicle, String nSire, String nConcept, 
		   String nMotivation, String nPrimeDiscipline, String nLocation, String nClan, String nGeneration, 
		   String nStrength, String nDexterity, String nStamina, String nCharisma, 
		   String nManipulation, String nComposure, String nIntelligence, String nWits, String nResolve, 
		   String nHealth, String nWillpower,  String nMerit, String nAllies, String nEnemies, String nSecrets, Long id) 
   {
       
       this.nName = nName;
       this.nChronicle = nChronicle;
       this.nSire = nSire;
       this.nConcept = nConcept;
       this.nMotivation = nMotivation;
       this.nPrimeDiscipline = nPrimeDiscipline;
       this.nLocation = nLocation;
       this.nClan = nClan;
       this.nGeneration = nGeneration;
       this.nStrength = nStrength;
       this.nDexterity = nDexterity;
       this.nStamina = nStamina;
       this.nCharisma = nCharisma;
       this.nManipulation = nManipulation;
       this.nComposure = nComposure;
       this.nIntelligence = nIntelligence;
       this.nWits = nWits;
       this.nResolve = nResolve;
       this.nHealth = nHealth;
       this.nWillpower = nWillpower;

       this.nMerit = nMerit;
       this.nAllies = nAllies;
       this.nEnemies = nEnemies;
       this.nSecrets = nSecrets;
       this.id = id;
       
   }




public String getnName() {
	return nName;
}






public void setnName(String nName) {
	this.nName = nName;
}






public String getnChronicle() {
	return nChronicle;
}






public void setnChronicle(String nChronicle) {
	this.nChronicle = nChronicle;
}






public String getnSire() {
	return nSire;
}






public void setnSire(String nSire) {
	this.nSire = nSire;
}






public String getnConcept() {
	return nConcept;
}






public void setnConcept(String nConcept) {
	this.nConcept = nConcept;
}






public String getnMotivation() {
	return nMotivation;
}






public void setnMotivation(String nMotivation) {
	this.nMotivation = nMotivation;
}






public String getnPrimeDiscipline() {
	return nPrimeDiscipline;
}






public void setnPrimeDiscipline(String nPrimeDiscipline) {
	this.nPrimeDiscipline = nPrimeDiscipline;
}






public String getnLocation() {
	return nLocation;
}






public void setnLocation(String nLocation) {
	this.nLocation = nLocation;
}






public String getnClan() {
	return nClan;
}






public void setnClan(String nClan) {
	this.nClan = nClan;
}






public String getnGeneration() {
	return nGeneration;
}






public void setnGeneration(String nGeneration) {
	this.nGeneration = nGeneration;
}






public String getnStrength() {
	return nStrength;
}






public void setnStrength(String nStrength) {
	this.nStrength = nStrength;
}






public String getnDexterity() {
	return nDexterity;
}






public void setnDexterity(String nDexterity) {
	this.nDexterity = nDexterity;
}






public String getnStamina() {
	return nStamina;
}






public void setnStamina(String nStamina) {
	this.nStamina = nStamina;
}






public String getnCharisma() {
	return nCharisma;
}






public void setnCharisma(String nCharisma) {
	this.nCharisma = nCharisma;
}






public String getnManipulation() {
	return nManipulation;
}






public void setnManipulation(String nManipulation) {
	this.nManipulation = nManipulation;
}






public String getnComposure() {
	return nComposure;
}






public void setnComposure(String nComposure) {
	this.nComposure = nComposure;
}






public String getnIntelligence() {
	return nIntelligence;
}






public void setnIntelligence(String nIntelligence) {
	this.nIntelligence = nIntelligence;
}






public String getnWits() {
	return nWits;
}






public void setnWits(String nWits) {
	this.nWits = nWits;
}






public String getnResolve() {
	return nResolve;
}






public void setnResolve(String nResolve) {
	this.nResolve = nResolve;
}






public String getnHealth() {
	return nHealth;
}






public void setnHealth(String nHealth) {
	this.nHealth = nHealth;
}






public String getnWillpower() {
	return nWillpower;
}






public void setnWillpower(String nWillpower) {
	this.nWillpower = nWillpower;
}






public String getnMerit() {
	return nMerit;
}






public void setnMerit(String nMerit) {
	this.nMerit = nMerit;
}






public String getnAllies() {
	return nAllies;
}






public void setnAllies(String nAllies) {
	this.nAllies = nAllies;
}






public String getnEnemies() {
	return nEnemies;
}






public void setnEnemies(String nEnemies) {
	this.nEnemies = nEnemies;
}






public String getnSecrets() {
	return nSecrets;
}






public void setnSecrets(String nSecrets) {
	this.nSecrets = nSecrets;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}

   // standard getters and setters removed
}
