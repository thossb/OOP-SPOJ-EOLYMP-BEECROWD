/*
 * Timothy H - 5025211098
 * Daffa Saskara -5025211249
 */
package predictive;
import java.util.*;
import java.io.*;
public class DictionaryListImpl {
	private ArrayList<WordSigs> dictionary;

	public boolean isValidWord(String words) {
		char[] charArray = words.toCharArray();
		for (char c : charArray) {
			if (!Character.isLetter(c)) {
				return false;
			}
		}
		return true;
	}
	
	public static String wordToSignature(String word) {
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


	

	public Set<String> signaturetoWords(String s)
	{	
		Set<String> ans = new HashSet<String>();
		int index = Collections.binarySearch(dictionary, new WordSigs(s, null));
		while(s.equals(dictionary.get(index).getID())) { 
			index--;
		}
		index++;
		while(s.equals(dictionary.get(index).getID())) {
			if(!ans.contains(dictionary.get(index).getWords()))
				ans.add(dictionary.get(index).getWords());
			index++;
		}
		return ans;
	}
	
	public DictionaryListImpl() {   
		
		try{
			ArrayList<WordSigs> temp = new ArrayList<>();
		   File myObj = new File("D:/SC/words.txt");
		   Scanner myReader = new Scanner(myObj);
		   
		   while (myReader.hasNextLine()) {
			   String data = myReader.nextLine();
			   if (isValidWord(data)){
				   	String a = data.toLowerCase();
				   	String sig = wordToSignature(a);
					WordSigs obj = new WordSigs(sig, a);
					temp.add(obj);
			   }
		   }
		   Collections.sort(temp);
		   this.dictionary = temp;
		   myReader.close();
		   
		 }catch(FileNotFoundException e){
			 System.out.println("An error occurred.");
			e.printStackTrace();
	   	 }
		
	}

}
	
