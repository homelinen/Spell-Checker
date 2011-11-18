package spellcheck;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

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
			
			
			
			prime = true;
			
			//Checks if candidate is divisible by trail^2
			while (trial * trial <= candidate ) {
				if (candidate % trial == 0) {
					prime = false;
				}
				trial++;
			}	
			
			
			if (!prime) {
				//Increase candidate number as the current in non-prime
				candidate++;
			}
		}
		
		return candidate;
	}

	/**
	 * Empty the HashTable
	 */
	public void clear() {
		table = new ArrayList<V>();
		
	}

	public boolean containsKey(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsValue(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isEmpty() {
		if (size() != 0 ) {
			return true;
		} else {
			return false;
		}
	}
		
}
