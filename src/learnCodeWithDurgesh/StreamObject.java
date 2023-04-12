package learnCodeWithDurgesh;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {
		//Stream API -collection process
		//we are able to apply operation on collection/array/group of object
		// 1. create empty(blank)stream
		Stream<Object>emptyStream=Stream.empty();
		emptyStream.forEach(e->{System.out.println(e);});//here you will not get any output because of empty stream
		//2. array,object,collection
		String []name= {"Durges","uttam","avi"};
		Stream<String>stream=Stream.of(name);
		stream.forEach(e->{System.out.println(e);});
		//3. Buillder pattern used to create stream object
		Stream<Object>streamBuilder=Stream.builder().build();
		//4.stream object create using array
		IntStream stream1=Arrays.stream(new int[] {2,4,5,6,7});
		stream1.forEach(e->{System.out.println(e);});
		//Stream Important method
		
		

	}

}
