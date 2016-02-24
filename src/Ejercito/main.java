package Ejercito;
/**
 * 
 * @author mateoVelilla
 * @description Designing an application with
  * POO that allows me to check if a person
  * You can enter or not the army. Must
  * Enter the name and age. If age is
  * Greater than 18 then it must receive the
  * Name of the person and a welcome message
  * Or else a rejection message to
  * army.
 */
import Ejercito.models.person;
import Ejercito.controllers.personController;
import javax.swing.JOptionPane;
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		person PpersonOne = new person();
		personController PController = new personController();
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad por favor"));
		PpersonOne.setName(nombre);
		PpersonOne.setAge(edad);
		if(PController.validateArmy(PpersonOne)){
			JOptionPane.showMessageDialog(null,"Bienvenido:"+PpersonOne.getName(),"Confirmación", JOptionPane.ERROR_MESSAGE);
		}else{
			JOptionPane.showMessageDialog(null,"Usted fue rechazado al ejercito","Confirmación", JOptionPane.OK_OPTION);
		}
	}

}
