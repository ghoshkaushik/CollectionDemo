import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Example2 {
	public static void main(String[] args) {

        // creating an interface ref as obj which holds the object of the class ArrayList which implements the base Interface Collection. 
		// Since no particular type has been mentioned it will hold the type object.
		
		Collection obj = new ArrayList();
	//	Collection<Integer> obj = new ArrayList();// <> this is called diamond expression
		obj.add("kush");
		obj.add(1);
		obj.add(2.3);

		// technique1 to fetch the data from a collection 
		System.out.println(" the first technique ");
		for(Object i:obj)
		{
			System.out.println(i);
		}

		//technique2 to fetch the data from a collection
		System.out.println(" the Second technique ");
		Iterator i = obj.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		//technique3 to fetch the data from a collection
		System.out.println(" the third technique ");
		
		obj.forEach(System.out::println); // an example of Steam API using lamda expression
	}

}
