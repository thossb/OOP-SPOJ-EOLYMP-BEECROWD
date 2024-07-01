/*
 * Timothy H - 5025211098
 * Daffa Saskara -5025211249
 */
package predictive;

public class Word2SigProto {
    public static void main(String[] args) {
        for(String s : args){
            System.out.print(PredictivePrototype.wordtoSignature(s) + " ");
        }
    }
}
