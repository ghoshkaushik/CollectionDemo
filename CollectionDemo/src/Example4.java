import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Example4 {
	public static void main(String[] args) {

        // creating an interface ref as obj which holds the object of the class ArrayList which implements the base Interface Collection. 
		// Since no particular type has been mentioned it will hold the type object.
		
		List<Integer> obj = new ArrayList<>();// <> this is called diamond expression
//		obj.add("kush");
		obj.add(4);
		obj.add(2);
		obj.add(1);
		obj.add(2);
	//	obj.add(2.3);
		

		// technique1 to fetch the data from a collection 
		System.out.println(" the first technique ");
		//	for(Integer i:obj) // Example of Wrapper class along with the boxing and unboxing technique. 
		//In the For statement it is getting boxed while in the SOP it is getting unboxed
		for(int i:obj)
		{
			System.out.println(i);
		}
		obj.add(2,3);
		//technique2 to fetch the data from a collection
		System.out.println(" the Second technique ");
		Iterator<Integer> i = obj.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		//technique3 to fetch the data from a collection
		System.out.println(" the third technique ");
		
		Collections.sort(obj); // Collections is a class here which we  can call by passing the List type in it and it will return the sorted order
		obj.forEach(System.out::println); // an example of Steam API using lamda expression
	}

}
