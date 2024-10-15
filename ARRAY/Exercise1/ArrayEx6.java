import java.io.*;
class ArrayEx6{
	public static void main( String[]args )throws IOException{
		InputStreamReader isr = new InputStreamReader( System.in);
		BufferedReader br = new BufferedReader( isr );
		System.out.println("Enter array size :");
		int size = Integer.parseInt( br.readLine() );
		int[] arr = new int[size];
		System.out.println( "Insert Elements in array:" );
		for( int i=0 ; i<arr.length ; i++ ){
			arr[i] = Integer.parseInt( br.readLine() );
		}
		System.out.println( "Display Odd Array Elements:");
		for( int i=0 ; i<arr.length ; i++){
			if( arr[i] %4 == 0 ){
			System.out.println( arr[i]+" is divisible by 4 and its index is "+i);
			}
		}
	}
}