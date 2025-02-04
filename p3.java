package Assigment1;
import java.util.*;
public class p3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Object> list = new ArrayList<>();
		list.add(11);
		list.add(12);
		list.add(12);
		list.add(14);
		
		System.out.println("Enter Any index: ");
		int RetElement=sc.nextInt();
		System.out.println("Retrive Element..!! : "+list.get(RetElement));
		System.out.println(list);
		
		System.out.println("Enter Update Element index num :");
		int UpElement=sc.nextInt();
		System.out.println("Update Element..!! : "+list.set(UpElement,32));
		System.out.println(list);
		
		System.out.println("Enter Remove element value  :");
		int revalueElement=sc.nextInt();
		System.out.println("Remove Element :"+list.remove(Integer.valueOf(revalueElement)));
		System.out.println(list);
		
		System.out.println(" Enter Remove index :");
		int reElement = sc.nextInt();
		System.out.println("Remove Element :"+list.remove(reElement));
		System.out.println(list);
		
		System.out.println(" Enter Display Element:");
		System.out.println("Display Element Specific :"+list.contains(12));
		System.out.println();
		sc.close();
	}

}
