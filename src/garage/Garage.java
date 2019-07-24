package garage;
import java.util.Scanner;

public class Garage {

	public static void main(String[] args) {
		
//	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//	    System.out.println("Enter username");
//
//	    String userName = myObj.nextLine();  // Read user input
//	    System.out.println("Username is: " + userName);  // Output user input 
		
		Car b = new BenzineCar();
		
		System.out.println("Entrez la marque de la voiture");
		Scanner sc = new Scanner(System.in);
		b.setBrand(sc.nextLine());
		
		
		System.out.println("Entrez le model de la voiture");
		b.setModel(sc.nextLine());
		
		
		System.out.println(b + " Carburant = " + b.getCarburant());
		
		Car b2 = new GazoilCar();
		
		System.out.println("Entrez la marque de la voiture");
		b2.setBrand(sc.nextLine());
	
		
		System.out.println("Entrez le model de la voiture");
		b2.setModel(sc.nextLine());
	
		
		
		
//		Person s1 = new Seller();
		Seller s1 = new Seller();
		System.out.println("Entrez le nom du vendeur");
		s1.setName(sc.nextLine());
		
		
		System.out.println("Entrez le prenom du vendeur");
		s1.setFirstname(sc.nextLine());
		
		
		System.out.println("Entrez la ref");
		s1.setRef(sc.nextLine());
		
		
		s1.sell(b);
		
		s1.addInCarSet(b);
		s1.addInCarSet(b2);
		
		System.out.println(s1.getCarSet());
		
		sc.close();
		
		
		
		
		
	}
	
}
