package spellcheck;

import java.util.ArrayList;
import java.util.Hashtable;

public class HashTable<K,V> {

	private ArrayList<V> table;
	
	public HashTable() {
				
	}

	public HashTable(int initialCapacity, float loadFactor) {
		
		//Get the next prime for the capacity
		int primeCap = findNextPrime(initialCapacity);
		table = new ArrayList<V>(primeCap);
		
	}

	public void add(V value) {
		
	}
	
	public V remove() {
		return null;
	}
	
	public boolean contains(V value) {
		return true;
	}
	
	public V getValue(K key) {
		return;
	}
	/**
	 * Increase the size of the collection and re-order elements
	 */
	public void rehash() {
		int prime = findNextPrime(size() * 2);
		
	}
	
	public int size() {
		return table.size();
	}
	
	/**
	 * Finds the next prime number after candidate
	 * 
	 * @param candidate
	 * @return
	 */
	private int findNextPrime(int candidate) {
		
		int trial = 2;
		boolean prime=false;
		
				
		while (!prime) {
			
			//Increase candidate number
			
			prime = true;
			
			while (trial * trial <= candidate ) {
				if (candidate % trial == 0) {
					prime = false;
				}
				trial++;
			}	
			
			
			if (!prime) {
				candidate++;
			}
		}
		
		return candidate;
	}
		
}
