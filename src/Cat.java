
public class Cat extends Animal {
	
	public boolean heterochromia;
	public void makeSound() {
		System.out.println("Meow");
	}
	public void giveSize() {
		System.out.println("2-3m");
	}
	public Cat(String name, int age, int legs, boolean heterochromia) {
		this.name = name;
		this.age = age;
		this.legs = legs;
		this.heterochromia = heterochromia;
	}
	
	
}
