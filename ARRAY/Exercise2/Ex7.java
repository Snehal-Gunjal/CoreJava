import java.io.*;
class Ex7{
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
			if( size %2==0 ){
				if( i % 2==0) {
					System.out.println( arr[i]);
				}
			}
			else{
				System.out.println( arr[i] );
		    }
		}
		
		
	}
}