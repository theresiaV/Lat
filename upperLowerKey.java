/*Uppercase & lowercase in Array*/
import java.util.Hashtable;
import java.util.Enumeration;

class upperLowerA{
	public static void main (String[] args){
		Enumeration color;
		String key;
		
		Hashtable<String,String> hashtable = new Hashtable<String,String>();
		
		hashtable.put("A", "Blue");
		hashtable.put("B", "Green");
		hashtable.put("C", "Red");
		
		color = hashtable.keys();
		while (color.hasMoreElements()){
			key = (String) color.nextElement();
			System.out.println("Array Lower case : " + key + " => " + (hashtable.get(key)).toLowerCase());
			System.out.println("Array Upper case : " + key + " => " + (hashtable.get(key)).toUpperCase());
		}
	}

}