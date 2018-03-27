import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example8 {
	public static void main(String[] args) 
	{

        // creating an interface ref as obj which holds the object of the class HashMap which implements the base Interface Map. 
		
		Map<String,String> obj = new HashMap<>();// <> this is called diamond expression
		//	obj.add("kush");
		obj.put("class","java");
		obj.put("place","salt lake");
		obj.put("time","morning");
		
		Set<String> keys = obj.keySet();
		
		for(String key : keys)
			System.out.println(obj.get(key));
		
		// Now since the keys are being returned as Set we can-not have the duplicate of the key value. Any duplication the current will replace
		// the older ones
		obj.put("time","evening");
		
		Set<String> keys1 = obj.keySet();
		
		for(String key : keys1)
			System.out.println(obj.get(key));
		
	}

}
