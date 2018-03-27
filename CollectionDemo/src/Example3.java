import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Example3 {
	public static void main(String[] args) {

        // creating an interface ref as obj which holds the object of the class ArrayList which implements the base Interface Collection. 
		// Since no particular type has been mentioned it will hold the type object.
		
		Collection<Integer> obj = new ArrayList();// <> this is called diamond expression
//		obj.add("kush");
		obj.add(4);
		obj.add(2);
		obj.add(1);
	//	obj.add(2.3);
	//	obj.add(2,3);

		// technique1 to fetch the data from a collection 
		System.out.println(" the first technique ");
		
		//	for(Integer i:obj) // Example of Wrapper class along with the boxing and unboxing technique. In the For statement it is getting boxed while in the SOP it is getting unboxed
		for(int i:obj)
		{
			System.out.println(i);
		}
		
		//Here Collections is a class and sort is a method. 
		//this will throw an error because the method sort only takes a List and not a Collection.
	//	Collections.sort(obj); 
		
		//technique2 to fetch the data from a collection
		System.out.println(" the Second technique ");
		Iterator i = obj.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		
		//technique3 to fetch the data from a collection
		System.out.println(" the third technique ");
		
		obj.remove(2);
		obj.forEach(System.out::println); // an example of Steam API using lamda expression
	}

}
