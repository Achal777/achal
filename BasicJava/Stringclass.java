package BasicJava;

public class Stringclass {
	
public static void main(String[] args) {
	String name = "Achal Saxena";
	
      System.out.println(name.length());
   	System.out.println(name.charAt(8));
	System.out.println(name.indexOf("chal"));
	System.out.println(name.indexOf("x"));
	System.out.println(name.replace("A", "l"));
	System.out.println(name.replaceAll("A", "d"));
	System.out.println(name.toLowerCase());
	System.out.println(name.toUpperCase());
	System.out.println(name.startsWith("Achal"));
    System.out.println(name.endsWith("ena"));
    System.out.println(name.substring(6));
	
}
}