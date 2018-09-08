### Observer Design Pattern
Simple example using Observer Design Pattern.

#### How can this Design Pattern can help us?
Using this pattern, we can isolate some contexts that are not necessary for the class to know about them. In our example, the Subject class only knows the Observer interface, the RunSubjectProcess class is responsible for defining which observers need to execute after the process is executed. The Subject class is only responsible for performing the action required to notify the list of observers.

The method responsible for notify all observers:
```
	private void notifyAllObservers(Entity entity) {
		for (Observer action : observers) {
			action.notify(entity);
		}
	}
``` 
#### Class Diagram
![My image](https://github.com/augustocolombelli/design-pattern-observer/blob/master/ClassDiagram.png)


