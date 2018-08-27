package observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {
	
	private List<Observer> observers;
	
	public Observable(){
		observers = new ArrayList<Observer>();
	}

	public void addObserver(Observer observer){
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer){
		observers.remove(observer);
	}
	
	public void updateObserver(String dato){
		for(Observer observer : observers)
			observer.update(dato);		
	}	
}
