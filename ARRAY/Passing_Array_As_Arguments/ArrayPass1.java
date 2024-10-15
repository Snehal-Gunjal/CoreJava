import java.io.*;
class ArrayPass1{
	public static void main( String[]args )throws IOException{
		
		ArrayPass1 obj = new ArrayPass1() ;
		InputStreamReader isr = new InputStreamReader( System.in );
		BufferedReader br = new BufferedReader( isr );
		System.out.println( "Enter Size of an Array:" );
		int size = Integer.parseInt( br.readLine());
		int[] arr = new int[size] ;
		
		System.out.println("Insert Element in an array:" );
		for( int i=0 ; i<arr.length ; i++ ){
			arr[i] = Integer.parseInt( br.readLine());
		}
		
		System.out.println( "Display array elements:" );
		for( int i=0 ; i<arr.length ; i++ ){
			System.out.println( arr[i] );
			System.out.println( arr );
		}
		
		obj.Fun( arr );
		
		for( int i=0 ; i<arr.length ; i++ ){
			System.out.println( arr[i] );
			System.out.println( arr );	
		}	
	}
	
	void Fun( int xarr[] ){
		for( int i=0 ;i<xarr.length ; i++ ){
			xarr[i] = xarr[i] + 50 ;
			System.out.println( xarr[i] );
			System.out.println( xarr );
		}
			
	}
		
}
/*
Enter Size of an Array:
5

Insert Element in an array:
10
20
40
50
43

Display array elements:
10
[I@279f2327
20
[I@279f2327
40
[I@279f2327
50
[I@279f2327
43
[I@279f2327

60
[I@279f2327
70
[I@279f2327
90
[I@279f2327
100
[I@279f2327
93
[I@279f2327

60
[I@279f2327
70
[I@279f2327
90
[I@279f2327
100
[I@279f2327
93
[I@279f2327




Both array referring a same address of a int array class ;
Elements are changed , so no new array is created ; same array elements are changed ;
*/
		
		