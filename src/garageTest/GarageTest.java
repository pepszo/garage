package garageTest;
import garage.BenzineCar;
import garage.Car;
import garage.Garage;
import garage.GazoilCar;
import junit.framework.TestCase;

class GarageTest extends TestCase {
	
	Garage g = new Garage();
	
	
	public GarageTest(String testName) {
		super(testName);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@test
	public void testAddCarInGarage() throws Exception {
		Car bc = new BenzineCar("bmw","x5","rouge","123",10000,15000,2005,4,5); 
		Car gc = new GazoilCar("opel","corsa","noir","456",9000,12000,2010,5,5);
		Car doublonBc = new BenzineCar("mercedes","","rouge","123",10000,15000,2005,4,5);
		
		assertTrue(this.g.addCarInGarage(bc));
		assertTrue(this.g.addCarInGarage(gc));
		assertFalse(this.g.addCarInGarage(doublonBc));
		
	}
}
