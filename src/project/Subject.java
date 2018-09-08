package project;

import java.util.List;

import project.entities.Entity;

public class Subject {

	private List<Observer> observers;

	public Subject(List<Observer> observers) {
		this.observers = observers;
	}

	public void process(Entity entity) {
		System.out.println("The process was executed with success!");

		notifyAllObservers(entity);
	}

	private void notifyAllObservers(Entity entity) {
		for (Observer action : observers) {
			action.notify(entity);
		}
	}
}
