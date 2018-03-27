import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Example6 {
	public static void main(String[] args) {

        // creating an interface ref as obj which holds the object of the class ArrayList which implements the base Interface Collection. 
		// the TreeSet class will store the values as per the sorted order
		
		Set<Integer> obj = new TreeSet<>();// <> this is called diamond expression
		//	obj.add("kush");
		obj.add(4);
		obj.add(2);
		obj.add(1);
		obj.add(5);
		obj.add(2);
		//	obj.add(2.3);
		
		// In this display all teh details will come randomly depending on the hashmap and no duplication is allowed. Hence though 2 is added
		// twice in the output it came only once.
		// technique1 to fetch the data from a collection 
		System.out.println(" the first technique ");
		//	for(Integer i:obj) // Example of Wrapper class along with the boxing and unboxing technique. In the For statement it is getting boxed while in the SOP it is getting unboxed
		for(int i:obj)
		{
			System.out.println(i);
		}
		//obj.add(2,3);
		//technique2 to fetch the data from a collection
		System.out.println(" the Second technique ");
		Iterator<Integer> i = obj.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		//technique3 to fetch the data from a collection
		System.out.println(" the third technique ");
		
		//Collections.sort(obj); // Collections is a class here which we  can call by passing the List type in it and it will return the sorted order
		obj.forEach(System.out::println); // an example of Steam API using lamda expression
	}

}
