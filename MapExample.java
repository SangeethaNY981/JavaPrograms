package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {
		ArrayList <Integer> marks=new ArrayList<>();
		marks.add(78);
		marks.add(67);
		marks.add(83);
		marks.add(100);
		marks.add(95);
		System.out.println("Student marks "+marks);
		
		List<Integer> studentmarks =  marks.stream().map((i) -> i+5).collect(Collectors.toList());
		System.out.println("updated marks" + studentmarks);
		
		long count =marks.stream().count();
		System.out.println(count);
		
		List<Integer> L =  marks.stream().sorted((i1,i2) -> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(L);

		List<Integer> L1 =  marks.stream().sorted().collect(Collectors.toList());
		System.out.println(L1);
		
		List<Integer> L2 =  marks.stream().sorted((i1,i2) -> i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(L2);
		
		int minValue =  marks.stream().min((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println("Min value in the list" + minValue );

		int maxValue =  marks.stream().max((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println("Max value in the list" + maxValue );



	}

}
