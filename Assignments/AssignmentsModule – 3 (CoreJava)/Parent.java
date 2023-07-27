//25.


package AssignmentModule3;


abstract class Parent {

	public abstract void message();
}


class FirstSubclass extends Parent {
	@Override
	public void message() {
		System.out.println("This is first subclass");
	}
}


class SecondSubclass extends Parent {
	@Override
	public void message() {
		System.out.println("This is second subclass");
	}
}
