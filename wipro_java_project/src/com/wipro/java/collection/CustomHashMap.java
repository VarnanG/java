package com.wipro.java.collection;

import java.util.Objects;

class CustomHashMap<K, V> {
	private static class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;

		public Entry(K key, V value) {
			this.key = key;
			this.value = value;
			this.next = null;
		}
	}

	private static final int SIZE = 16;
	private Entry<K, V>[] table;

	public CustomHashMap() {
		table = new Entry[SIZE];
	}

	private int getHash(K key) {
		return Math.abs(Objects.hashCode(key) % SIZE);
	}

	public void put(K key, V value) {
		int index = getHash(key);
		Entry<K, V> newEntry = new Entry<>(key, value);

		if (table[index] == null) {
			table[index] = newEntry;
		} else {
			Entry<K, V> current = table[index];
			Entry<K, V> prev = null;
			while (current != null) {
				if (current.key.equals(key)) {
					current.value = value;
					return;
				}
				prev = current;
				current = current.next;
			}
			prev.next = newEntry;
		}
	}

	public V get(K key) {
		int index = getHash(key);
		Entry<K, V> current = table[index];
		while (current != null) {
			if (current.key.equals(key)) {
				return current.value;
			}
			current = current.next;
		}
		return null;
	}

	public void remove(K key) {
		int index = getHash(key);
		Entry<K, V> current = table[index];
		Entry<K, V> prev = null;

		while (current != null) {
			if (current.key.equals(key)) {
				if (prev == null) {
					table[index] = current.next;
				} else {
					prev.next = current.next;
				}
				return;
			}
			prev = current;
			current = current.next;
		}
	}

	public static void main(String[] args) {
		CustomHashMap<String, Integer> map = new CustomHashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);

		System.out.println("Value for key 'one': " + map.get("one"));
		System.out.println("Value for key 'two': " + map.get("two"));

		map.remove("two");
		System.out.println("Value for key 'two' after removal: " + map.get("two"));
	}
}