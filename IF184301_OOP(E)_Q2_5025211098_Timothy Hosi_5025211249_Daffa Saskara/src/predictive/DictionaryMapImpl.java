/*
 * Timothy H - 5025211098
 * Daffa Saskara -5025211249
 */
package predictive;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class DictionaryMapImpl implements Dictionary {
	private Map<String,Set<String>> dictionary;
	public DictionaryMapImpl() {

		Map<String, Set<String>> temp = new HashMap<String, Set<String>>();
		try{
		   File myObj = new File("D:/SC/words.txt");
		   Scanner myReader = new Scanner(myObj);
		   while (myReader.hasNextLine()) {
			   String data = myReader.nextLine();
			   if (isValidWord(data)){
				   	String a = data.toLowerCase();
				   	String sig = wordtoSignature(a);
					if(temp.containsKey(sig)) {
						if(!temp.get(sig).contains(a)) {
							temp.get(sig).add(a);
						}
					}
					else {
						Set<String> temp1 = new HashSet<String>();
						temp1.add(a);
						temp.put(sig,temp1);
					}
			   }
		   }
		   this.dictionary = temp;
		   myReader.close();
		   
		 }catch(FileNotFoundException e){
			 System.out.println("An error occurred.");
			e.printStackTrace();
	   	 }
		
	}
	
	public boolean isValidWord(String words) {
		char[] charArray = words.toCharArray();
		for (char c : charArray) {
			if (!Character.isLetter(c)) {
				return false;
			}
		}
		return true;
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


	

	public Set<String> signaturetoWords(String s){
		Set<String> ans = new HashSet<String>();
		if(dictionary.containsKey(s))
			return dictionary.get(s);
		return ans;
	}
	public static void main(String[] args) {
		DictionaryMapImpl dic = new DictionaryMapImpl();
		for(String s : args) {
			System.out.println(dic.signaturetoWords(s));
		}
	}
}
