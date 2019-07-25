package garage;

public class Customer extends Person {

	private String ref;
	
	public Customer() {
		super();
		this.ref = "";
	}

	public Customer(String name, String firstname, String natnum, int birthyear, String mail, String password, String ref) {
		super(name, firstname, natnum, birthyear, mail, password);
		this.ref = ref;
	}
	
	public String getRef() {
		return ref;
	}
	
	public void setRef(String ref) {
		this.ref = ref;
	}

	public String toString() {
		String s = super.toString() + " (" + ref + ")";
		return s;
		
	}
	
	public void buy(Car car) {
		System.out.println("La voiture de marque " + car.getBrand() + " et de mod�le " + car.getModel() + " r�f�renc�e " + car.getRefCar() + " a �t� achet�e par "+ this.toString());
		this.addInCarSet(car);
	}
	

}
