import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	private GradeBook g1;
	private GradeBook g2;

	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
	    g2 = new GradeBook(5);
	    
	    g1.addScore(17);
	    g1.addScore(24);
	    
	    g2.addScore(89);
	    g2.addScore(10);
	    
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("17.0 24.0 "));
	    assertTrue(g2.toString().equals("89.0 10.0 "));
	}

	@Test
	void testSum() {
		assertEquals(41,g1.sum(),.0001);

	    assertEquals(99,g2.sum(),.0001);
	}

	@Test
	void testMinimum() {
		assertEquals(17,g1.minimum(),.001);

	    assertEquals(10,g2.minimum(),.001);
	}

	@Test
	void testFinalScore() {
		assertEquals(24, g1.finalScore());
		assertEquals(89, g2.finalScore());
	}

	
	
}
