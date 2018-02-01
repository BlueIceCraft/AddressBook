package ch.bbw.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import ch.bbw.addressbook.Address;

public class TestAddress {

	@Before
	public void setup() {		
	}
	
	@Test
	public void testConstructor1() {
		Address address = new Address(1, "Peter", "Muster", "000 0000 0000", "TestDorf");
		assertEquals(address.getId(), 1);
		assertTrue(address.getFirstname().equals("Peter"));
		assertTrue(address.getLastname().equals("Muster"));
		assertTrue(address.getPhonenumber().equals("000 0000 0000"));
		assertTrue(address.getVillage().equals("TestDorf"));
		assertNull(address.getRegistrationDate());
	}
	
	@Test
	public void testConstructor2() {
		Date date = new Date();
		Address address = new Address(1, "Peter", "Muster", "000 0000 0000", "TestDorf", date);
		assertEquals(address.getId(), 1);
		assertTrue(address.getFirstname().equals("Peter"));
		assertTrue(address.getLastname().equals("Muster"));
		assertTrue(address.getPhonenumber().equals("000 0000 0000"));
		assertTrue(address.getVillage().equals("TestDorf"));
		assertNotNull(address.getRegistrationDate());
		assertTrue(address.getRegistrationDate().equals(date));
	}

}
