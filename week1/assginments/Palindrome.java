package week1.assginments;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scanner.nextInt();
		
		int rev = 0 , sum = 0 , temp;
		
		temp = n;
		
		while(n>0)
		{
			rev = n%10;
			sum = (sum*10)+rev;
			n = n/10;
			
		}
		
		if(temp==sum)
		{
			System.out.println("Entered number is Palindrome");
		}
		else
		{
			System.out.println("Entered number is not Palindrome");
		}
		scanner.close();

	}

}
