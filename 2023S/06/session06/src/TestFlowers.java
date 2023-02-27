import edu.stevens.cpe552.*;

public class TestFlowers {
    public static void main(String[] args) {
        Rose r = new Rose();
        r.smell();

        Flower f = new Rose(); // you are allowed to have the parent point to a child
        f.smell();

    //    VenusFlytrap v = new Rose(); // cannot point at sibling
   //     v.countTeeth();

// illegal to make a new Flower, it is an INTERFACE
        // not allowed to instantiate an interface
       // f = new Flower();

        /*
            Airplane
                fly()

            PassengerPlane can also fly because it inherits from Airplane
                serveCoffee()

            FighterPlane
                shoot()

         */
    }
}
