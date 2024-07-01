/*
 * Timothy H - 5025211098
 * Daffa Saskara -5025211249
 */
package predictive;
public class Sigs2WordsList {
     public static void main(String[] args) {
			 String[] in = args;
			 DictionaryListImpl Dic = new DictionaryListImpl();
			 for(String s : in) {
				 try {
				 System.out.println(Dic.signaturetoWords(s));
				 }catch(Exception e) {
					 System.out.println("Word not found!");
				 }
			 }
	}
}