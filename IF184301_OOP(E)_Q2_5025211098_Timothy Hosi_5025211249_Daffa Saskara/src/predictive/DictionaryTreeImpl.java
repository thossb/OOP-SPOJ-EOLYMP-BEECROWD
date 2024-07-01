
/*
 * Timothy H - 5025211098
 * Daffa Saskara -5025211249
 */
package predictive;

import java.util.*;
import java.io.*;

public class DictionaryTreeImpl implements Dictionary{

	private static Map<Integer, char[]> numToLetters = new TreeMap<Integer, char[]>();
	private static Map<Character, Integer> letterToNum = new TreeMap<Character, Integer>();

	static {

		char[] twoCharArray = { 'a', 'b', 'c' };
		numToLetters.put(2, twoCharArray);

		char[] threeCharArray = { 'd', 'e', 'f' };
		numToLetters.put(3, threeCharArray);

		char[] fourCharArray = { 'g', 'h', 'i' };
		numToLetters.put(4, fourCharArray);

		char[] fiveCharArray = { 'j', 'k', 'l' };
		numToLetters.put(5, fiveCharArray);

		char[] sixCharArray = { 'm', 'n', 'o' };
		numToLetters.put(6, sixCharArray);

		char[] sevenCharArray = { 'p', 'q', 'r', 's' };
		numToLetters.put(7, sevenCharArray);

		char[] eightCharArray = { 't', 'u', 'v' };
		numToLetters.put(8, eightCharArray);

		char[] nineCharArray = { 'w', 'x', 'y', 'z' };
		numToLetters.put(9, nineCharArray);

		// Map from a letter to a number
		letterToNum.put('a', 2);
		letterToNum.put('b', 2);
		letterToNum.put('c', 2);
		letterToNum.put('d', 3);
		letterToNum.put('e', 3);
		letterToNum.put('f', 3);
		letterToNum.put('g', 4);
		letterToNum.put('h', 4);
		letterToNum.put('i', 4);
		letterToNum.put('j', 5);
		letterToNum.put('k', 5);
		letterToNum.put('l', 5);
		letterToNum.put('m', 6);
		letterToNum.put('n', 6);
		letterToNum.put('o', 6);
		letterToNum.put('p', 7);
		letterToNum.put('q', 7);
		letterToNum.put('r', 7);
		letterToNum.put('s', 7);
		letterToNum.put('t', 8);
		letterToNum.put('u', 8);
		letterToNum.put('v', 8);
		letterToNum.put('w', 9);
		letterToNum.put('x', 9);
		letterToNum.put('y', 9);
		letterToNum.put('z', 9);
	}

	public static char[] getNumToLettersValue(int x) {
		return numToLetters.get(x);
	}

	public static String getNumToLettersValueString(int x) {
		char[] c = numToLetters.get(x);
		String returner = new String();
		for (char d : c) {
			returner = returner + String.valueOf(d);
		}
		
		return returner;
		
	}

	public static int getLetterToNumValue(char x) {
		return letterToNum.get(x);
	}

	public static Map<Integer, char[]> getNumToLetters() {
		return numToLetters;
	}

	public static Map<Character, Integer> getLetterToNum() {
		return letterToNum;
	}
	
	private DictionaryTreeImpl[] children = new DictionaryTreeImpl[8];

	private final int nodeDepth;
	
	Set<String> words = new HashSet<String>();
	
	protected DictionaryTreeImpl(int nodeDepth) {
		this.nodeDepth = nodeDepth;
	}
	
	public DictionaryTreeImpl() {

		this.nodeDepth = 0;
		try{
			   File myObj = new File("D:/SC/words.txt");
			   Scanner myReader = new Scanner(myObj);
			   while (myReader.hasNextLine()) {
				   String data = myReader.nextLine();
				   if (isValidWord(data)){
					   	String a = data.toLowerCase();
					   	insertWord(a);
				   }
			   }
			   myReader.close();
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
	}

	public String wordtoSignature(String word) {
			StringBuffer text2 = new StringBuffer();
			for (int i = 0; i < word.length(); i++) {
				if (Character.isLetter(word.charAt(i))) {
					String s=String.valueOf(Character.toUpperCase(word.charAt(i)));
					switch (s) {
					case "A":
					case "B":
					case "C":
						text2.append("2");
						break;
					case "D":
					case "E":
					case "F":
						text2.append("3");
						break;
					case "G":
					case "H":
					case "I":
						text2.append("4");
						break;
					case "J":
					case "K":
					case "L":
						text2.append("5");
						break;
					case "M":
					case "N":
					case "O":
						text2.append("6");
						break;
					case "P":
					case "Q":
					case "R":
					case "S":
						text2.append("7");
						break;
					case "T":
					case "U":
					case "V":
						text2.append("8");
						break;
					case "W":
					case "X":
					case "Y":
					case "Z":
						text2.append("9");
						break;
						default:
						text2.append(" ");
					}
					}
						else {
							text2.append(" ");
						}
					}
				String number = text2.toString();
				return number;
	}

	public Set<String> signaturetoWords(String signature) {
		try {
			return getWordsFromSig(signature);
		} catch (Exception e) {
			System.out.println("Word not in the dictionary");
			return new HashSet<String>();
		}
	}
	
	public Set<String> getWordsFromSig(String sig){
		if (sig.isEmpty()) {
			return words;
		} else {
			int childNumber = Character.getNumericValue(sig.charAt(0)) - 2;
			if (children[childNumber] != null) {
				return children[childNumber].getWordsFromSig(sig.substring(1));
			} else {
				return null;
			}

		}

	}

	public void insertWord(String word) {

		if (this.nodeDepth != 0)
			words.add(trimWord(word));

		if (word.length() > nodeDepth) {
			int charValue = getLetterToNumValue(word.charAt(nodeDepth)) - 2;
			if (children[charValue] == null) {
				children[charValue] = new DictionaryTreeImpl(nodeDepth + 1);
			}
			children[charValue].insertWord(word);
		}
	}
	private String trimWord(String word) {
		return word.substring(0, nodeDepth);
	}
	
	
	private boolean isValidWord(String word) {
		char[] charArray = word.toCharArray();
		for (char c : charArray) {
			if (!Character.isLetter(c)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		DictionaryTreeImpl dic = new DictionaryTreeImpl();
		for(String s : args) {
			dic.signaturetoWords(s);
		}
	}
}

