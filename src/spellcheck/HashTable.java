package spellcheck;

import java.util.ArrayList;
import java.util.Hashtable;

public class HashTable<K,V> {

	private ArrayList<V> table;
	
	public HashTable() {
				
	}

	public HashTable(int initialCapacity, float loadFactor) {
		
		table = new ArrayList<V>(initialCapacity);
		
	}

	public void add() {
		
	}
	
	public V remove() {
		return null;
	}
	
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
