package Ejercito.test;

import static org.junit.Assert.*;
import Ejercito.models.person;
import Ejercito.controllers.personController;

import org.junit.Test;

public class personaTest {
	
	
	/**
	 * 
	 * @description Test for the existence of the entity
	 */
	@Test
	public void testInstanceforModel(){
		//Arrange
		person personTest = new person();
		
		//No act, only assert 
		assertNotNull("la instancia no existe", personTest);
	}
	
	/**
	 * @description validation for a person Unsupported in the Army
	 */
	@Test
	public void testValidationUnsupported() {
		//Arrange
		person personTest = new person();
		personController  PController = new personController();
		//Act
		personTest.setName("Pepito");
		personTest.setAge(15);
		assertFalse("deberia de ser menor de edad", PController.validateArmy(personTest));
		
	}
	
	/**
	 * @description validation for a person accepted in the Army
	 */
	@Test
	public void testValidationAceptArmy() {
		//Arrange
		person personTest = new person();
		personController  PController = new personController();
		//Act
		personTest.setName("Lucas");
		personTest.setAge(19);
		//Assert
		assertTrue("deberia de ser mayor de edad", PController.validateArmy(personTest));
		
	}

}
