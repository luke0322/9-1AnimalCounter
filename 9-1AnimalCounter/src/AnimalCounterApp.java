
public class AnimalCounterApp {
	
public static void main(String[] args) {
	System.out.println("Welcome to the Animal Counting Application.");
	Countable a = new Alligator(); //new instance of alligator class
	Sheep s = new Sheep(); //make it a sheep not a countable
	s.setName("Blackie");
	System.out.println("\nCounting alligators... ");
	count(a,3);
	
	System.out.println("\nCounting sheep... ");
	count(s,2);

	s.resetCount();
	
	System.out.println();
	Sheep dolly;
	try {
		dolly = (Sheep) s.clone(); //is a new sheep object now, points to different pt in memory
		dolly.setName("Dolly");
	}catch(CloneNotSupportedException e){
		dolly = null;
	}
	count(dolly,3);
	
	System.out.println();
	count(s,1);
}
	
public static void count(Countable c, int maxCount) {

		for (int i = 0; i < maxCount; i++) {
			System.out.println(c.getCountString());
			c.incrementCount();
		}
	}
}
