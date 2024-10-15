import java.util.*;
class Size4{
	public static void main( String[]args ){
		Scanner sc = new Scanner( System.in);
		System.out.println( "Enter array Size : " );
		int size = sc.nextInt();
		int[] arr = new int[size] ;
		System.out.println("Insert Elements in array:" );
		for( int i=0 ; i<arr.length ; i++ ){
			arr[i] = sc.nextInt();
		}
		int evensum=0 , oddsum = 0;
		System.out.println("Disply array elements:") ;
		for( int i=0 ; i<arr.length ; i++ ){
			if( arr[i] % 2 ==0 ){
				evensum = evensum + arr[i] ;
			}
			else{
				oddsum = oddsum + arr[i] ;
			}
		}
		System.out.println( "EvenNumberSum is :" +evensum );
		System.out.println( "OddNumberSum is :" +oddsum );
	}
}
		
		
		
		