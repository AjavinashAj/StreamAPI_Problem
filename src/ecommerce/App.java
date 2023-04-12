package ecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		ArrayList<Product> li=new ArrayList<Product>();
		li.add(new Product(100,"milk","amul",29.50,5));
		li.add(new Product(101,"curd","amul",31,3));
		li.add(new Product(102,"Ghee","amul",245.50,6));
		li.add(new Product(102,"Paneer","ananda",65,2));
		Stream<Product> sm=li.stream();
		
		sm.forEach((y)->System.out.println(y));
		
	}

}
