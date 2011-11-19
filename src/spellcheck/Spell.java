package spellcheck;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
 
public class Spell {
   
	public static HashDictionary dictionary;
	
	public Spell() {   
		StringHashCode sH = new StringHashCode();
         dictionary = new HashDictionary(sH, (float)0.5);
	}
         
	/**
	 * Take a word and replace every letter with every letter from
	 * the alphabet. 
	 * @param word
	 * @return - A list of new words
	 */
	public LinkedList<String> subLetter(String word) {
		LinkedList<String> words = new LinkedList<String>();
		
		char letter = 'a';
		String newWord = "";
		
		StringBuffer buffer = new StringBuffer(word); 
		
		//Try to replace every letter in the word with another letter to make a new letter
		for (int i=0; i < word.length(); i++) {
			for (letter='a'; letter <= 'z'; letter++) {
				
				newWord = buffer.replace(i, i, String.valueOf(letter)).toString();
				
				if (dictionary.find(newWord)) {
					words.add(newWord);
				}
			}
		}
		
		return words;
	}
	
	public LinkedList<String> omitLetter(String word) {
		LinkedList<String> words = new LinkedList<String>();
		
		return words;
	}
	
    public static void main(String[] args) throws java.io.IOException, DictionaryException{
    	
    	Spell spell = new Spell();
    	

		if (args.length != 2) {
			System.out.println("Usage: spell dictionaryFile.txt inputFile.txt ");
			System.exit(0);
		}
		
		BufferedInputStream file = null;
		BufferedReader dict = null;

		try {

			dict = new BufferedReader(new FileReader(new File(args[0])));
			file = new BufferedInputStream(new FileInputStream(args[1]));
			// To read from specific files, comment the 2 lines above and
			// uncomment 2 lines below
			// dict = new BufferedInputStream(new
			// FileInputStream("C:\\dictionary.txt"));
			// file = new BufferedInputStream(new
			// FileInputStream("C:\\checkText.txt"));

		} catch (IOException e) { // catch exceptions caused by file
									// input/output errors
			System.out.println("Check your file name");
			System.exit(0);
		}
		
		String word = "";
		
		//Add the word list to the dictionary
		while (word != null) {
			word = dict.readLine().trim();
			
			dictionary.insert(word);
		}
		
		
		
        
    }
}
