package learnCodeWithDurgesh;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {

	public static void main(String[] args) {
		//filter(Predicate leta hai filter means boolean value)
		//e-> true/false
		
		List<String> name=List.of("avinash","alex","dardio","kelly","parice");
		List<String>newName=name.stream().filter(e->e.startsWith("a")).collect(Collectors.toList());
		System.out.println("stream"+newName);
		System.out.println("list:"+name);
		
		//map(function,it return value)
				//in map each element operation
		
		List<Integer> number=List.of(23,4,3,9,56);
		List <Integer> dn=number.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(dn);
		//name.stream().forEach(e->{System.out.println(e);});
		name.stream().forEach(System.out::println);
		//sorted
		name.stream().sorted().forEach(e->{System.out.println("sorted:"+e);});
		List <Integer> li=new ArrayList();
		
		li.add(12);
		li.add(new Integer(23));
		li.add(new Integer(67));
		li.add(10);
		Integer it=li.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("min:"+it);
		Integer it1=li.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println("max:"+it1);
	}

}
