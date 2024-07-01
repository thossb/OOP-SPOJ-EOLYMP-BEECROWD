/*
 * Timothy H - 5025211098
 * Daffa Saskara -5025211249
 */
package predictive;

import java.util.*;
public class Sigs2WordsProto {
    public static void main(String[] args) {
        Set<String> ans = new HashSet<String>();
        for(String s : args){
            ans = PredictivePrototype.signaturetoWords(s);
            System.out.println(s + " : " + ans);
        }
    }
}
