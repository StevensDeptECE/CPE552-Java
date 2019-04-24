package sessionobjectorientedbasics;

import java.util.ArrayList;

/**
 * @author dkruger
 */
public class Person implements Cloneable {
    private String name;
    private int ssn;
    
    @Override
    public boolean equals(Object obj) {
        Person p = (Person)obj;
        return name.equals(p.name) && ssn == p.ssn;
    }
    public Person clone() {
        try {
          return (Person)super.clone();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public void setName(String n) { name = n; }
    public String toString() { return name + " id=" + ssn; }
    public Person(String n, int  ssn) { name = n; this.ssn = ssn; }
    
    public static void main(String[] args) throws Exception {
        Person p1 = new Person ("Song", 123);
        Person p2 = new Person("Song", 123);
        System.out.println(p1.equals(p2));
        Person p3 = p1;
        p3.setName("Fred");
        System.out.println(p1);
        Person p4 = (Person)p1.clone();
        p1.setName("Song");
        System.out.println(p4);
        
        // deep vs. shallow copy
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Test1", 123));
        
        ArrayList<Person> people2 = (ArrayList<Person>)people.clone();
        Person first = people.get(0);
        first.setName("Whoa!");
        
        for (Person p : people2) {
            System.out.println(p);
        }
        
        // let's do a deep copy ourselves
        ArrayList<Person> people3 = new ArrayList<>();
        for (Person p : people) {
          people3.add(p.clone());
        }
    }
}
