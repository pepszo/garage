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
		sc = new Scanner(System.in);
		b.setModel(sc.nextLine());
		
		System.out.println(b + " Carburant = " + b.getCarburant());
		
//		Person s1 = new Seller();
		Seller s1 = new Seller();
		System.out.println("Entrez le nom du vendeur");
		sc = new Scanner(System.in);
		s1.setName(sc.nextLine());
		
		System.out.println("Entrez le prenom du vendeur");
		sc = new Scanner(System.in);
		s1.setFirstname(sc.nextLine());
		
		System.out.println("Entrez la ref");
		sc = new Scanner(System.in);
		s1.setRef(sc.nextLine());
		
		s1.sell(b);
		
		
		
		
	}
	
}
