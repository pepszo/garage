package garageTest;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import garage.BenzineCar;
import garage.Car;
import garage.Garage;
import garage.GazoilCar;

public class GarageTest {

	Garage g = new Garage();
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testAddCarInGarage() throws Exception{
		
		Car bc = new BenzineCar("bmw","x5","rouge","123",10000,15000,2005,4,5); 
		Car gc = new GazoilCar("opel","corsa","noir","456",9000,12000,2010,5,5);
		Car doublonBc = new BenzineCar("mercedes","","rouge","123",10000,15000,2005,4,5);
//		boolean test = false;
		
		assertTrue(this.g.addCarInGarage(bc));
		assertTrue(this.g.addCarInGarage(gc));
		
//		try {
//			
//			thrown.expect(Exception.class);
//			thrown.expectMessage("Doublon");
//			test = this.g.addCarInGarage(doublonBc);
//			fail("doublon");
//			
//		}catch(Exception e) {
//			
//			
//			
//		}
//		assertFalse(test);

	
		
		Assertions.assertThrows(Exception.class, () -> this.g.addCarInGarage(doublonBc));
		
		
		
	}

}
