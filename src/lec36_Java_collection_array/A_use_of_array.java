package lec36_Java_collection_array;

public class A_use_of_array {

	public static void main(String[] args) {
		// [] called container //Array is static (fixed size)
		// Mixed data type can't be used
		
		int []a= new int [7];	// inisialiging the array.
		
		a[0] = 5;
		a[1] = 10;
		a[2] = 15;
		
		
		a[5] = 25;
		
		System.out.println("\n -----------Printing array------------------.");
		System.out.println("\n Single index value : " + a[0]);
		System.out.println("\n Single index value : " + a[3]);
		System.out.println("\n Single index value : " + a[5]);
		System.out.println("\n Single index value : " + a[4]);
		
		System.out.println("\n to find out the length of a array : " + a.length);
		System.out.println("\n to find out the length of a array : " + (a.length-1));
		System.out.println("\n to find out the length of a array : " + a[a.length-1]);
		
		
		
		
	}
}
