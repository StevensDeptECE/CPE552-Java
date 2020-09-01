/**
 * @author dkruger
 */
public class ClassesAndInheritance{
    private int x;   //MIDTERM
    protected int y; // MIDTERM
    int z;           // not yet
    public ClassesAndInheritance() {
        System.out.println("CReating objects");
    }
    public static void main(String[] args) {
        new ClassesAndInheritance();
    }
    public int getX() { return x; }
}

class A {
    public static void f() {
        ClassesAndInheritance c1 = new ClassesAndInheritance();
        int temp = c1.y;
        //temp = c1.x;
        temp = c1.z;
    }
    public static void main(String[] args) {
       Airplane a = new Airplane(100.0);
       PassengerPlane p = new PassengerPlane(100.0, 50);
       for (int i = 0; i < 51; i++) {
           p.serveCoffee();
           p.fly();
       }
       for (int i = 0; i < 100; i++)
           p.fly();
    }
}

class Airplane {
    private double fuelAmount;
    
    public double getFuelAmount() { return fuelAmount; }
//    public void setFuelAmount(double f) { fuelAmount = f; }
    public Airplane(double fuel) { fuelAmount = fuel; } 
    public void fly() {
        fuelAmount--;
        if (fuelAmount == 0) {
            throw new RuntimeException("OUT OF FUEL CRASH");
//            System.out.println("CRASH");
//            System.exit();
        }
        System.out.println("flap, flap");
    }
}

class PassengerPlane extends Airplane {
    private int coffee;
    public PassengerPlane(double f, int coffee) {
        super(f);
        this.coffee = coffee;
    }
    public void serveCoffee() {
       System.out.println("Serving coffee");
       coffee--;
    }
}




class Account {
    private double balance;
    
    public Account() { balance = 0; }
    public void deposit(double amt) { balance += amt; }
    public boolean withdraw(double amt) {
        if (amt < balance) {
            balance -= amt;
            return true;
        }
        return false;
    }
    public double getBalance() { return balance; }
//NOT OK!    public void setBalance(double amt) { balance = amt; }
    
}