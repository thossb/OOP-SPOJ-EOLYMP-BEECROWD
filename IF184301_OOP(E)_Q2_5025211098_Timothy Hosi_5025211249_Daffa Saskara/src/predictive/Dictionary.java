/*
 * Timothy H - 5025211098
 * Daffa Saskara -5025211249
 */
package predictive;
import java.util.*;

public interface Dictionary{
	public String wordtoSignature(String word);
	public Set<String> signaturetoWords(String signature);
}