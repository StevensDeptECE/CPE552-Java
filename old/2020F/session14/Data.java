import java.util.*;

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
	void changed() {
		for (Observer obs : observers)
			obs.update(this);
	}

}
