package fr.uvsq.pglp_3.LSP;

import static org.junit.Assert.*;

import org.junit.Test;

public class RobotType1Test {

	@Test
	public void test() {
		Robot r = new RobotType1();
		assertTrue(r.getPosition().x == r.getPosition().y && r.getPosition().y == 0);
	}
	
	@Test
	public void testAvance() {
		Robot r = new RobotType1();
		r.tourne();
		r.avance();
		assertTrue(r.getPosition().x == 1 && r.getPosition().y == 0);
	}

}
