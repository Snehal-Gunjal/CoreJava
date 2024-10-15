import java.io.*;
class Exx5{
	public static void main( String[]args )throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
		System.out.println("Enter size of a Array:" );
		int size = Integer.parseInt( br.readLine());
		int[] arr = new int[size] ;
		System.out.println( "Enter elements in array:");
		for( int i=0 ; i<arr.length ; i++ ){
			arr[i] = Integer.parseInt( br.readLine());
		}
		for( int i=0 ; i<arr.length ; i++ ){
			if( size < 0 || size >=5 ){
                if( arr[i] % 2 !=0 ){
                    System.out.print( " "+arr[i]+" " );
				}
			}
			else{
				if( arr[i] % 2 == 0 ){
					System.out.print( " "+arr[i]+" " );
				}
			}
			
		}
	}
}