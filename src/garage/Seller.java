package garage;

public class Seller extends Person {

	private String ref;
	private float comm;
	
	public Seller() {
		super();
		this.ref = "";
		this.comm = 0;
	}

	public Seller(String name, String firstname, String natnum, int birthyear, String mail, String password, String ref, float comm) {
		super(name, firstname, natnum, birthyear, mail, password);
		this.ref = ref;
		this.comm = comm;
		
	}
	
	public String getRef() {
		return ref;
	}

	public float getComm() {
		return comm;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}
	
	public void setComm(float comm) {
		this.comm = comm;
	}

	public String toString() {
		String s = super.toString() + " (" + ref + ", " + comm + ")";
		return s;
	}
	
	public void sell(Car car) {
		System.out.println("La voiture de marque " + car.getBrand() + " et de modèle " + car.getModel() + " référencée " + car.getRefCar() + " a été vendue par "+ this.toString());
		this.addInCarSet(car);
	}
	
	
}
