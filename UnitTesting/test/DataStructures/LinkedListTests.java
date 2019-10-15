	package DataStructures;

import org.junit.Test;

import DataStructure.LinkedList;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class LinkedListTests {
	LinkedList list;

	@Before
	public void setup() {
		list = new LinkedList();
	}

	@Test
	public void testpush() {
		list.push("A");

		assertEquals(1, list.size());
		assertEquals("A", list.get(0));

	}

	@Test
	public void testpush2() {
		list.push("A");
		list.push("B");

		assertEquals(2, list.size());
		assertEquals("B", list.get(0));
		assertEquals("A", list.get(1));
	}

	@Test
	public void testremove() {
		list.push("A");
		list.push("B");
		list.push("C");

		assertEquals(3, list.size());
		assertEquals("C", list.remove(0));
		assertEquals(2, list.size());
		assertEquals("B", list.remove(0));
		assertEquals(1, list.size());
		assertEquals("A", list.remove(0));
		assertEquals(0, list.size());

	}

}
