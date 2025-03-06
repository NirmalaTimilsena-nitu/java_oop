package polymorphism;

 class AnimalSounds {

	public void sound() {

		System.out.println("The animals make different sounds when asked to speak. For example:");
	}
}

 class Cow extends AnimalSounds {

	public void sound() {
		System.out.println("The cow says: moh moh");
	}
}

 class Cat extends AnimalSounds {
	public void sound() {
		System.out.println("The cat says: mew mew");
	}

}

 class Dog extends AnimalSounds {

	public void sound() {

		System.out.println("The dog says: bow wow");

	}

}

public class Animal {

	public static void main(String[] args) {

		AnimalSounds animal = new AnimalSounds();

		AnimalSounds cow = new Cow();

		AnimalSounds cat = new Cat();

		AnimalSounds dog = new Dog();

		animal.sound();// obj call

		cow.sound();

		cat.sound();

		dog.sound();

	}

}