package garage;

public abstract class Car implements Sellable {
	
	private String brand;
	private String model;
	private String color;
	private String refCar;
	private double minPrice;
	private double maxPrice;
	private int dateIn;
	private int nbDoors;
	private int nbPlace;
	
	public Car() {
		this.brand = "";
		this.model = "";
		this.color = "";
		this.refCar = "";
		this.minPrice = 0;
		this.maxPrice = 0;
		this.dateIn = 0;
		this.nbDoors = 0;
		this.nbPlace = 0;
	}
	
	public Car(String brand, String model, String color, String refCar, double minPrice, double maxPrice, int dateIn,
			int nbDoors, int nbPlace) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.refCar = refCar;
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
		this.dateIn = dateIn;
		this.nbDoors = nbDoors;
		this.nbPlace = nbPlace;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public String getRefCar() {
		return refCar;
	}

	public double getMinPrice() {
		return minPrice;
	}

	public double getMaxPrice() {
		return maxPrice;
	}

	public int getDateIn() {
		return dateIn;
	}

	public int getNbDoors() {
		return nbDoors;
	}

	public int getNbPlace() {
		return nbPlace;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setRefCar(String refCar) {
		this.refCar = refCar;
	}

	public void setMinPrice(double minPrice) {
		this.minPrice = minPrice;
	}

	public void setMaxPrice(double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public void setDateIn(int dateIn) {
		this.dateIn = dateIn;
	}

	public void setNbDoors(int nbDoors) {
		this.nbDoors = nbDoors;
	}

	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}
	
	public String getCarburant() {
		return "";
	}
	@Override
	public double getPrice() {
		return (maxPrice + minPrice)/2;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", color=" + color + ", refCar=" + refCar + ", minPrice="
				+ minPrice + ", maxPrice=" + maxPrice + ", dateIn=" + dateIn + ", nbDoors=" + nbDoors + ", nbPlace="
				+ nbPlace + "]";
	}
	
	
}
