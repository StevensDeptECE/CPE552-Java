public class Visibility {
    private int x;

    public static void main(String[] args) {
        Visibility v1 = new Visibility();
        v1.x = 5; // ok because I am inside the class
        Visibility v2 = new Visibility();
        v2.x = v1.x; // objects have no secrets from each other

    }
}
