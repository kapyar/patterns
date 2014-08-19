package players;

import java.util.ArrayList;
import java.util.List;

public class BoxFight implements ISubject {

	private List<IObserver> observers;

	public BoxFight() {
		observers = new ArrayList<IObserver>();
	}

	@Override
	public void attachObserver(IObserver observer) {
		observers.add(observer);

	}

	@Override
	public void detachObserver(IObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void note() {
		for (IObserver o : observers) {
			o.update(this);
		}

	}

	public void nextRound() {
		System.out.println("Next round started");

		note();
	}

}