package yes_i_can;
import java.util.*;
public class Arraylist_p1 {

	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(10);
		list.add(null);
		list.add(true);
		list.add("Happy");
		list.add('c');
		list.add(2, "unhappy"); 
		System.out.println(list);
		
		ArrayList list1= new ArrayList();  
		list1.addAll(list);					//Add all list
		System.out.println(list1);
		
		list1.remove(2);
		System.out.println(list1);
		
		list1.removeAll(list1);
		System.out.println(list1);
		
		list.clear();
		System.out.println(list);
		
		
		list.add(10);
		list.add(10);
		list.add(null);
		list.add(true);
		list.add("Happy");
		list.add('c');
		list.add(2, "unhappy"); 
		System.out.println(list);
		
		System.out.println(list.get(5));
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
			System.out.println("******************");
		for(Object x :list)
		{
			System.out.println(x);
		}
		System.out.println("*******************");
		
		
		Object arr[]  =list.toArray(new Object[0]); 
		for(Object x :arr)
		{
			System.out.println(x);
		}
		
		ArrayList<Object> list3 = new ArrayList<>(Arrays.asList(arr));
		System.out.println(list3);
		
		//System.out.println(list);
		
		
		
		

	}

}
