package week3.assignments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		//Initialize Array
		int a[] = {1,4,3,2,8,6,7};
		
		//Sort the array 
		Arrays.sort(a);
		
		//Loop through the array
		for(int i = 0;i<a.length;i++)
		{
			//•Check if the iterator variable is not equal to the array values respectively 
			if (a[i] != i + 1)
			{
				System.out.println("Missing Number: " + (i + 1));
                break;
			}
		}
	}
}
