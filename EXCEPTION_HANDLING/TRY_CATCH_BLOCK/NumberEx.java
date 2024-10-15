
import java.io.*;
class NumberEx{
        public static void main( String[]args )throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader( System.in)) ;
				
                String str1 = br.readLine() ;
                System.out.println( str1 ) ;
				
                int num = Integer.parseInt( br.readLine()) ;
                System.out.println( num ) ;
        }
}