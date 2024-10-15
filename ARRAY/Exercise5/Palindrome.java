import java.io.*;
class Palindrome{
	public static void main( String[]args )throws IOException{
		InputStreamReader isr = new InputStreamReader( System.in);
		BufferedReader br = new BufferedReader( isr );
	    System.out.println("Enter Array Size:");
		Integer size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];
		System.out.println( "Enter Elements:");
		for( int i=0 ; i<arr.length ; i++ ){
			arr[i] = Integer.parseInt( br.readLine());
		}
		System.out.println("Check Array is Palindrome or not:");
		int original = 0 ;
		int reverse = 0 ;
		for( int i=0 ; i<arr.length ; i++ ){
			original =original * 10 + arr[i] ;
		}
		for( int i=arr.length-1 ; i>=0 ; i-- ){
			reverse = reverse * 10 + arr[i] ;
		}
		System.out.println(original);
		System.out.println( reverse);
		
		if( original==reverse ){
			System.out.println( "This array is a Palindrome array:");
		}else{
			System.out.println( "This array is not a Palindrome array:");
		}
	}
		
}