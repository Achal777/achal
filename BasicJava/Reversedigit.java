package BasicJava;

public class Reversedigit {
	public static void main(String[] args) {

		int a = 2479120, rev = 0;

	while (a != 0)
		
		{
			int b1 = a%10;
			rev =  rev *10 + b1;
			a=a/10;
			}
		
		System.out.println("the reverse f given no is " + rev);
		
	
	}

}
