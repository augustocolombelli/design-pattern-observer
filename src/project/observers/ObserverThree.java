package project.observers;

import project.Observer;
import project.entities.Entity;

public class ObserverThree implements Observer {

	public void notify(Entity entity) {
		System.out.println("-> Third observer has been notified!");
		System.out.println("Name: " + entity.getName());
		System.out.println("Number: " + entity.getNumber());
		System.out.println("================================");
	}

}
