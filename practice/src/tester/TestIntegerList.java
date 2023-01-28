package tester;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * Objectives in Integer list
0. Create ArrayList of integers & populate it.
1. check if element exists in the list.
2. disp index of 1st occurance of the elem
3. double values in the list --if elem val > 20
4. remove elem at the specified index
5. 
6. sorting
 */
public class TestIntegerList {

	public static void main(String[] args) 
	{
		
		ArrayList<Integer> myList = new ArrayList<>();
		System.out.println("Array Elements");
		System.out.println(myList+" ");
		for(int i:myList)
			System.out.println(i);
		int data[]={10,25,9,3,6,25,9,2,-9,14,63};
		System.out.println("Array list using Array.toString"+Arrays.toString(data));
		
		for(int i:data)
		myList.add(i);
		
		
		System.out.println("Add fn"+myList);
		myList.add(27);
		System.out.println("After adding "+myList);
		
		Integer temp=27;
		System.out.println(myList.contains(temp)?"Present":"Absent");
		
		System.out.println(myList.indexOf(6));
		System.out.println(myList.lastIndexOf(2));
		//System.out.println("data:"+data);
		
		System.out.println("List: "+myList);
		for(int i = 0;i<myList.size();i++)
		{
			if(myList.get(i)>20)
				System.out.println("Replaced "+myList.set(i, myList.get(i)*2));
			
		}
		System.out.println("After change "+myList );
//		for(int i=0;i<myList.size();i++)
//		{
//			if(myList.get(i) > 20)
//				System.out.println("Removed "+myList.remove(i));
//		}
		System.out.println("------------------------");
		System.out.println("Remove "+myList.remove(6));
		System.out.println(myList);
		Collections.sort(myList);
		System.out.println(myList);
		myList.set(3, 55);
		System.out.println("set "+myList);
		System.out.println("--------Itr-------");
		Iterator<Integer> itr=myList.iterator();
		 myList.add(99);
		 myList.remove(3);
		// System.out.println(itr.next());
		 System.out.println("****************");
		 Iterator<Integer> itr1=myList.iterator();
		 while(itr1.hasNext()) 
		 System.out.println(itr1.next());
		 //System.out.println(itr.next());
		 System.out.println(myList);
		 
		 ListIterator<Integer> listItr=myList.listIterator(myList.size());
				 while(listItr.hasPrevious())
				 {
					 
					 System.out.println(listItr.previous());
				 }
				 System.out.println("#######################");
			System.out.println(myList);
	}

}
