import java.io.*;
class Ex1{
	public static void main( String[]args )throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
		System.out.println("Enter size of a Array:" );
		int size = Integer.parseInt( br.readLine());
		int[] arr = new int[size] ;
		System.out.println( "Enter elements in array:");
		for( int i=0 ; i<arr.length ; i++ ){
			arr[i] = Integer.parseInt( br.readLine());
		}
		System.out.println("Display Even Numbers:" );
		int count = 0;
		for( int i=0 ; i<arr.length ; i++ ){
			if( arr[i] % 2 == 0 ){
				System.out.println( arr[i] );
				count++ ;
			}
		}
		System.out.println( "Count of even number is: " +count); 
		
	}
}