import java.io.*;
class IfElse4{
        public static void main( String[]args )throws IOException{
                InputStreamReader isr = new InputStreamReader( System.in) ;
                BufferedReader br = new BufferedReader( isr ) ;
                System.out.println( "Enter any number ") ;
                char x  = ( char )  br.read() ;
                for( int i = 65 ; i<=90 ; i++ ){
                        if( x == i ) {
                                System.out.println( x + " is a UPPERCASE Letter " ) ;
                                break;
                        }
                }
                for( int i = 97 ; i<=122 ; i++ ){
                        if( x == i ){
                                System.out.println( x + " is a LOWERCASE Letter" );
                                break;
                        }
                }
        }
}