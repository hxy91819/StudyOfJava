
public class Test {

	public static void main(String[] args) {
		Animal a = new Cat();
		System.out.println("-----------");
		Cat c = new Cat();
	}

}
class Animal{
	public Animal(){
		System.out.println("I'm an Animal!");
	}
}
class Cat extends Animal{
	public Cat(){
		System.out.println("I'm a Cat!");
	}
}