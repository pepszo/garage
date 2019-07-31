package garage;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Garage {
	
//	Declaration et instanciations des Maps et Collections		
	
	HashMap<String, Car> carInGarage = new HashMap<>();
	HashMap<String, Car> benzineInGarage = new HashMap<>();
	HashMap<String, Car> gazoilInGarage = new HashMap<>();
	
	HashMap<String, Person> personInGarage = new HashMap<>();
	HashMap<String, Person> sellerInGarage = new HashMap<>();
	HashMap<String, Person> customerInGarage = new HashMap<>();

	public boolean addCarInGarage(Car car) throws Exception {
		
		if(carInGarage.containsKey(car.getRefCar())) {
			
			throw new Exception("Doublon");
		}
			
			
		
		carInGarage.put(car.getRefCar(), car); // Ajouter la voiture car dans carInGarage
		
		return true;
				
	}
	
	
	public void menu() {
		
		int choix;
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.print("1 - Ajouter une benzineCar \n2 - Ajouter une gazoilCar \n3 - Fin du programme");
			choix = sc.nextInt();
			
			switch(choix) {
			
			case 1 : 
				addBenzineCar();
				break;
				
			case 2 :
				System.out.println("In progress");
				break;
				
			case 3 :
				System.out.println("Ciao");
				sc.close();
				break;
				
			default : System.out.println("Choix invalide");	
			}
			
		}while(choix != 3);
		
	}
	
	public void addBenzineCar() {
		
		String brand;
		String model;
		String color;
		String refCar;
		double minPrice;
		double maxPrice;
		int dateIn;
		int nbDoors;
		int nbPlace;
		
		
		System.out.println("Entrez la marque de la voiture");
		Scanner sc = new Scanner(System.in);
		brand = sc.nextLine();
		
		
		System.out.println("Entrez le model de la voiture");
		model = sc.nextLine();
		
		
		System.out.println("Entrez la couleur de la voiture");
		color = sc.nextLine();
		
		
		System.out.println("Entrez la référence de la voiture");
		refCar = sc.nextLine();
		
		
		System.out.println("Entrez le prix minimum de la voiture");
		minPrice = sc.nextDouble();
		
		
		System.out.println("Entrez le prix max de la voiture");
		maxPrice = sc.nextDouble();
		
		
		System.out.println("Entrez la date de la voiture");
		dateIn = sc.nextInt();
		
		
		System.out.println("Entrez le nombre de portes de la voiture");
		nbDoors = sc.nextInt();
		
		
		System.out.println("Entrez le nombre de places dans la voiture");
		nbPlace = sc.nextInt();
		
		sc.close();
		
		Car c = new BenzineCar(brand, model, color, refCar, minPrice, maxPrice, dateIn, nbDoors, nbPlace);
		
		
		try {
			
			addCarInGarage(c);
			
		}catch(Exception e) {
		
			System.err.println(e.getMessage());
		}
		
	}
	
	
	public void testMode() {
		
//      Declarations et instanciations des objets 
		
		Car bc = new BenzineCar("bmw","x5","rouge","123",10000,15000,2005,4,5); 
		Car gc = new GazoilCar("opel","corsa","noir","456",9000,12000,2010,5,5);
		Car doublonBc = new BenzineCar("mercedes","","rouge","123",10000,15000,2005,4,5); 
		
		Seller s = new Seller("mouloud","jean","42510-325",1986,"Mouloud@hotmail.com","cassé","1",5);
		Customer c = new Customer("ark","burak","51236-452",1990,"Ark@hotmail.com","Réparer","1");
		
		CarToy ct = new CarToy(15);

		
		
//	---------------------------------------------------------------------------------------------------
		
		
//		Manipulation des Maps et Collections pour les voitures		
	
		
		
		try {
			
			addCarInGarage(bc);
			
		}catch(Exception e) {
		
			System.err.println(e.getMessage());
			
		}
		
		try {
			
			addCarInGarage(gc);
			
		}catch(Exception e) {
		
			
			System.err.println(e.getMessage());
			
		}
		
		try {
			
			addCarInGarage(doublonBc);
			
		}catch(Exception e) {
		
			
			System.err.println(e.getMessage());
			
		}
		
//		addCarInGarage(bc);
//		addCarInGarage(gc);
//		addCarInGarage(doublonBc);
		
			
			
			
		
		System.out.println("Les voitures dans le garage : " + carInGarage.keySet()); // Affichage des voitures dans le garage
		
		
		// Parcourir une map
		
		for(Map.Entry<String, Car> carFound : carInGarage.entrySet()) {  
			
			Car cf = carFound.getValue();

			
			if(cf.getCarburant() == "Gazoil") {
				
				if(!gazoilInGarage.containsKey(cf.getRefCar()))gazoilInGarage.put(cf.getRefCar(), cf);
				
			}
			
			else {
				
				if(!benzineInGarage.containsKey(cf.getRefCar()))benzineInGarage.put(cf.getRefCar(), cf);
				
			}
		
			
		}
		
		System.out.println("Les benzines dans le garage : " + benzineInGarage.keySet()); // Affichage des gazoils dans le garage
		
		System.out.println("Les gazoils dans le garage : " + gazoilInGarage.keySet()); // Affichage des benzines dans le garage
		

//  -----------------------------------------------------------------------------------------------------------------------------------------		
		
		
//		Vente d'une voiture
		
		
		if(!sellerInGarage.containsKey(s.getNatnum()))	sellerInGarage.put(s.getNatnum(), s);
		if(!customerInGarage.containsKey(c.getNatnum()))  customerInGarage.put(c.getNatnum(), c);
		
		s.sell(gc);
		c.buy(bc);
		
		System.out.println(s.getCarSet());
		System.out.println(c.getCarSet());
	}
	
	public void prodMode() {
		
		System.out.println("En construction");
		
		
		menu();
		
	}

}
