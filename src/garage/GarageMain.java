package garage;
import java.util.Scanner;
import java.util.HashMap;

public class GarageMain {
	
	public GarageMain(String mode) {
		
		Garage g = new Garage();
		switch(mode) {
		case "test" : g.testMode();
		break;
		case "prod" : g.prodMode();
		break;
		default : System.out.println(mode);
		System.exit(1);
		
		}
	}

	public static void main(String[] args) {
		
		if(args.length != 1) {
			
			System.out.println("Nombre d'argument invalide");
			System.exit(1);
		}
		
		else {
			
			GarageMain gm = new GarageMain(args[0]);
			
		}
		
	}
	
}
