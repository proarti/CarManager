package artem.carmanager;

import java.util.PrimitiveIterator;

public class CarManager {

	public static void main(String[] args) {
		
		
		
		
		/* TODO Auto-generated method stub
		 * 
		 * 
		 * 
		 * ###########  Artem, Digga als nächstes fängst du bei 3.4 An Nasledowanie ############
		 * 
		 * 
		 */
		
		
		

		PassengerCar prius = new PassengerCar("Toyota Prius", 15000, 2008, 1200, Color.GREEN);

		Bus renault = new Bus("Renault Laguna", 2000, 9700, 1600, Color.WHITE);
		
		//Car renault2 = new Car("Renault Laguna", 2000, 9700, 1600, Color.WHITE);
		
		prius.addDistance(1000);
		prius.addDistance(2000);
		prius.addDistance(20.9);
		prius.addDistance(15000);
		renault.addDistance(15000);
		
		System.out.println(prius);
		System.out.println(renault);
		
		

		
		System.out.println(prius.isReadyToService());	
		System.out.println(renault.isReadyToService());	
		
	}

}
