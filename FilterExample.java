package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample {

	public static void main(String[] args) {
		ArrayList <Integer> al=new ArrayList<>();
		al.add(10);
		al.add(40);
		al.add(23);
		al.add(27);
		al.add(57);
		System.out.println(al);
		
		List<Integer> evenNumbers =  al.stream().filter((i) -> i%2==0).collect(Collectors.toList());
	
		System.out.println("Even Numbers "+evenNumbers);
		
		List<Integer>oddNumbers =  al.stream().filter((i) -> i%2!=0).collect(Collectors.toList());
	System.out.println("odd Numbers " +oddNumbers);
	
	List<Integer>ascendingOrder =  al.stream().filter((i) -> i%2==0).sorted((i1,i2) -> i1.compareTo(i2));
	System.out.println("Ascending Order" +ascendingOrder);
	
	
	}

}
