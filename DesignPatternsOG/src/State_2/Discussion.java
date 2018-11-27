package State_2;

import State_2.context.Person;

public class Discussion {

	public static void main(String[] args) {
		Person jean = new Person("Jean");
		jean.enter();
		jean.leave();
		jean.ask();
		jean.enter();
		jean.ask();
		jean.leave();
		jean.enter();
		jean.ask();
		jean.handOver();
		jean.over();
		jean.leave();
	}
}