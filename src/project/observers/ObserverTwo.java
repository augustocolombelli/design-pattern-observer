package project.observers;

import project.Observer;
import project.entities.Entity;

public class ObserverTwo implements Observer {

	public void notify(Entity entity) {
		System.out.println("-> Second observer has been notified!");
		System.out.println("Name: " + entity.getName());
		System.out.println("Number: " + entity.getNumber());
		System.out.println("================================");
	}

}
