package week4.assignments.listandset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionofStringElements {

	public static void main(String[] args) 
	{
		// Declare String arrays
        String[] array ={"HCL", "Wipro", "Aspire Systems", "CTS"};            
        //Convert Array to ArrayList
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, array);   
        // Sort the list in ascending order
        Collections.sort(list);
        //Collections.reverse(list);
        
        //Use reverse loop to iterate the collection
        System.out.println("Collection of String Elements : ");//+list);
        for (int i = list.size()-1; i>=0 ; i--) 
        {
			System.out.print(list.get(i));
			if(i!=0) {
				System.out.print(", ");
			}
		}  
	}
}
