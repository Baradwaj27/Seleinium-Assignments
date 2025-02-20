package week3.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		//- Define two input strings.
		String text1 = "stops";
		String text2 = "potss";
		
		//- Check if the lengths of the two strings are equal:
		if(text1.length() != text2.length())
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
			return;
		}
		
		//- Convert both the strings to character arrays
		char[] a1 = text1.toCharArray();
		char[] a2 = text2.toCharArray();
		
		//- Sort both the character arrays
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		//- Check if the sorted arrays are equal
		if(Arrays.equals(a1,a2))
		{
			System.out.println("The given strings are Anagram");
		}
		else
		{
			System.out.println("The given strings are not an Anagram");
		}
		 
	}

}
