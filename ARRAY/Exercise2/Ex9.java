import java.io.*;
class Ex9{
	public static void main( String[]args )throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
		System.out.println("Enter size of a Array:" );
		int size = Integer.parseInt( br.readLine());
		int[] arr = new int[size] ;
		System.out.println( "Enter elements in array:");
		for( int i=0 ; i<arr.length ; i++ ){
			arr[i] = Integer.parseInt( br.readLine());
		}
		int min = 0;
		for( int i=0 ; i<arr.length ; i++ ){
			for( int j= i+1 ; j<arr.length ; j++ ){
				if( arr[i] < arr[j] ){
					min = arr[i] ;
				}
			}
		}
        System.out.println("Minimum Number in the array is :" +min );		
	}
}