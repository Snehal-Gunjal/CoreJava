import java.io.*;
class Size6{
	public static void main( String[]args )throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
		System.out.println("Enter array size :" );
		int size = Integer.parseInt( br.readLine()) ;
		int[] arr = new int[size];
		System.out.println( "Insert Elements In array:" );
		for( int i=0 ; i<arr.length ; i++ ){
			arr[i] = Integer.parseInt( br.readLine() );
		}
		System.out.println( "Display Elements of array;" );
		for( int i=0 ; i<arr.length ; i++ ){
			System.out.println( arr[i] );
		}
		System.out.println("Array Elements divided by 2 and 4 only :" );
		for( int i=0 ; i<arr.length ; i++ ){
			if( arr[i]%2==0 && arr [i]%4==0){
				System.out.println( arr[i] );
			}
		}
	}
}
				
		

		
		
	