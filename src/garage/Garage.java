package garage;
import java.util.Scanner;
import java.util.HashMap;

public class Garage {

	public static void main(String[] args) {
		
//	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//	    System.out.println("Enter username");
//
//	    String userName = myObj.nextLine();  // Read user input
//	    System.out.println("Username is: " + userName);  // Output user input 
//	---------------------------------------------------------------------------------	
//		Car b = new BenzineCar();
//		
//		System.out.println("Entrez la marque de la voiture");
//		Scanner sc = new Scanner(System.in);
//		b.setBrand(sc.nextLine());
//		
//		
//		System.out.println("Entrez le model de la voiture");
//		b.setModel(sc.nextLine());
//		
//		
//		System.out.println(b + " Carburant = " + b.getCarburant());
//		
//		Car b2 = new GazoilCar();
//		
//		System.out.println("Entrez la marque de la voiture");
//		b2.setBrand(sc.nextLine());
//	
//		
//		System.out.println("Entrez le model de la voiture");
//		b2.setModel(sc.nextLine());
//	
//		
////		Person s1 = new Seller();
//		Seller s1 = new Seller();
//		System.out.println("Entrez le nom du vendeur");
//		s1.setName(sc.nextLine());
//		
//		
//		System.out.println("Entrez le prenom du vendeur");
//		s1.setFirstname(sc.nextLine());
//		
//		
//		System.out.println("Entrez la ref");
//		s1.setRef(sc.nextLine());
//		
//		
//		s1.sell(b);
//		
//		s1.addInCarSet(b);
//		s1.addInCarSet(b2);
//		
//		System.out.println(s1.getCarSet());
//		
//		sc.close();
//	---------------------------------------------------------------------------------	
		
		
		HashMap<String, Car> carInGarage = new HashMap<>();
		
		Seller s1 = new Seller("mouloud","jean","42510-325",1986,"tg@hotmail.com","cassé","1",5);
		
		Car a = new BenzineCar("bmw","x5","rouge","123455",10000,15000,2005,4,5);
		Car b = new BenzineCar("opel","astra","rouge","123",10000,15000,2005,4,5);
	

		carInGarage.put(b.getRefCar(), b);
		
		if(!carInGarage.containsKey(a.getRefCar())){
			
			carInGarage.put(a.getRefCar(), a);
			
		}
		
		if(carInGarage.containsKey(a.getRefCar())) {
			
			s1.addInCarSet(a);
		}
		
		s1.addInCarSet(b); // On peut ajouter 2 objets si un seul champs est different -> il faut overrider equals et HashCode
		
		System.out.println(s1.getCarSet());
		
		
//		if(carInGarage.get(a.getRefCar()) == null) {
//			
//			carInGarage.put(a.getRefCar(), a);
//			
//		}

		System.out.println(carInGarage.keySet());
		System.out.println(carInGarage.values());
		System.out.println(carInGarage.size());
		
	}
	
}
