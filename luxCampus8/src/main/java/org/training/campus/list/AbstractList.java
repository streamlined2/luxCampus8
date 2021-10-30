package org.training.campus.list;

import java.util.Objects;
import java.util.StringJoiner;

public abstract class AbstractList<E> implements List<E> {

	@Override
	public void add(E value) {
		add(value, size());
	}

	@Override
	public void clear() {
		final var i = iterator();
		while (i.hasNext()) {
			i.next();
			i.remove();
		}
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
	public int indexOf(E value, int startIndex) {
		final var i = listIterator();
		for (int k = 0; i.hasNext() && k < startIndex; k++) {
			i.next();
		}
		for (int k = startIndex; i.hasNext(); k++) {
			if (Objects.equals(i.next(), value)) {
				return k;
			}
		}
		return -1;
	}

	@Override
	public int lastIndexOf(E value) {
		return lastIndexOf(value, size() - 1);
	}

	@Override
	public int lastIndexOf(E value, int startIndex) {
		final var i = listIterator(size());
		for (int k = size(); i.hasPrevious() && k > startIndex; k--) {
			i.previous();
		}
		for (int k = startIndex; i.hasPrevious(); k--) {
			if (Objects.equals(i.previous(), value)) {
				return k;
			}
		}
		return -1;
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
		final var data = new Object[size()];
		int index = 0;
		for (E e : this) {
			data[index++] = e;
		}
		return data;
	}

}
