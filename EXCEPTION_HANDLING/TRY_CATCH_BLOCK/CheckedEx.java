
import java.io.*;
class CheckedEx{
        public static void main( String[]args ){
                InputStreamReader isr = new InputStreamReader( System.in) ;
                BufferedReader br = new BufferedReader( isr ) ;
                for( int i=0 ; i<10 ; i++ ){
                        System.out.println( "In Loop" ) ;
                        try{
                            Thread.sleep( 5000 ) ;
                        }catch( IOException obj ){          
							
                        }
                }
        }
}
