package venketeshSir;
import java.util.*;
import java.util.stream.Stream;
public class DemoProg2 {

	public static void main(String[] args) {
		System.out.println("=========Array-Stream =========");
		Integer a[] = {9,4,2,11,7};
		Stream<Integer> sm=Arrays.stream(a);
		sm.filter(x->x%2==0).forEach((y)->System.out.print(y+" "));
		
		System.out.println("========Collection-Stream =========");
		List<Integer>ob=List.of(9,4,2,11,7);
		Stream<Integer> sm2=ob.stream();
		sm2.filter(x->x%2!=0).forEach((y)->System.out.print(y+" "));
		

	}

}
