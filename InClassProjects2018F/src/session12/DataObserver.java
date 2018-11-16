package session12;

/**
 *
 * @author dkruger
 */
public class DataObserver {
    // Model <-- View Controller  MVC
}

class Model { //Data
   private ArrayList<View> dependents; 
   public void changed() {
       for (View v : dependents)
           v.update();
   }
}

class View {//Observer
    public void update();
}


