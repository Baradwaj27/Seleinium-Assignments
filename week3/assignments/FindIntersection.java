package week3.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		
		// Declare two separate arrays, a and b, to store the given integer values
		int a[] = {3,2,11,4,6,7};
		int b[] = {1,2,8,4,9,7};
		
		System.out.println("Matching Elements : ");
		
		//Use a nested for loop to iterate over each element in both arrays
		for(int i = 0 ;i<a.length;i++)
		{
			boolean isPrinted = false;
			for(int j = 0 ;j<b.length;j++)
			{
				//Compare both the arrays using a conditional statement. 
				if(a[i]==b[i])
				{
					if(!isPrinted) 
					{
						System.out.println(a[i]);//Print Matching Elements
						isPrinted = true;
					}
				}
			}
		}
	}
}
