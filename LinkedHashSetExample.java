package collectionExample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<>();  //homogenous
		hashSet.add(3);
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);  //   it wont allow duplicate values
		hashSet.add(4);

		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(3);
		treeSet.add(1);
		treeSet.add(2);
	//	treeSet.add(null); //not allow null values

		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(3);
		linkedHashSet.add(1);
		linkedHashSet.add(2);

		System.out.println("HashSet: " + hashSet); // Output: [1, 2, 3] (Order can vary)
		System.out.println("TreeSet: " + treeSet); // Output: [1, 2, 3] (Natural order)
		System.out.println("LinkedHashSet: " + linkedHashSet); // Output: [3, 1, 2] (Insertion order)
		
		Object[] array = hashSet.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
      //  Using a for-each loop to iterate and print the values
        for (int value : hashSet) {
            System.out.println(value);
        }
	}

}
