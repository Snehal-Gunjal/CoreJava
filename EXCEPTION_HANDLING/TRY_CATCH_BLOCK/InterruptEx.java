
import java.io.*;
class InterruptEx{
        public static void main( String[]args ){
                InputStreamReader isr = new InputStreamReader( System.in) ;
                BufferedReader br = new BufferedReader( isr ) ;
                for( int i=0 ; i<10 ; i++ ){
                        System.out.println( "In Loop" ) ;
                        Thread.sleep( 5000 ) ;
                }
        }
}                                                                                         
									