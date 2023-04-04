package org.timnielsen.Vampire;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.timnielsen.Vampire.controllers.CharacterRepository;
import org.timnielsen.Vampire.controllers.CharacterService;
import org.timnielsen.Vampire.controllers.CharacterUpdateRepository;
import org.timnielsen.Vampire.controllers.CharacterUpdateService;
import org.timnielsen.Vampire.controllers.CharacterUpdateServiceDelivery;
import org.timnielsen.Vampire.controllers.UserRepository;
import org.timnielsen.Vampire.models.CharacterSheet;

import jakarta.persistence.TypedQuery;



@SpringBootTest
public class VampireApplicationTests {
	
	  private CharacterRepository characterRepository;

	   
	   private static CharacterUpdateService characterUpdateService;
	   
	  
	   private static CharacterUpdateRepository characterUpdateRepository;
	   
	
	   private static CharacterService characterService;
	   @BeforeAll
	public static void setUp() {
		CharacterUpdateServiceDelivery characterUpdateServiceDelivery = new CharacterUpdateServiceDelivery();
	}
	@Test
	void contextLoads() {
	}

	@Test
	public void testGetCharacterbyId() {
		CharacterSheet testChar = new CharacterSheet();
		testChar.setId((long) 152);
		testChar.setName("Blue Buddha");
		CharacterSheet baseChar = characterService.findById("152");
		assertEquals(testChar.getName(), baseChar.getName());
	}
	
	//Tests the update/save feature against direct hibernate calls
	@SuppressWarnings("deprecation")
	public void testUpdateFeature() {
		CharacterSheet testChar = new CharacterSheet();
		CharacterSheet baseChar = new CharacterSheet();
		testChar.setId((long) 153);
		testChar.setName("Blue Buddha");
		 characterUpdateService.update(testChar);
		 SessionFactory factory = new   Configuration().configure().buildSessionFactory();
			Session session = factory.openSession();
			Transaction t = session.beginTransaction(); 
		      
		      
		      
		    	baseChar.setName("Blue Buddha");
		    	baseChar.setId((long) 153);
		    	session.save(baseChar); 
		    
		    	  
		        t.commit();
		        System.out.println("successfully saved");   
		        assertEquals(testChar.getName(), baseChar.getName());
		        factory.close();  
		        session.close(); 
		   }
		 

	}
	//write a save test where you call the character save after loading the model then assertequals with a JDBC manually loaded ID and username

