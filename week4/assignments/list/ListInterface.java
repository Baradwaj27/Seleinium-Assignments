package week4.assignments.list;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		
		// Declare arrays
        Integer[] array1 = {3, 2, 11, 4, 6, 7};
        Integer[] array2 = {1, 2, 8, 4, 9, 7};
		
        //Convert Array to ArrayList
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		 // Add array elements to lists
        for (Integer num : array1) {
            list1.add(num);
        }
        for (Integer num : array2) {
            list2.add(num);
        }

        // Find and print the intersection
        System.out.println("Intersection of arrays:");
        for (Integer num : list1) {
            if (list2.contains(num)) {
                System.out.println(num);
            }
        }
	}

}
