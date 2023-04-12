package realtimeprojectType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoPro4_products {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
       //injecting by using setter method
     /*Products ob=new Products();
     ob.setPId("A111");
     ob.setpName("java");
     ob.setpPrice(234.56);
     ob.setpQty(4);
     System.out.println(ob.toString());
     */
     //injecting by using ArrayList
     ArrayList<Products> al=new ArrayList<Products>();
     al.add(new Products("A222","Mouse",123.45,12));
     al.add(new Products("A333","KBB",1200.45,4));
     al.add(new Products("A444","laptop",45000.500,45));
     al.add(new Products("A555","pendrive",356,20));
     al.add(new Products("A666","HDD",1000,16));
     al.add(new Products("A777","Ram",3451,10));
     System.out.println("=======Products from list========");
     al.forEach((y)->System.out.println(y));
     System.out.println("=======filter()-forEach()=====");
     Stream<Products> sm1=al.stream();
     sm1.filter((x)->x.getpQty()<20).forEach((y)->System.out.println(y));
     System.out.println("=======filter()-collect()-forEach()=======");
     Stream <Products> sm2=al.stream();
     List<Products> newlist=sm2.filter(x->x.getpQty()>20).collect(Collectors.toList());
     newlist.forEach((y)->System.out.println(y));
     
     System.out.println("======map()-reduce()========");
     Stream<Products> sm3=al.stream();
     double total=sm3.map((x)->x.getpQty()).reduce(0,(sum,i)->sum+i);
     System.out.println(total);
     System.out.println("========filter()=======");
     Stream<Products> sm4=al.stream();
     sm4.filter(x->x.getpName().startsWith("M")).forEach((y)->System.out.println(y));
     System.out.println("=====Sorted() -forEach()========");
     Stream<Products> sm5=al.stream();
     sm5.sorted(new SortByCode()).forEach((y)->System.out.println(y));
     

	}

}
