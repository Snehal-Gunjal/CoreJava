import java.io.*;
class SumOddEven{
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
		System.out.println("Find Even and Odd elements from array:");
		int Even = 0;
		int Odd = 0;
		for( int i=0 ; i<arr.length ; i++ ){
			if( arr[i] % 2 == 0 ){
				Even = Even + arr[i] ;
			}else{
				Odd = Odd + arr[i] ;
			}
		}
		System.out.println( "Odd Sum : " + Odd );
		System.out.println( "Even Sum :" + Even );
	}
}