
public class AnimalApp {
	/**
	 * This program instantiates a generic Animal object.
	 * Then, 4 different Animals are instantiated.
	 * Each animal does a number of interesting things that are displayed.
	 * 
	 * @author Dave Wolf
	 * @author Nathan Merris
	 */

	public static void main(String[] args) {

		Animal a = new Animal();
		print(a.eat());
		print(a.sleep());

		Cat c = new Cat();
		print(c.eat());
		print(c.sleep());
		print(c.purr());
		
		Bird b = new Bird();
		print(b.eat());
		print(b.sleep());
		print(b.fly());
		
		// sloth and skunk added by Nathan Merris
		Sloth sloth = new Sloth();
		print(sloth.eat());
		print(sloth.sleep());
		print(sloth.climb());
		print(sloth.hang());
		
		Skunk skunk = new Skunk();
		print(skunk.eat());
		print(skunk.sleep());
		print(skunk.spray());
		print(skunk.hide());

	}
	
	// print to the screen
	private static void print(String s){
		System.out.println(s);
	}
}
