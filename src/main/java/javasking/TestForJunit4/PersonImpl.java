package javasking.TestForJunit4;

public class PersonImpl implements Person {

	private String name;

	private int age;

	public PersonImpl(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public int getAge() {

		return this.age;
	}

	public String getName() {

		return this.name;
	}

	public String talkTo(String message) {

		return "Hello " + message;
	}

	public void walk() {

		for (int i = 1; i <= 1000; i++) {

		}
	}
}
