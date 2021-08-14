public class Gorilla extends Mammal {
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	public void throwSomething() {
		System.out.println("gorilla has thrown something");
		energyLevel -= 5;
	}
	public void eatBananas() {
		System.out.println("gorilla is eating bananas");
		energyLevel += 10;
	}
	public void climb() {
		System.out.println("gorilla has climbed a tree");
		energyLevel -= 10;
	}
}