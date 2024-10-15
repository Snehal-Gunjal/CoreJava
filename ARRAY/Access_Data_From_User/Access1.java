import java.io.*;
class Access1{
    public static void main( String[]args )throws IOException{
        InputStreamReader isr = new InputStreamReader( System.in );
        BufferedReader br = new BufferedReader( isr );
        int[] arr = new int[5] ;
		
        System.out.println( "Insert Elements in array : ");
        for( int i=0 ; i<5 ; i++ ){
        arr[i] = Integer.parseInt(br.readLine()) ;
        }
		
        System.out.println("Display array elements : ");
        for( int i = 0 ; i<5 ; i++ ){
        System.out.println( arr[i]);
        }
    }
}
