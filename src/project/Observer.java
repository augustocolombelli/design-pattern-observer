package project;

import project.entities.Entity;

public interface Observer {

	void notify(Entity entity);
}
