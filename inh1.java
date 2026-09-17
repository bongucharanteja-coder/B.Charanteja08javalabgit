class animal {
	void eat() {
		System.out.println("Animal eats");
	}
}

class Dog extends animal {
	void bark() {
		System.out.println(" Bow Bow ");
	}
}
	public class inh1 {
		public static void main (String[] args){
			Dog d = new Dog();
			d.eat();
			d.bark();
		}
	}