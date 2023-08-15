
public class Snake extends Animal {
	
	public String morph;
	public void makeSound() {
		System.out.println("Hiss");
	}
	public void giveSize() {
		System.out.println("0.5m-6m");
	}

	public Snake(String name, int age) {
		this.name = name;
		this.age = age;
		this.legs = 0;
	}


}
