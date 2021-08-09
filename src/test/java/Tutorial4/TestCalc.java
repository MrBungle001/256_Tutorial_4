package Tutorial4;

import static org.junit.jupiter.api.Assertions.*;

class TestCalc {

	@org.junit.jupiter.api.Test
	void testAdd() {
		Calc cal = new Calc();
		
		assertTrue(cal.add(5, 5) == 10);
	}

	@org.junit.jupiter.api.Test
	void testSubtract() {
		Calc cal = new Calc();
		
		assertTrue(cal.subtract(10, 5) == 5);
	} 
}
