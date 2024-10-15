import java.io.*;
class Exx4{
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
			int sqr = 1 ;
			if( arr[i]<0){
				sqr = arr[i] * arr[i] ;
                System.out.print( " "+sqr+" "); 				
			}else{
                 System.out.print( " "+arr[i]+" ");
			}				 
		}
	}
}