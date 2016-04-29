package decorator;

public class Mixer {
	
	public String prepare(Beverage b){
		String result = "";
		for (String s: b.recipe()) {
			result = result + s + " ";
		}
		return result.trim();
	}

}
