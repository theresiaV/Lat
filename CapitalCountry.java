/* Capital of country */
import java.util.*;

class capitalCountry {
	public static void main (String[] args){
		Properties capitals = new Properties();
		Set states;
		String str;
		
		capitals.put("Italy","Rome");
		capitals.put("Luxembourg","Luxembourg");
		capitals.put("Belgium","Brussels");
		capitals.put("Denmark","Copenhagen");
		capitals.put("France","Paris");
		
		states = capitals.keySet();
		Iterator itr = states.iterator();
		while (itr.hasNext()){
			str = (String) itr.next();
			System.out.println("The capital of " + str + " is "
			+ capitals.getProperty(str) + ".");
		}
	}
}