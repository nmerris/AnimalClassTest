
public class Sloth extends Animal {
	/**
	 * Represents a sloth animal.
	 * Sloths eat and sleep like all animals.
	 * Sloths also do a couple unique things!
	 * 
	 * @author Nathan Merris
	 */
	
	public Sloth() {
		super();
		System.out.println("A sloth is born, probably in a tree.");
	}
	
	@Override
	public String sleep() {
		return "A sloth sleeps, as they tend to do...";
	}

	@Override
	public String eat() {
		return "A sloth eats very slowly...";
	}

	public String climb(){
		return "A sloth climbs out on a branch...";
	}
	
	public String hang(){
		return "A sloth hangs from it's hooked toes...";
	}
	
	

}
