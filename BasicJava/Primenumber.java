package BasicJava;

public class Primenumber {
  public static void main(String[] args) {
	  
	  int number= 11;
	 Boolean p = false;
	 for (int i = 2; i <=number/2; ++i) {
			 if(number % i == 0) {
				 p=true;
				 break;
			 }}
			 if(!p) {
			System.out.println(number); 
			 }else {
				System.out.println("np"); 
			 }
	 }
}


