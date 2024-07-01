/*
 * Timothy H - 5025211098
 * Daffa Saskara -5025211249
 */
package predictive;
import java.util.*;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;

public class PredictivePrototype {
	//1
	public static String wordtoSignature(String word) {
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
	//2
	static Character[][] numberToCharMap;
	public static Set<String> signaturetoWords(String s)
	{
          Set<String> set = new HashSet<String>();
		  try{
			File myObj = new File("D:/QUIZ2/src/predictive/words.txt");
		 	Scanner myReader = new Scanner(myObj);
			
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String a = data.toLowerCase();
				if(PredictivePrototype.wordtoSignature(a).equals(s)){
					if(set.contains (a) == false)
						set.add(a);
				}
			}
			myReader.close();
			
		  }catch(FileNotFoundException e){
			  System.out.println("An error occurred.");
      		  e.printStackTrace();
		  }
          return set;
		 
	}
}
	

