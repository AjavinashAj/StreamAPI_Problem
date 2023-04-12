package venketeshSir;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoProg3_map {

	public static void main(String[] args) {
		List<Integer> ob=List.of(2,1,6,4,5);
		System.out.println("========Normal List=========");
		System.out.print(ob.toString()+" ");
		System.out.println("\n========Map()=============");
		Stream<Integer> sm=ob.stream();
		sm.map((x)->x*x).forEach((y)->System.out.print(y+" "));
		System.out.println("\n=====Terminal collect()========");
		Stream<Integer>sm2=ob.stream();
		List<Integer> newList=sm2.map((x)->x*x).collect(Collectors.toList());
		newList.forEach((y)->System.out.print(y+" "));
	}

}
