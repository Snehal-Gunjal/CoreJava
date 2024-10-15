import java.util.*;
class Input1{
	public static void main( String[]args ){
		Scanner sc = new Scanner( System.in );
		System.out.println("Enter Total number of rows:");
		int row = sc.nextInt() ;
		System.out.println("Enter Total number of columns:");
        int col = sc.nextInt() ;
		int[] arr[] = new int[row][col] ;
		System.out.println("Insert elements in array:");
		for( int i=0 ; i<arr.length ; i++ ){
			for( int j=0 ; j<arr[i].length ; j++ ){
				arr[i][j] = sc.nextInt() ;
			}
		}
		System.out.println( "Display Array:");
		for( int i=0 ; i<arr.length ; i++ ){
			for( int j=0 ; j<arr[i].length ; j++ ){
				System.out.print( arr[i][j]+" " );
			}
			System.out.println();
		}
	}
}
		
		
	