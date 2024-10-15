import java.util.*;
class Jag3{
	public static void main( String[]args ){
		int[][] arr = new int[3][] ;
		Scanner sc = new Scanner( System.in) ;
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[1];
		System.out.println("Insert elements :");
		for( int i=0 ; i<arr.length ; i++ ){
			for( int j=0 ; j<arr[i].length ; i++ ){
				arr[i][j] = sc.nextInt();
			}
		}
		for( int[] x : arr ){
			for( int y : x ){
				System.out.println( y );
			}
		}
	}
}