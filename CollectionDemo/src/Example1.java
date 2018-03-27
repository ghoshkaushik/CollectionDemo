/*
 * this example shows that we can have an array of Object type where we can store any value but again the number of value are limited and
 * can not be changed easily. this direct us in the direction of collection.
 */
public class Example1 {

	public static void main(String[] args) {
	
	//  int a[] = new int[2];
		Object obj[] = new Object[3];
		obj[0] = 1;
		obj[1] = "kush";
		obj[2] = 5.6;
	//	obj[3] = 4;
		System.out.println(" the 1st element of the array is " + obj[0]);
		System.out.println(" the 2nd element of the array is " + obj[1]);
		int a = 9;
				
		for (Object i : obj)
		{
			System.out.println(i);
		}
		
	}

}
