package spellcheck;

import java.util.Iterator;

public class HashDictionary implements Dictionary {

	private Hashtable<Integer, String> dict;
	
	//Simply call a Dictionary Exception when called
	public HashDictionary() throws DictionaryException{};
	
	/**
	 * 
	 * @param sH - User HashCode
	 * @param sF - The Load Limit for the HashTable
	 */
	public HashDictionary(StringHashCode sH, Float sF) {
		dict = new Hashtable<Integer, String>(7, sF);
		
	};
	
	@Override
	public void insert(String key) throws DictionaryException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(String key) throws DictionaryException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean find(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator elements() {
		// TODO Auto-generated method stub
		return null;
	}
	

	public float averNumProbes() {
		// TODO Auto-generated method stub
		return (float) 0.0;
	}
	
}
