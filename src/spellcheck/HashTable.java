package spellcheck;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTable<K,V> {

	private ArrayList<V> table;
	
	//Should this be a field?
	private StringHashCode hashCode;
	
	public HashTable() {
				
	}

	public HashTable(int initialCapacity, float loadFactor) {
		
		//Get the next prime for the capacity
		int primeCap = findNextPrime(initialCapacity);
		table = new ArrayList<V>(primeCap);
		
	}

	/**
	 * Add a value to the HashMap
	 * @param value
	 */
	public void insert(V value) {
		int hash = hashCode.giveCode(value);
		
		int count = 0;
		
		boolean valid=false;
		hash= compress(hash);
		
		//Create a copy of the Compressed hash
		int compressed = hash;
		
		while (!valid) {
			if (containsKey(hash)) {
				count++;
				hash = compressAgain(compressed, hash, count);
			} else {
				valid=true;
			}
		}
		
		/*
		 * Need to check load factor here, or somewhere
		 */
		
		table.add(hash, value);
	}
	
	/**
	 * Compresses a hash code once
	 */
	public int compress(int hash) {
		int a = 241;
		int b = 13;
		
		int compress = (a * hash) + b;
		return compress;
	}
	
	/**
	 * Hash the code a second, third, nth time (specified by j)
	 * @param k
	 * @param hash
	 * @param j
	 * @return
	 */
	public int compressAgain(int k, int hash, int j) {
		
		//Half the size and find the next prime
		int d = findNextPrime(size()/2);
		
		int compress =  ((d - (k % d)) + (j * hash)) % size(); 
		
		return compress;
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
