package week3.assignments;

public class OddIndexToUppercase 
{
	public static void main(String[] args) 
	{
		String test = "changeme";
		
		System.out.print("Odd Index to Uppercase : ");
		//- Convert the given String to a character array
		char[] a = test.toCharArray();
				
		//- Implement a loop to iterate through each character of the String (from end to start).
		for(int i = 0;i<a.length;i++)
		{
			//Find out the Odd Index
			if(i%2 != 0)
			{
				//change character of Odd Index to Uppercase
				a[i] = Character.toUpperCase(a[i]);
			} 
			System.out.print(a[i]);
		}
	}
}
