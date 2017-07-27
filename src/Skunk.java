
public class Skunk extends Animal {
	/**
	 * Represents a skunk animal.
	 * Skunks eat and sleep like all animals.
	 * Skunks also do a couple unique things!
	 * 
	 * @author Nathan Merris
	 */

	public Skunk() {
		super();
		System.out.println("A skunk is born.");
	}
	
	@Override
	public String sleep() {
		return "A skunk takes a nap...";
	}

	@Override
	public String eat() {
		return "A skunk eats some... grubs?";
	}

	public String spray(){
		return "A skunk sprays, it stinks!";
	}
	
	public String hide(){
		return "A skunk goes down into it's burrow...";
	}
	
}
