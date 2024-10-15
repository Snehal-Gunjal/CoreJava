import java.io.*;
class Aorder{
	static int CheckAscending(int[] arr){
		System.out.println("Check Array is in ascending order or not: ");
		for( int i=0 ; i<arr.length ; i++ ){
			for( int j=i+1 ; j<arr.length ; j++ ){
				if( arr[i] > arr[j] ){
					return 0 ;
				}
			}
		}
		return 1 ;
	}
	public static void main( String[]args)throws IOException{
			InputStreamReader isr = new InputStreamReader( System.in);
		BufferedReader br = new BufferedReader( isr );
	    System.out.println("Enter Array Size:");
		Integer size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];
		System.out.println( "Enter Elements:");
		for( int i=0 ; i<arr.length ; i++ ){
			arr[i] = Integer.parseInt( br.readLine());
		}
		int result = CheckAscending(arr);
		if( result==0 ){
			System.out.println( "The Given Array is not in a Ascending order:");
		}else{
			System.out.println( "The Given Array is in Ascending order:");
		}
	}
}
		
		
	