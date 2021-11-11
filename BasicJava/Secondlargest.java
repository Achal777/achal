package BasicJava;

public class Secondlargest {
public static void main(String[] args) {
	
	int [] array = {99,57,27,69,47,22,77};
	int temp;
	for (int i = 0; i < array.length; i++) {
		for (int j= i+1; j < array.length; j++) {
			if (array[i] > array [j]) {
			temp = array[j];
			array [j] = array [i];
			array [i] = temp;
	
		System.out.println(array [array.length-2]);
		
		}
	}
	}
}
}