package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//comparator is an interface
public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Eve");
		names.add("Charlie");

//		// Create a custom comparator to sort by length
		Comparator<String> lengthComparator = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		};
		// Sort the list using the custom comparator
		Collections.sort(names, lengthComparator);
		
		
		// Print the sorted list
		for (String name : names) {
			System.out.println(name);
		}
	}

	}


