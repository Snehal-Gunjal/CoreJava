import java.io.*;
class Ex2{
	public static void main( String[]args )throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
		System.out.println("Enter size of a Array:" );
		int size = Integer.parseInt( br.readLine());
		int[] arr = new int[size] ;
		System.out.println( "Enter elements in array:");
		for( int i=0 ; i<arr.length ; i++ ){
			arr[i] = Integer.parseInt( br.readLine());
		}
		System.out.println("Display elementsdivisible by 3  Numbers:" );
		int sum = 0;
		for( int i=0 ; i<arr.length ; i++ ){
			if( arr[i] % 3 == 0 ){
				System.out.println( arr[i] );
				sum = sum + arr[i] ;
			}
		}
		System.out.println( "Sum of elements divisible by 3 is : " +sum); 
		
	}
}
			
