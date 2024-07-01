/*
 * Timothy H - 5025211098
 * Daffa Saskara -5025211249
 */
package predictive;

public class WordSigs implements Comparable<WordSigs> {
    private String words;
    private String signature;
    public WordSigs (String sigs, String words) { 
        this.words = words;
        this.signature = sigs;
    }
	@Override
	public int compareTo(WordSigs ws) {
	if(this.signature.length() != ws.signature.length())
        return this.signature.length() - ws.signature.length();
    else return this.signature.compareTo(ws.signature);
	}
	
    public String getID(){
        return signature;
    }
    public String getWords(){
        return words;
    }
 }
