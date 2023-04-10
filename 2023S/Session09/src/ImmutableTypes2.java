public class ImmutableTypes2 {
    public static void main(String[] args) {
        int a = 5;
        long b = 123456789012345678L;
        float f = 1.234567f;
        double d = 1.23456789012345;
        boolean t = true;
        char c = 'x'; // 16 bits
        c = 'π';
        String s = "πππππππππtesting lots of characters 2341241";
        // identity principle: every object has a unique location
        // operator == for objects "is it the same object"

        Integer i1 = new Integer(1);
        i1 = 1; // autoboxing it new Integer(1)
        Integer i2 = 1;
        System.out.println(i1 == i2); // false (not the same object)
        System.out.println(i1.equals(i2)); // true (same value)

        System.out.println("DOUBLE");
        Double d1 = 1.0;
        Double d2 = 1.0;
        System.out.println(d1 == d2); // false (not the same object)
        System.out.println(d1.equals(d2)); // true (same value)
        System.out.println(d1.equals(i1));

    }
}
