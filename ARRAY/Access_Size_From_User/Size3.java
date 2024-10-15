import java.io.*;
class Size3{
	public static void main( String[]args)throws IOException{
		InputStreamReader isr = new InputStreamReader( System.in);
		BufferedReader br = new BufferedReader( isr );
		System.out.println( "Enter the size of an array:" );
		int size = Integer.parseInt( br.readLine() )  ;
		int[] arr = new int[size] ;
		System.out.println( arr.length );
		System.out.println( "Insert elements in array:" ) ;
		for( int i=0 ; i<arr.length ; i++ ){
			arr[i] = Integer.parseInt( br.readLine());
		}
		int EvenCount = 0 ;
		int OddCount = 0 ;
		System.out.println("Display Array Elments:" );
		for(int i=0 ; i<arr.length ; i++ ){
			if( arr[i] % 2 == 0 ){
				EvenCount++ ;
			}
			else
			{
				OddCount++ ;
			}
		}
		System.out.println( "Even Count is :" +EvenCount );
		System.out.println( "Odd Count is :" +OddCount );
	}
}
		
		
		
		