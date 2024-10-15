import java.io.*;
class Ex10{
	public static void main( String[]args )throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
		System.out.println("Enter size of a Array:" );
		int size = Integer.parseInt( br.readLine());
		int[] arr = new int[size] ;
		System.out.println( "Enter elements in array:");
		for( int i=0 ; i<arr.length ; i++ ){
			arr[i] = Integer.parseInt( br.readLine());
		}
		int max = 0;
		for( int i=0 ; i<arr.length ; i++ ){
			for( int j= i+1 ; j<arr.length ; j++ ){
				if( arr[i] > arr[j] ){
					max= arr[i] ;
				}
			}
		}
        System.out.println("Maximum Number in the array is :" +max );		
	}
}