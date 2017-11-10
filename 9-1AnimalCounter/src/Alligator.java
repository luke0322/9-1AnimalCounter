
public class Alligator extends Animal {

	
	
	
	public Alligator() { //int count
//		super(count);
//		// TODO Auto-generated constructor stub
	}

	@Override
	public String getCountString() {
		return count + " Alligator";
	}



	@Override
	public void incrementCount() {
		count ++;
		
	}

	@Override
	public void resetCount() {
		count = 0;
		
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}


}
