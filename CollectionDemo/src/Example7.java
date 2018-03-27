import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example7 {
	public static void main(String[] args) 
	{

        // creating an interface ref as obj which holds the object of the class HashMap which implements the base Interface Map. 
		
		Map<String,String> obj = new HashMap<>();// <> this is called diamond expression
		//	obj.add("kush");
		obj.put("class","java");
		obj.put("place","salt lake");
		obj.put("time","morning");
		
		// when we print the map it will just print the different key-val pair possible in the map.
		System.out.println(obj);
		
		// what if we want to print a particular value of a particular key. 		
		System.out.println(obj.get("class"));
		
		//the above exmple shows that if we can traverse through the keys of a particular map then i can get all the values.
		// There is a method called KeySet within the interface Map which returns a collection of all the key values of that particular map
		// in type SET. so we can use that to access the values
		
		Set<String> keys = obj.keySet();
		
		for(String key : keys)
		{
			System.out.println(obj.get(key));
		}
		
		
	}

}
