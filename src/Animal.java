
public abstract class Animal {

	protected String name;
	protected int age;
	protected int legs;
	
	public String getName() {
		return name;
	}
	
	public Animal() {
		this.name = null;
		this.age = 0;
		this.legs = 0;
	}
	
	public Animal(String name, int age, int legs, String sound) {
		this.name = name;
		this.age = age;
		this.legs = legs;
	}
	
	public abstract void makeSound();
	
	public abstract void giveSize();

	public void setName(String name) {
		this.name = name;
	}
	
	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void print() {
		System.out.println(name+" is a "+age+"-year-old " + getClass().getName() + ".");
	}
	
	
	
}
