package org.training.campus.list;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LinkedListTest {

	@Test
	@DisplayName("testing default constructor")
	void testLinkedList() {
		var list = new LinkedList<String>();
		assertEquals(0, list.size());
		assertArrayEquals(new Object[] {}, list.toArray());
	}

	@Test
	@DisplayName("testing varargs constructor")
	void testLinkedListEArray() {
		final var data = new String[] { "A", "B", "C", "D", "E", "F" };
		final var list = new LinkedList<>(data);
		assertEquals(data.length, list.size());
		assertArrayEquals(data, list.toArray());
	}

	@Test
	@DisplayName("testing clear method")
	void testClear() {
		final var data = new String[] { "A", "B", "C" };
		final var list = new LinkedList<>(data);
		assertEquals(data.length, list.size());
		assertArrayEquals(data, list.toArray());
		assertFalse(list.isEmpty());
		list.clear();
		assertEquals(0, list.size());
		assertArrayEquals(new Object[] {}, list.toArray());
		assertTrue(list.isEmpty());
	}
	
	@Test
	@DisplayName("testing add to tail method")
	void testAdd() {
		final var list = new LinkedList<String>();
		assertTrue(list.isEmpty());
		list.add("A");
		assertFalse(list.isEmpty());
		assertEquals(1, list.size());
		assertArrayEquals(new Object[] {"A"}, list.toArray());
		list.add("B");
		assertFalse(list.isEmpty());
		assertEquals(2, list.size());
		assertArrayEquals(new Object[] {"A","B"}, list.toArray());
		list.add("C");
		assertFalse(list.isEmpty());
		assertEquals(3, list.size());
		assertArrayEquals(new Object[] {"A","B","C"}, list.toArray());
	}

	@Test
	@DisplayName("testing contains method")
	void testContains() {
		final var list = new LinkedList<>("A", "B", "C");
		assertTrue(list.contains("A"));
		assertTrue(list.contains("B"));
		assertTrue(list.contains("C"));
		assertFalse(list.contains("X"));
		assertFalse(list.contains("Y"));
		assertFalse(list.contains("Z"));
	}

	@Test
	@DisplayName("testing indexOf method")
	void testIndexOf() {
		final var list = new LinkedList<>("A", "B", "C");
		assertEquals(0, list.indexOf("A"));
		assertEquals(1, list.indexOf("B"));
		assertEquals(2, list.indexOf("C"));
		assertEquals(-1, list.indexOf("X"));
		assertEquals(-1, list.indexOf("Y"));
		assertEquals(-1, list.indexOf("Z"));
	}

/*
	@Test
	void testIndexOfE() {
		fail("Not yet implemented");
	}

	@Test
	void testIndexOfEInt() {
		fail("Not yet implemented");
	}

	@Test
	void testLastIndexOfE() {
		fail("Not yet implemented");
	}

	@Test
	void testLastIndexOfEInt() {
		fail("Not yet implemented");
	}

	@Test
	void testAddEInt() {
		fail("Not yet implemented");
	}

	@Test
	void testRemove() {
		fail("Not yet implemented");
	}

	@Test
	void testGet() {
		fail("Not yet implemented");
	}

	@Test
	void testSet() {
		fail("Not yet implemented");
	}

	@Test
	void testSize() {
		fail("Not yet implemented");
	}

	@Test
	void testIterator() {
		fail("Not yet implemented");
	}

	@Test
	void testListIterator() {
		fail("Not yet implemented");
	}

	@Test
	void testListIteratorInt() {
		fail("Not yet implemented");
	}

*/
}
