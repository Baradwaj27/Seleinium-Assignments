package week4.assignments.listandset;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		
		//String variable
		String companyName = "google";
		
		//Create a Set to store unique characters
		Set<Character> set = new LinkedHashSet<Character>();

		 // Iterate through each character in the string and add to the set
        for (char ch : companyName.toCharArray()) {
        	set.add(ch);
        }
        
        // Print the unique characters in order
        System.out.print("Unique characters: ");
        for (char ch : set) {
            System.out.print(ch);
        }
	}

}
