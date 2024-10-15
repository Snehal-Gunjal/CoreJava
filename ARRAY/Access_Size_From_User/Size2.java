import java.io.*;
import java.util.*;
class Size2{
	public static void main( String[]args ){
		Scanner sc = new Scanner( System.in );
		System.out.println("Enter a size of array:" );
		int size = sc.nextInt() ;
		int[] arr = new int[size];
		System.out.println( "Enter elements in array:");
		for( int i=0 ; i<arr.length ; i++ ){
			arr[i] = sc.nextInt();
		}
	    System.out.println( "Display Array Elements;");
		for( int i=0 ; i<arr.length ; i++ ){
			System.out.println( arr[i] ) ;
		}
	}
}
	
		