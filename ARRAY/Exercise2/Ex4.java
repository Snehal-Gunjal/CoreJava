import java.io.*;
class Ex4{
	public static void main( String[]args )throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
		System.out.println("Enter size of a Array:" );
		int size = Integer.parseInt( br.readLine());
		int[] arr = new int[size] ;
		System.out.println( "Enter elements in array:");
		for( int i=0 ; i<arr.length ; i++ ){
			arr[i] = Integer.parseInt( br.readLine());
		}
		System.out.println( "Enter the elements which do you want to search in array:");
		int num = Integer.parseInt( br.readLine());
		System.out.println("Display elements of array :" );
		for( int i=0 ; i<arr.length ; i++ ){
			if( arr[i]==num){
				System.out.println(arr[i] +" Found at Index " + i );
			}
		}
		
	}
}
			
