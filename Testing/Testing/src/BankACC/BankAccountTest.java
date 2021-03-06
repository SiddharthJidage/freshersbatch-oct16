package BankACC;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import javax.naming.InsufficientResourcesException;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void testwithdraw() {
		BankAccount a = new BankAccount();
		assertThrows(InsufficientResourcesException.class, ()-> a.Withdraw(2000),"An Exception may be occurred" );
	}
	
	
	@Test
	void testwithdraw1() throws InsufficientResourcesException {
		BankAccount a1 = new BankAccount();
		String expected = "wait for a momment";
		assertEquals(expected, a1.Withdraw(999));
	}
}