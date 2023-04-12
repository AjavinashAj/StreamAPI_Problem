package learnCodeWithDurgesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

	public static void main(String[] args) {
		//create a list and filter all even number from list
		//List.of() this method return Immutable Collection of object means once you insert object in list you will not insert again
		//Method-1 to create list
		List<Integer>list1=List.of(2,4,50,21,22,67);
		System.out.println(list1);
		//Method-2
		List<Integer>list2=new ArrayList<>();
		list2.add(12);
		list2.add(34);
		list2.add(23);
		list2.add(78);
		System.out.println(list2);
		//Method-3
		//as.List() ese bhi change nhi kar shakte
		List<Integer>list3=Arrays.asList(23,567,12,677,24);
		System.out.println(list3);
		//from list1,collect all even element and store on another list
		//Without Stream(boiler plate code)
		List<Integer>listEven=new ArrayList<>();
		for(Integer i:list1)
		{
			if(i%2==0)
			{
				listEven.add(i);
			}
		}
		System.out.println(list1);
		System.out.println(listEven);
		// using Stream API
		Stream<Integer> stream=list1.stream();
		//filte mai preadicate pass karna hai by using lambda expression
		List<Integer> newlist=stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newlist);
		//in a single line
		List<Integer> newlist1=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newlist1);
		//collect from list1 >10
		List<Integer> lg=list1.stream().filter(i->i>10).collect(Collectors.toList());
		System.out.println("greater than 10:"+lg);
		
	}

}
