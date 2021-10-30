package Chapter5;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.*;

public class CheckPrimNumTest {
	
	CheckPrimeNum cpn = new CheckPrimeNum();
	

	@Test
	public void checkPrimeTrue() {
		assertTrue(cpn.checkPrime(7));
	}
	
	@Test
	public void checkPrimeFalse() {
		assertFalse(cpn.checkPrime(9));
	}
	
	@Test
	public void checkPrimeFale33() {
		assertFalse(cpn.checkPrime(33));
	}
}
