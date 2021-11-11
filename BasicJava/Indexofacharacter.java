package BasicJava;

public class Indexofacharacter {
	public static void main(String[] args) {
		
		String s = "Achal Suresh Saxena";
		char[] ch = s.toCharArray();
		
		for (int i = 0 ; i < s.length() ; i++) {
			
			if (s.charAt(i) == 'a') {
				System.out.println(i + " " + ch [i]);
			
		}
		}
	}
}

