import java.io.*;
class CharArray{
        public static void main( String[]args )throws IOException{
                InputStreamReader isr = new  InputStreamReader( System.in) ;
                BufferedReader br = new BufferedReader( isr ) ;
                char []arr = new char[5] ;
                System.out.println( "Enter Elements in array:" ) ;
                for( int i = 0 ; i<arr.length ; i++ ){
                        arr[i] =( char ) br.read() ;
                        br.skip(1) ;
                }
				
                System.out.println( "Display Array Elements: " ) ;
                for( int i = 0 ; i<arr.length ; i++ ){
                        System.out.println( arr[i] );
                }
				
                System.out.println( "Display only Alphabet:" ) ;
                for( int i = 0 ; i<arr.length ;i++ ){
                        if( arr[i] >= 60 &&  arr[i] <=90 || arr[i] >=97  && arr[i]<=122 ){
                                System.out.println( arr[i] ) ;
                        }
                }

        }
}
