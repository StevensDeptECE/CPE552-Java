package session12;

/**
 *
 * @author dkruger
 */
public abstract class Observer {
    public abstract void update();
    public abstract void update(Data d);
    public void subscribe(Data d) {
       d.subscribe(this); 
    }
}
