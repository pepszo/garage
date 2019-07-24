package garage;

public class CarToy implements Sellable{
	
	private double price;

	public CarToy() {
		this.price= 0;
	}

	public CarToy(double price) {
		this.price = price;
	}
	@Override
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
