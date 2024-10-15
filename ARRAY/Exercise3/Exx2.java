import java.io.*;
class Exx2{
	public static void main( String[]args )throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
		System.out.println("Enter size of a Array:" );
		int size = Integer.parseInt( br.readLine());
		int[] arr = new int[size] ;
		System.out.println( "Enter elements in array:");
		for( int i=0 ; i<arr.length ; i++ ){
			arr[i] = Integer.parseInt( br.readLine());
		}
		System.out.println("Enter a number to chk its occurrence:");
		int num = Integer.parseInt( br.readLine());
		for( int i=0 ; i<arr.length ; i++ ){
			if( arr[i]==num){
				System.out.println( "num "+num+" first occurrence at index "+i );
				break;
			}		
		}
		
	}
}