package org.training.campus.list;

import java.util.StringJoiner;

public abstract class AbstractList<E> implements List<E> {

	@Override
	public void add(E value) {
		add(value, size());
	}

	@Override
	public boolean isEmpty() {
		return size() <= 0;
	}

	@Override
	public boolean contains(E value) {
		return indexOf(value) >= 0;
	}

	@Override
	public int indexOf(E value) {
		return indexOf(value, 0);
	}

	@Override
	public int lastIndexOf(E value) {
		return lastIndexOf(value, size() - 1);
	}

	@Override
	public String toString() {
		final var join = new StringJoiner(",", "[", "]");
		for (E e : this) {
			join.add(e.toString());
		}
		return join.toString();
	}

	@Override
	public Object[] toArray() {
		final Object[] data = new Object[size()];
		int index = 0;
		for (E e : this) {
			data[index++] = e;
		}
		return data;
	}

}
