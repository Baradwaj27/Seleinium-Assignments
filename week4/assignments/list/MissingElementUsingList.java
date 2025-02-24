package week4.assignments.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementUsingList {

	public static void main(String[] args) {
		
		// Declare arrays
        Integer[] array = {1, 2, 3, 4, 10, 6, 8};
        
        //Convert Array to ArrayList
		List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, array);
        
        // Sort the list in ascending order
        Collections.sort(list);
        System.out.println("My Array : "+list);
        
        // Find and print the Missing Numbers
        System.out.println("Missing Elements in arrays:");
        
        for(int i=0;i<list.size()-1;i++)
        {
        	int current = list.get(i);
        	int next = list.get(i + 1);
        	
        	 // Check for gap
        	if(current + 1 != next)
        	{
        		for(int m = current+1; m<next; m++)
        		{
        			System.out.println(m);
        		}
        	}
        }
	}
}
