package spellcheck;

import java.util.Iterator;

public class HashDictionary implements Dictionary{

	public HashDictionary(){};
	public HashDictionary(StringHashCode sH, Float sF) {};
	
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
	

	public String averNumProbes() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
