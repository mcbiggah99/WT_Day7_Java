
public class Dog extends Animal {
	
	public void makeSound() {
		System.out.println("Woof");
	}
	public void giveSize() {
		System.out.println("0.5-1.5m");
	}
	
	public Dog(String name, int age, int legs) {
		this.name = name;
		this.age = age;
		this.legs = legs;
	}
}
