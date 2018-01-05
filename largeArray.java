/*Get the largest key in array*/
import java.util.*;

class largeKey{
	public static void main(String[] args){
		Hashtable hashtable = new Hashtable();
		Enumeration name;
		String str;
		
		hashtable.put("4","Jony");
		hashtable.put("3","Jiny");
		hashtable.put("8","Juny");
		
		name = hashtable.keys();
		
		while (name.hasMoreElements()){
			str = (String) name.nextElement();
			System.out.println(str + "=>" + hashtable.get(str));
		}
	}
}