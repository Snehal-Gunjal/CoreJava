import java.io.*;
class Exx6{
	public static void main( String[]args )throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
		System.out.println("Enter size of a Array:" );
		int size = Integer.parseInt( br.readLine());
		int[] arr = new int[size] ;
		System.out.println( "Enter elements in array:");
		for( int i=0 ; i<arr.length ; i++ ){
			arr[i] = Integer.parseInt( br.readLine());
		}
		int j = 2 ;
		for( int i=0 ; i<arr.length ; i++ ){
			for( ; j<=arr[i] ; j++ ){
				if( arr[i] % j == 0 ){
					break;
				}
			}
			if(j==arr[i] ){
				System.out.print( " "+arr[i]+" ");
			}
		}
	}
}