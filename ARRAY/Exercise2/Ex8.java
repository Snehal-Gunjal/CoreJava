import java.io.*;
class Ex8{
	public static void main( String[]args )throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
		System.out.println("Enter size of a Array:" );
		int size = Integer.parseInt( br.readLine());
		int[] arr = new int[size] ;
		System.out.println( "Enter elements in array:");
		for( int i=0 ; i<arr.length ; i++ ){
			arr[i] = Integer.parseInt( br.readLine());
		}
		for( int i=0 ; i<arr.length ; i++ ){
		   if( arr[i] > 5 && arr[i] < 9 ){
			   System.out.println( arr[i]+" Is Greater than 5 but less than 9 " );
		}
	
		}
	}
}