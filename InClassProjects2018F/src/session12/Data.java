package session12;

import java.util.ArrayList;

/**
 *
 * @author dkruger
 */
public class Data {
    private ArrayList<Observer> observers;
    
    public Data() {
        observers = new ArrayList<>();
    }
    public void subscribe(Observer obs) {
        observers.add(obs);
    }
    public void unsubscribe(Observer obs) {
        observers.remove(obs);
    }
    public void changed() {
        for (Observer obs : observers)
            obs.update();
    }
    public void iChanged() {
        for (Observer obs : observers)
            obs.update(this);
    }
}
