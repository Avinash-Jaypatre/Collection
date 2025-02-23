package yes_i_can;
import java.util.*;
public class LinkedList_p1 
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(11);
		list.add(null);
		list.add('c');
		list.add("Happy");
		list.add(true);
		list.add(null);
		
		System.out.println(list);
		
		System.out.println(list.get(3));
		System.out.println("******************");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("******************");
		for(Object x :list)
		{
			System.out.println(x);
		}
		
		LinkedList list1 = new LinkedList();
		list1.addAll(list);
		
		list1.add(2, "Unhappy");
		System.out.println(list1);
		
		System.out.println(list1.contains("Unhappy"));
		System.out.println(list1.containsAll(list));
		
		System.out.println("**************");
		
		Object []arr = list.toArray(new Object[0]);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println(" ");
		
		
		LinkedList ls = new LinkedList(Arrays.asList(arr));
		System.out.println(ls);

	}

}
