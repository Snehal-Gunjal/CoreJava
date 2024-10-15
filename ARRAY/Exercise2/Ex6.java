import java.io.*;
class Ex6{
	public static void main( String[]args )throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
		System.out.println("Enter size of a Array:" );
		int size = Integer.parseInt( br.readLine());
		int[] arr = new int[size] ;
		System.out.println( "Enter elements in array:");
		for( int i=0 ; i<arr.length ; i++ ){
			arr[i] = Integer.parseInt( br.readLine());
		}
		int product = 1;
		for( int i=0 ; i<arr.length ; i++ ){
			if( i % 2 != 0 ){
				product = product * arr[i] ;
				
			}
		}
		System.out.println( "product of odd indexed elements is :" +product); 
		
	}
}