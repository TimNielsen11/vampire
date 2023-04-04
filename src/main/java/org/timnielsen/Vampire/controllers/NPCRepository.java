package org.timnielsen.Vampire.controllers;


	import org.springframework.data.jpa.repository.JpaRepository;
	import org.timnielsen.Vampire.models.NPCSheet;





	public interface NPCRepository extends JpaRepository<NPCSheet, Long> {
	 // NPCSheet findById(String id);
	}
