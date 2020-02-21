import java.util.*;

/**
 *
 * @author dkruger
 */
public class TestLists2 {
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();
        words.add("hello");
        words.add("this");
        String[] wordTest = {"this", "is", "a", "test"};
        for (String w : wordTest) {
            words.add(w);
        }
        
        for (int i = 0; i < words.size(); i++)
            System.out.println(words.get(i));
 
        LinkedList<Integer> numbers = new LinkedList<>();
        final int n = 1000000;
        for (int i = 0; i < n; i++)
            numbers.add(i);

/*bad, slow n^2 code        
        long sum = 0;
        for (int i = 0; i < n; i++)
            sum += numbers.get(i);
        System.out.println(sum);
*/
    long sum = 0;
    for (Iterator<Integer> i = numbers.iterator(); i.hasNext();) {
        sum += i.next();
    }
    
    for (Integer i : numbers)
        sum += i;
    }
}
