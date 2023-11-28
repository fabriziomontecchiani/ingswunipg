package unittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ForceTest {

	@Test
	void testForce() {
		Force f = new Force(0, 1);
		assertEquals(0, f.getFx(), "Fx must be 0");
		assertEquals(1, f.getFy(), "Fy must be 1");
	}

	@Test
	void testSum() {
		Force f1 = new Force(1, 1);
		Force f2 = new Force(-1, 1);
		f1.sum(f2);
		assertEquals(0, f1.getFx(), "Fx must be 0");
		assertEquals(2, f1.getFy(), "Fy must be 2");
		assertThrows(NullPointerException.class, () -> f1.sum(null));
	}

	@Test
	void testMultiplyBy() {
		Force f = new Force(1, 0);
		f.multiplyBy(10);
		assertEquals(10, f.getFx(), "Fx must be 10");
		assertEquals(0, f.getFy(), "Fy must be 0");
	}

	@Test
	void testAbs() {
		Force f = new Force(0, 0);
		assertTrue(f.abs() == 0, "The absolute value must be zero.");
		f.setFx(-10);
		assertTrue(f.abs() >= 0, "The absolute value must be positive.");
	}

}
