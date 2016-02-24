package Ejercito.controllers;
import Ejercito.models.person;
public class personController {

	/**
	 * @description Validation for a person's age
	 * @param Person
	 * @return boolean
	 */
	public boolean validateArmy( person Person){
		boolean rep = false;
		if(Person.getAge() > 18){
			rep = true;
		}
		return rep;
	}
}
