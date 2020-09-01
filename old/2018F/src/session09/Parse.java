package session09;
import java.util.*;

/**
 * @author dkruger
 */
public class Parse {
    public static void main(String[] args) {
        String line1 = "testing testing 123, this is a test.  Some?have multiple spaces    . Some do not. some appear twice";
        String[] words = line1.split("[ \\.\\?\\,]+");
//        for (int i = 0; i < words.length; i++)
//            System.out.println(words[i]);
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String w : words) {
            System.out.print(w + " ");
            if (wordCount.containsKey(w)) {
                wordCount.put(w, wordCount.get(w)+1);
            }
            Integer count = wordCount.get(w);
            if (count == null)
                wordCount.put(w, 1);
            else
                wordCount.put(w, count+1);
        }
        System.out.println();
        
        Set<String> keySet = wordCount.keySet();
        for (Iterator<String> i = keySet.iterator(); i.hasNext(); ) {
            String key = i.next();
            System.out.println(key + "==>" + wordCount.get(key));            
        }
        
    }
}
