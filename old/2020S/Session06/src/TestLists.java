import java.util.*;
/**
 *
 * @author dkruger
 */
class Person {
    private String firstName, lastName;
    public Person(String fName, String lName) {
        firstName = fName; lastName = lName;
    }
}


public class TestLists {
    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};
        
        ArrayList<Integer> list1 = new ArrayList<Integer>(101);
        list1.add(5);
        for (int i = 0; i < 100; i++)
            list1.add(i);
        
        for (int i = 0; i < list1.size(); i++)
            list1.set(i, list1.get(i) + 1);
        
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Dov", "Kruger"));
        people.add(new Person("Marlon", "Seaton"));
        for (int i = 0; i < people.size(); i++)
           System.out.println(people.get(i)); 
        for (Iterator<Person> i = people.iterator(); i.hasNext(); ) {
            Person p = i.next();
            System.out.println(p);
        }
        for (Person x : people) {
            System.out.println(x);            
        }
    }
}
