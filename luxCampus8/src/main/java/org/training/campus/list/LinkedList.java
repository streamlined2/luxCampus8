package org.training.campus.list;

import java.util.Iterator;
import java.util.ListIterator;

public class LinkedList<E> extends AbstractList<E> implements Deque<E> {

	private static class Node<E> {
		private final E data;
		private Node<E> previous;
		private Node<E> next;

		private Node(E data) {
			this.data = data;
		}
	}

	private int size = 0;
	private Node<E> head = null;
	private Node<E> tail = null;

	public LinkedList(E... data) {
		for (E e : data) {
			add(e);
		}
	}

	@Override
	public void add(E value, int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(E value, int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return size;
	}

	private static class LinkedListIterator<E> implements ListIterator<E> {
		
		private LinkedListIterator() {
			
		}
		
		private LinkedListIterator(int startIndex) {
			
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public E next() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean hasPrevious() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public E previous() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int nextIndex() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int previousIndex() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub

		}

		@Override
		public void set(E e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void add(E e) {
			// TODO Auto-generated method stub

		}

	}

	@Override
	public Iterator<E> iterator() {
		return listIterator();
	}

	@Override
	public ListIterator<E> listIterator() {
		return new LinkedListIterator<>();
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		return new LinkedListIterator<>(index);
	}
}
