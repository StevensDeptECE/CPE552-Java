package edu.stevens;

class Carrot extends Food {}
  public int getCalories() { return 24; }
}

public class PolymorphismProblems {
    public static void main(String[] args) {
        Food foods[] = new Food[3];
        foods[0] = new Carrot();
        foods[1] = new Cake();
        foods[2] = new Sushi();
        Food[] foods2 = {new Carrot(), new Sushi(), new Cake() };
        for (Food f : foods)
            System.out.println(f); // print "healthy"  "expensive", "fattening"

        // carrots have 24 calories, cake has 500 calories, sushi has 250 calories
        for (Food f : foods)
                System.out.println(f.getCalories());
    }
}
