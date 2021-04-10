package test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import exceptions.IdTypeNotAllowedException;
import exceptions.NoMatchNumberException;
import model.Minimarket;
import model.Person;
import model.TypeID;

class registerPersonTest {
	private Minimarket mini;
	private void setupScenary1() {
		Person p = new Person(TypeID.CC, 12345);
	}
	
	private void setupScenary2() {
		Person p = new Person(TypeID.TI, 123456);
	}
	
	private void setupScenary3() {
		Person p = new Person(TypeID.TI, 12345);
	}
	
	@Test
	public void testRegisterPerson1() {
		setupScenary1();
		try {
			assertNotNull(mini.getPeopleRegistered().get(0));
		} catch (IdTypeNotAllowedException itnae) {
			fail("Not IdTypeNotAllowedException expected");
		} catch (NoMatchNumberException nmne) {
			fail("Not NoMatchNumberException expected");
		}
	}
	
	@Test
	public void testRegisterPerson2() {
		setupScenary2();
		try {
			fail("NoMatchNumberException expected");
		} catch (IdTypeNotAllowedException itnae) {
			fail("NoMatchNumberException expected, not IdTypeNotAllowedException");
		} catch (NoMatchNumberException nmne) {
			assertNull(mini.getPeopleRegistered().get(0));
		}
	}
	
	@Test
	public void testRegisterPerson3() {
		setupScenary3();
		try {
			fail("IdTypeNotAllowedException expected");
		} catch (IdTypeNotAllowedException itnae) {
			assertNull(mini.getPeopleRegistered().get(0));
		} catch (NoMatchNumberException nmne) {
			fail("IdTypeNotAllowedException expected, not NoMatchNumberException");
		}
	}
}
