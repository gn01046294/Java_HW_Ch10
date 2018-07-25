package Ch10;

import java.io.Serializable;

public class Dog extends Mammal implements Serializable {
	String name;

	public Dog(String name) {
		this.name = name;
	}

	public void smile() {
		System.out.println("Dog=>" + name + ":)");
	}

	public void meao() {
		System.out.println("Dog=>" + name + "wannwann");
	}
}