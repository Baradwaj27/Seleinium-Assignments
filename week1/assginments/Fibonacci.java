package week1.assginments;

public class Fibonacci {
	
	public static void main(String[] args) {
		int a = 0 ,b = 1 , c;
		for(int i=0;i<8;i++)
		{
			System.out.println(a);
			c = a+b;
			a = b;
			b = c;
		}
	}
}
