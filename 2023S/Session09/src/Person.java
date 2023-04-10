import java.io.*;

public class Person {
    private String firstName, lastName;

    // should return true if 2 people have the same first and last names
    public boolean equals(Person p) {
        return firstName.equals(p.firstName) && lastName.equals(p.lastName);
    }
    public Person(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }


    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("name.dat");
            BufferedReader br = new BufferedReader(fr);

            String line1 = br.readLine();
            String[] words = line1.split("\\s+");
            for (int i = 0; i < line1.length(); i++)
                System.out.print((int) line1.charAt(i) + " ");
            System.out.println();
            for (int i = 0; i < words.length; i++)
                System.out.println(words[i]);
            Person p1 = new Person(words[0], words[1]);
            String line2 = br.readLine();
            words = line2.split("\\s+");
            Person p2 = new Person(words[0], words[1]);
            System.out.println(p1 == p2);
            System.out.println(p1.equals(p2));
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
