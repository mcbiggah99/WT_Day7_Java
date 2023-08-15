import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		Animal cat1 = new Cat("Skittles",14,4,true);
		
		Animal dog1 = new Dog("Yuna",8,4);
		dog1.setAge(8);
		dog1.setName("Yuna");
		
		Animal snake1 = new Snake("Juno", 2);
		
		Animal fish1 = new Fish();
		fish1.setAge(1);
		fish1.setName("Bluppie");
		
		cat1.print();
		dog1.print();
		snake1.print();
		
		List<Animal> animals = new ArrayList<>();
		animals.add(cat1);
		animals.add(dog1);
		animals.add(snake1);
		animals.add(fish1);
		
		animals.forEach(animal -> {
			animal.makeSound();
		});
		
	}

}
