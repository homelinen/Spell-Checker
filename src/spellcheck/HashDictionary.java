package spellcheck;

import java.util.Iterator;

public class HashDictionary implements Dictionary {

	private HashTable dict;
	private int averNumOps;
	
	//Simply call a Dictionary Exception when called
	public HashDictionary() throws DictionaryException{
		throw new DictionaryException();
	};
	
	/**
	 * 
	 * @param sH - User HashCode
	 * @param sF - The Load Limit for the HashTable
	 */
	public HashDictionary(StringHashCode sH, Float sF) {
		dict = new HashTable(7, sF, sH);
		averNumOps = 0;
		
	}
	
	/**
	 * Insert a value into the dictionary, only if that value doesn't already exist
	 * 
	 * TODO: 
	 *   - Must throw an exception if a key already exists
	 */
	@Override
	public void insert(String key) throws DictionaryException {
		if (!dict.contains(key)) {
			dict.insert(key);			
		} else {
			throw new DictionaryException();
		}
		averNumOps++;
	}

	@Override
	public void remove(String key) throws DictionaryException {
		dict.remove(key);
		averNumOps++;
	}

	@Override
	public boolean find(String key) {
		
		averNumOps++;
		
		if (dict.contains(key)) {
			
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public Iterator<String> elements() {
		Iterator<String> it = dict;
		
		return it;
	}
	

	public float averNumProbes() {
		// TODO Auto-generated method stub
		float averProbes = (float)dict.getProbes() / (float)averNumOps;
		return averProbes;
	}
	
}
