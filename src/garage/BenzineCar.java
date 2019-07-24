package garage;

public class BenzineCar extends Car{

	public BenzineCar() {
		super();
	}

	public BenzineCar(String brand, String model, String color, String refCar, double minPrice, double maxPrice,
			int dateIn, int nbDoors, int nbPlace) {
		super(brand, model, color, refCar, minPrice, maxPrice, dateIn, nbDoors, nbPlace);
	}
	
	public String getCarburant() {
		return "Benzine";
	}
}
