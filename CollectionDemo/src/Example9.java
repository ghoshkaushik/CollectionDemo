import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example9 {
	public static void main(String[] args) 
	{

        // creating an interface ref as obj which holds the object of the class HashMap which implements the base Interface Map. 
		
		Map<String,String> obj = new HashMap<>();// <> this is called diamond expression
		//	obj.add("kush");
		obj.put("class","java");
		obj.put("place","salt lake");
		obj.put("time","morning");
		
		// we have seen the proccess where a key Set is being used to traverse each and every key and then returning the value.
		// now we will see another method where an entire entry of the map (i.e., the combination of the K,V pair) is being accessed
		// to traverse the map.
		
		Set<Map.Entry<String,String>> values = obj.entrySet();
		
		// Entry is a nested intrface within the Map interface
		for(Map.Entry<String, String> val : values)
		{
	//		if (val.getKey().equalsIgnoreCase("class"))
		//		val.setValue("Big Data");
			System.out.println(val.getKey() + " " + val.getValue());
		}
		
	}

}
