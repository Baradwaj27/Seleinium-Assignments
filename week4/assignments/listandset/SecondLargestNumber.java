package week4.assignments.listandset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args)
	{			
		// Declare arrays
        Integer[] array = {3, 2, 11, 4, 6, 7};
        
        //Convert Array to ArrayList
		List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, array);
        
        // Sort the list in ascending order
        Collections.sort(list);
        System.out.println("My Array : "+list);
        
        // Find and print the Second Largest Number        
        int num = list.get(list.size()-2);
		System.out.println("Second Largest Number in List : "+num);    
		
	}
}
