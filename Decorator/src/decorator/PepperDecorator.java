package decorator;

import java.util.ArrayList;

public class PepperDecorator extends Beverage{
	private Beverage myBeverage;
	
	public PepperDecorator(Beverage b){
		myBeverage = b;
		
	}
	
	public ArrayList<String> recipe() {
		ArrayList<String> s = myBeverage.recipe();
		s.add("pepper");
		return s;
	}

	
	public float price() {
		return myBeverage.price() + (float)0.10;
	}

}


