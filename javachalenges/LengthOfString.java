package javachalenges;

import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		
		String s = scan.nextLine();
		
		s=s.trim();
		
		int length = 0;
		
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)==' ')
			{
				break;
			}
			length++;
		}
		
		System.out.println("Length of Last Word : "+length);
		
		scan.close();
	}

}
