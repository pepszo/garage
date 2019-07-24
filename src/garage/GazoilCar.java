package garage;

public class GazoilCar extends Car{

	public GazoilCar() {
		super();
	}

	public GazoilCar(String brand, String model, String color, String refCar, double minPrice, double maxPrice,
			int dateIn, int nbDoors, int nbPlace) {
		super(brand, model, color, refCar, minPrice, maxPrice, dateIn, nbDoors, nbPlace);	
	}
	
	@Override
	public String getCarburant() {
		return "Gazoil";
	}
}
