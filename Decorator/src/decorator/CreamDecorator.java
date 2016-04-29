package decorator;

import java.util.ArrayList;

public class CreamDecorator extends Beverage{
	private Beverage myBeverage;
	
	public CreamDecorator(Beverage b) {
	 myBeverage = b;
	}


	public ArrayList<String> recipe() {
		ArrayList<String> s = myBeverage.recipe();
		s.add("cream");
		return s;
	}
	

	public float price() {
		return myBeverage.price() + (float)0.20;
	}

}
