package spellcheck;

import java.util.Hashtable;

public class HashTable extends Hashtable {

	public HashTable() {
		super();
		
	}

	public HashTable(int initialCapacity, float loadFactor) {
		super(initialCapacity, loadFactor);
		
	}

	@Override
	public void rehash() {
		int prime = findNextPrime(size() * 2);
		
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
