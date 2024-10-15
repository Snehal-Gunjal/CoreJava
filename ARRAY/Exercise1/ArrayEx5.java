import java.io.*;
class ArrayEx5{
	public static void main( String[]args )throws IOException{
		InputStreamReader isr = new InputStreamReader( System.in);
		BufferedReader br = new BufferedReader( isr );
		System.out.println("Enter array size :");
		int size = Integer.parseInt( br.readLine() );
		char[] arr = new char[size];
		System.out.println( "Insert Elements in array:" );
		for( int i=0 ; i<arr.length ; i++ ){
			arr[i] = (char)(br.read());
		}
		System.out.println( "Display Array Elements:");
		for( int i=0 ; i<arr.length ; i++){
			System.out.println( arr[i]);
			
		}
	}
}