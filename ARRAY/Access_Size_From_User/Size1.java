import java.io.*;
class Size1{
	public static void main( String[]args )throws IOException{
		InputStreamReader isr = new InputStreamReader( System.in);
		BufferedReader br = new BufferedReader( isr );
		
		System.out.println( "Enter Size of an array :" ) ;
		int size = Integer.parseInt( br.readLine()) ;
        int[] arr = new int[ size ] ;
        System.out.println( "Size : " +size );
		
        System.out.println( "arr.length:" +arr.length ) ;
		
		System.out.println( "Enter the elements in array:" );
        for( int i=0 ; i<arr.length ; i++ ){
            arr[i] = Integer.parseInt( br.readLine() );
        }
		
		System.out.println("Display array elements:");
		for( int i=0 ; i<arr.length ; i++ ){
			System.out.println( arr[i] );
		}
	}
}
        		
		
			