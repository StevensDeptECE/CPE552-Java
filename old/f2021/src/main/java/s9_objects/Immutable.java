package s9_objects;

/**
 *
 * @author dkruger
 */
public class Immutable {
    public static void main(String[] args) {
        //Immutable = cannot change
        String s = "abc";
        s = s + "x";
        s = s.substring(1,2);
        
        StringBuilder b = new StringBuilder(10000);
        for (int i = 0; i < 10000; i++)
            b.append(i);
        String s = b.toString();
        
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < 10000; i++)
            a.add(i); // a.add(new Integer(i))
        
        for (int i = 0; i < a.size(); i++)
            a.set(i, a.get(i)+1); // new Integer(a.get(i).intVal+1)
        
        
    }
}
