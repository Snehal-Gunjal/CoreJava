import java.io.*;
class ArrayEx7{
	public static void main( String[]args )throws IOException{
		InputStreamReader isr = new InputStreamReader( System.in);
		BufferedReader br = new BufferedReader( isr );
		System.out.println("Enter Total Number of Employees size :");
		int size = Integer.parseInt( br.readLine() );
		int[] arr = new int[size];
		System.out.println( "Enter their age in an array" );
		for( int i=0 ; i<arr.length ; i++ ){
			arr[i] = Integer.parseInt( br.readLine() );
		}
		System.out.println( "Display Their age:");
		for( int i=0 ; i<arr.length ; i++){
			System.out.println( arr[i]);	
		}
	}
}