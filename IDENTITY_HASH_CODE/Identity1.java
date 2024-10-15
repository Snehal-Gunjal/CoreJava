import java.io.*;
class Identity1{
	public static void main( String[]args )throws IOException{
		
		InputStreamReader isr = new InputStreamReader( System.in );
		BufferedReader br = new BufferedReader( isr ) ;
		System.out.println( "Enter Dimension of an array:" );
		int size = Integer.parseInt( br.readLine());
		int[] arr1 = new int[size] ;
		
		System.out.println("Insert Elements in an Array:" );
		for( int i=0 ; i<arr1.length ; i++ ){
			arr1[i] = Integer.parseInt( br.readLine());
		}
		System.out.println("Display Array Elements:" );
		for( int i=0 ; i<arr1.length ; i++ ){
			System.out.println( arr1[i] );
		}
		
		System.out.println( "Enter Dimension of an array:" );
		int size1 = Integer.parseInt( br.readLine());
		int[] arr2 = new int[size1] ;
		System.out.println("Insert Elements in an Array:" );
		for( int i=0 ; i<arr2.length ; i++ ){
			arr2[i] = Integer.parseInt( br.readLine());
		}
		
		System.out.println("Display Array Elements:" );
		for( int i=0 ; i<arr2.length ; i++ ){
			System.out.println( arr2[i] );
		}	
		
		System.out.println("I have to check for both array because of a same information new object is created for 2nd array or not :");
		System.out.println(arr1) ;
		System.out.println(arr2);
		System.out.println( System.identityHashCode( arr2[0] ));	
		
	}
}
		