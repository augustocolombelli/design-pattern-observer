package project;

import java.util.ArrayList;
import java.util.List;

import project.entities.Entity;
import project.observers.ObserverOne;
import project.observers.ObserverThree;
import project.observers.ObserverTwo;

public class RunSubjectProcess {

	public static void main(String[] args) {
		Entity entity = new Entity();
		entity.setName("Richard");
		entity.setNumber(18);
		
		List<Observer> observers = new ArrayList<Observer>();
		observers.add(new ObserverOne());
		observers.add(new ObserverTwo());
		observers.add(new ObserverThree());
		
		Subject operation = new Subject(observers);
		
		operation.process(entity);
	}
	
}
